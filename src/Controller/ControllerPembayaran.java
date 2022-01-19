package Controller;

import Model.Aplikasi;
import Model.Pemesanan;
import View.MenuPembayaran;
import java.util.ArrayList;

public class ControllerPembayaran {
    MenuPembayaran frame;
    Aplikasi app;
    ArrayList<Pemesanan> lp;
    
    public ControllerPembayaran(MenuPembayaran frame) {
        this.frame = frame;
        app = new Aplikasi();
        lp = app.getAllPesanan();
    }
    
    public void fillTable() {
        lp = app.getAllPesanan();
        
    }
    public void fillTextField() {
        
    }
}
