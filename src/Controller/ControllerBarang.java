package Controller;

import Model.Aplikasi;
import Model.Barang;
import View.MenuBarang;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ControllerBarang {
    MenuBarang frame;
    ArrayList <Barang> lb;
    Aplikasi app;
    
    public ControllerBarang(MenuBarang frame) {
        this.frame = frame;
        app = new Aplikasi();
        lb = app.getAllBarang();
    }
    
    public void reset() {
        frame.getjTextField1().setText("");
        frame.getTextNama().setText("");
        frame.getTextHarga().setText("");
        frame.getTextJumlah().setText("");
        frame.getTextBerat().setText("");
        frame.getBG_KategoriBarang().clearSelection();
    }
    
    public void insertBarang() {
        if (!frame.getTextNama().getText().trim().isEmpty()) {
            String nama = frame.getTextNama().getText();
            int harga = Integer.valueOf(frame.getTextHarga().getText());
            int jumlah = Integer.valueOf(frame.getTextJumlah().getText());
            float berat = Float.valueOf(frame.getTextBerat().getText());
            int jenis;
            if (frame.getButtonFurniture().isSelected()) {
                app.addBarang(nama, harga, jumlah, berat, 1, 1, 1);
            } else if (frame.getButtonKaca().isSelected()) {
                app.addBarang(nama, harga, jumlah, berat, 1);
            } else if (frame.getButtonPerhiasan().isSelected()){
                app.addBarang(nama, harga, jumlah, berat, "perhiasan");
            }
            JOptionPane.showMessageDialog(null, "data barang disimpan");
        }
    }
    // gas mizan
    public void fillTable() {
        lb = app.getAllBarang();
        
    }
    // mantap mizan
    public void fillTextField() {
    
    }
    
    public void deleteBarang() {
        if (!frame.getTextNama().getText().trim().isEmpty()) {
            String s = frame.getTextNama().getText();
            app.hapusBarang(s);
            JOptionPane.showMessageDialog(null, "data barang dihapus");
        } else {
            JOptionPane.showMessageDialog(null, "data barang gagal dihapus");
        }
    }
    
    public void updateBarang() {
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
        if (!frame.getTextNama().getText().trim().isEmpty()) {
            
        } else {
            JOptionPane.showMessageDialog(null, "data tidak ditemukan");
        }
    }
}
