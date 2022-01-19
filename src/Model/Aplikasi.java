/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Database.Database;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Mizan Saputro
 */
public class Aplikasi {
    public ArrayList<Barang> daftarBarang;
    private ArrayList<Cash> daftarTunai;
    private ArrayList<Digital> daftarDigital;
    public ArrayList<Pemesanan> daftarPemesanan;
    private int nBarang;
    private int nTunai;
    private int nDigital;
    private int nPemesanan;
    private Database con;
    public Aplikasi(){
        this.daftarBarang = new ArrayList<>();
        this.daftarTunai = new ArrayList<>();
        this.daftarDigital = new ArrayList<>();
        this.daftarPemesanan= new ArrayList<>();
        this.nBarang = 0;
        this.nTunai = 0;
        this.nDigital = 0;
        this.nPemesanan = 0;
        this.con = new Database();
        this.con.connect();
    }
    public void addBarang(String nama, int harga, int jumlah, float berat, 
        float panjang,float lebar, float tinggi){
	Barang b = new Furniture(nama,harga,jumlah,berat,panjang,lebar,tinggi);
        this.daftarBarang.add(b);
        this.nBarang++;
        this.con.saveBarang(b);
    }
    public void addBarang(String nama, int harga, int jumlah, float berat, float ketebalan){
	Barang b = new Kaca(nama,harga,jumlah,berat,ketebalan);
        this.daftarBarang.add(b);
        this.nBarang++;
        this.con.saveBarang(b);
    }
    public void addBarang(String nama, int harga, int jumlah, float berat, String jenis){
	Barang b = new Perhiasan(nama,harga,jumlah,berat,jenis);
        this.daftarBarang.add(b);
        this.nBarang++;
        this.con.saveBarang(b);
    }
    public Barang cariBarang(String nama){
        return con.getBarang(nama);
        
    }
    public void updateBarang(String nama, int jumlah, int harga) throws ParseException{
        for (Pemesanan o: daftarPemesanan){
            for (Barang j  :o.getPesanan()){
                if (nama.equals(j.getNama()) && con.setPemesanan(o.getPemesan().getId(), o.getPemesan().getNama())!=null
                        && o.getStatus()==false){
                    o.updatePesanan(j,harga);
                }
                j.setHarga(harga);
                con.updateBarang(o.getPemesan().getId(), o.getPemesan().getNama(), nama, jumlah, harga);
            }
        }
        
        if (con.getBarang(nama)!=null){
            con.updateBarang(nama,jumlah,harga);
        }
    }
    public void hapusBarang(String nama){
        if (cariBarang(nama)!=null){
            for(int i = 0; i<nBarang; i++){
                if(daftarBarang.get(i).getNama().equals(nama)){
                    con.hapusBarang(nama);
                    this.daftarBarang.remove(i);
                }
            }
            this.nBarang--;
        }
    }
    public String lihatBarang(){
        return con.getListBarang();
    }
    
    public void tambahPemesanan(int id_pemesan, String nama_pemesan, Barang b){
        Pelanggan pel = new Pelanggan(nama_pemesan,id_pemesan);
        Pemesanan pem = new Pemesanan(pel);
        boolean cek = false;
        for (Pemesanan o: daftarPemesanan){
            if (o.getPemesan().getId()==id_pemesan){
                Barang a = con.getBarang(b.getNama());
                if (a!=null){
                    o.addPesanan(b);
                    cek = true;
                    break;
                }else{
                    break;
                }
            }
        }
        if (cek==false){
            this.daftarPemesanan.add(pem);
            pem.addPesanan(b);
            this.nPemesanan++;
        }
        this.con.tambahPemesanan(id_pemesan, nama_pemesan, b);
        con.updateBarang(b.getNama(), b.getJumlah()-1, b.getHarga());
    }
    public Pemesanan cariPemesanan(int id_pemesan, String nama_pemesan) throws ParseException{
        Pemesanan pem = null;
        if (pem!=null){
            for (Pemesanan o: daftarPemesanan){
                if (o.getPemesan().getId()==id_pemesan){
                    pem = o;
                }
            }   
        }
        if (pem == null){
            pem = con.getPemesanan(id_pemesan,nama_pemesan);
        }
        return pem;
    }
    public void hapusPemesanan(int id_pemesan,String nama_pemesan,String pesanan){
        for (Pemesanan o: daftarPemesanan){
            if (o.getPemesan().getId()==id_pemesan && o.getPemesan().getNama().equals(nama_pemesan)){
                for (Barang b: o.getPesanan()){
                    if (b.getNama().equals(pesanan)){
                        o.deletePesanan(b);
                        con.hapusPemesanan(id_pemesan, nama_pemesan, pesanan);
                        nPemesanan--;
                        break;
                    }
                }
            }
        }
    }
    public String lihatPemesanan(){
        return con.getListPemesanan();
    }
    
    public void tambahPembayaran(Pelanggan pel,String metode) throws ParseException{
        for (Pemesanan o: daftarPemesanan){
            if (o.getPemesan().getId()==pel.getId()){
                o.setStatus(true);
                if ("Tunai".equals(metode)){
                    Cash data = new Cash(o);
                    System.out.println("cek");
                    daftarTunai.add(data);
                    nTunai++;
                    con.tambahPembayaran(o.getPemesan(), o.getNominal(), metode, data.getOngkir(), data.getPpn(),0, 
                            data.getTotalbayar());
                }else if ("Digital".equals(metode)){
                    Digital data = new Digital(o);
                    daftarDigital.add(data);
                    nDigital++;
                    con.tambahPembayaran(o.getPemesan(), o.getNominal(), metode, data.getOngkir(), 0,data.getBiayaadmin(), 
                            data.getTotalbayar());
                }
            }
        }
    }
    public Cash cariPembayaranC(Pelanggan pel) throws ParseException{
        Cash c = null;
        for (Cash o: daftarTunai  ){
            if (o.getKeranjang().getPemesan().getId()==pel.getId()){
                    c = o;
            }
        }
        if (c == null){
            c = con.getPembayaranC(pel.getId(),pel.getNama());
        }
        return c;
    }
    public Digital cariPembayaranD(Pelanggan pel) throws ParseException{
        for (Digital o: daftarDigital){
            if (o.getKeranjang().getPemesan().getId()==pel.getId()){
                if (con.getPembayaranD(o.getKeranjang().getPemesan().getId(), o.getKeranjang().getPemesan().getNama())!=null){
                    return o;
                }
            }
        }
        return null;        
    }
    public void updatePembayaran(Pelanggan pel, String metode){
        for (Cash c: daftarTunai){
            if (metode.equals("Digital") && c.getKeranjang().getPemesan().getId()==pel.getId()){
                Digital d = new Digital(c.getKeranjang());
                daftarTunai.remove(c);
                nTunai--;
                daftarDigital.add(d);
                nDigital++;
                con.updatePembayaran(c, metode);
                break;
            }
        }
        for (Digital d: daftarDigital){
            if (metode.equals("Tunai") && d.getKeranjang().getPemesan().getId()==pel.getId()){
                Cash c = new Cash(d.getKeranjang());
                daftarDigital.remove(d);
                nDigital--;
                daftarTunai.add(c);
                nTunai++;
                con.updatePembayaran(d, metode);
                break;
            }
        } 
    }
    public void hapusPembayaran(Pelanggan pel){
        for (Cash c: daftarTunai){
            if (c.getKeranjang().getPemesan().getId()==pel.getId()){
                daftarTunai.remove(c);
                nTunai--;
                con.hapusPembayaran(pel.getId());
                break;
            }
        }
        for (Digital d: daftarDigital){
            if (d.getKeranjang().getPemesan().getId()==pel.getId()){
                daftarDigital.remove(d);
                nDigital--;
                con.hapusPembayaran(pel.getId());
                break;
            }
        }         
    }
    public String lihatPembayaran(){
        return con.getListPembayaran();
    }
}
