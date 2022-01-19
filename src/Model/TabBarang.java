/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author defaultuser0
 */
public class TabBarang extends AbstractTableModel {
    ArrayList <Barang> lmb;

    public TabBarang(ArrayList<Barang> lmb) {
        this.lmb = lmb;
    }

    @Override
    public int getRowCount() {
        return lmb.size();
    }
    
    @Override
    public int getColumnCount() {
        return 6;
    }
        
    @Override
    public Object getValueAt(int row, int column) {
        switch(column) {
            case 0:
                return lmb.get(row).getId();
            case 1:
                return lmb.get(row).getNama();
            case 2:
                return lmb.get(row).getKategori();
            case 3:
                return lmb.get(row).getJurusan();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "id";
            case 1:
                return "nama";
            case 2:
                return "umur";
            case 3:
                return "jurusan";
            default:
                return null;
        }
    }
}
