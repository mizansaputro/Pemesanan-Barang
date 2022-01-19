/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;
import Database.Database;
import Model.*;
import View.MenuUtama;
import java.text.ParseException;
/**
 *
 * @author Mizan Saputro
 */
public class Tubes_pemesananBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Aplikasi model = new Aplikasi();
        
        model.addBarang("kaca", 20000, 5, 4, 2);
        Barang b = new Kaca("kaca", 20000, 5, 4, 2);
        model.tambahPemesanan(1, "mizan", b);
        //System.out.println(model.lihatBarang());
        //System.out.println(model.lihatPemesanan());
        model.updateBarang("kaca", 7, 35000);
  //      System.out.println(model.lihatBarang());
//        System.out.println(model.lihatPemesanan());
        for (Pemesanan o: model.daftarPemesanan){
            System.out.println(o.getPemesan().getNama());
            System.out.println(o.getBanyak());
            System.out.println(o.getNominal());
            for (Barang j: o.getPesanan()){
                System.out.println(j.getNama());
                System.out.println(j.getHarga());
                System.out.println(j.getJumlah());
            }
        }
       for (Barang o: model.cariPemesanan(1, "mizan").getPesanan()){
            System.out.println(o.getNama());
        }
        model.tambahPembayaran(model.cariPemesanan(1, "mizan").getPemesan(), "Tunai");
        System.out.println(model.lihatPembayaran());
        model.updatePembayaran(model.cariPemesanan(1, "mizan").getPemesan(), "Digital");
        System.out.println(model.lihatPembayaran());
        System.out.println(model.lihatBarang());
        System.out.println(model.lihatPemesanan());
        //System.out.println(model.cariPembayaranC(model.cariPemesanan(1, "mizan").getPemesan()).getKeranjang().getPemesan().getNama());
        model.hapusPemesanan(1, "mizan", "kaca");
        model.hapusBarang("kaca");
        Pelanggan pel = new Pelanggan("mizan",1);
        Pemesanan pem = new Pemesanan(pel);
        model.hapusPembayaran(pel);
        System.out.println(model.lihatPembayaran());
        System.out.println(model.lihatBarang());
        System.out.println(model.lihatPemesanan());
        //System.out.println(cari.getNama());
        //new MenuUtama().setVisible(true);
    }
    
}
