package Controller;

import Model.Aplikasi;
import Model.Barang;
import Model.Pemesanan;
import View.MenuPemesanan;
import View.MenuUtama;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControllerPemesanan {
    private MenuPemesanan frame;
    private ArrayList<Barang> lb;
    private ArrayList<Pemesanan> lp;
    private Aplikasi app;
    
    public ControllerPemesanan(MenuPemesanan frame) {
        this.frame = frame;
        app = new Aplikasi();
        lb = app.getAllBarang();
        lp = app.getAllPesanan();
    }
    
    public void reset() {
        frame.getjTextField1().setText("");
        frame.getjTextField2().setText("");
        frame.getTextNama().setText("");
        frame.getTextHarga().setText("");
        frame.getTextJumlah().setText("");
    }
    
    public void insertPesanan() {
        
    }
    // gas mizan
    public void fillTable() {
        lb = app.getAllBarang();
        
    }
    // mantap mizan
    public void fillTextField() {
    
    }
    
    public void deletePesanan() {
        if (!frame.getTextNama().getText().trim().isEmpty()) {
            String s = frame.getTextNama().getText();
            app.hapusBarang(s);
            JOptionPane.showMessageDialog(null, "data barang dihapus");
        } else {
            JOptionPane.showMessageDialog(null, "data barang gagal dihapus");
        }
    }
    
    public void updatePesanan() {
        if (!frame.getTextNama().getText().trim().isEmpty()) {
            String nama = frame.getTextNama().getText();
            int jumlah = Integer.valueOf(frame.getTextJumlah().getText());
            int harga = Integer.valueOf(frame.getTextHarga().getText());
            try {
                app.updateBarang(nama, jumlah, harga);
                JOptionPane.showMessageDialog(null, "data barang berhasil diupdate");
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "data barang gagal diupdate");
        }
    }
    
    // liatin mizan
    public void searchNamaBarang() {
        if (!frame.getjTextField1().getText().trim().isEmpty()) {
            
        } else {
            JOptionPane.showMessageDialog(null, "data tidak ditemukan");
        }
    }
    public void searchNamaPesanan() {
        if (!frame.getjTextField2().getText().trim().isEmpty()) {
            
        } else {
            JOptionPane.showMessageDialog(null, "data tidak ditemukan");
        }
    }
}
