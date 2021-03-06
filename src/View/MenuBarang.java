/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Mizan Saputro
 */
public class MenuBarang extends javax.swing.JFrame {

    /**
     * Creates new form MenuBarang
     */
    public MenuBarang() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Menu Barang");    
    }

    public void addListener(ActionListener ae){
        tambahBarang.addActionListener(ae);
        cariBarang.addActionListener(ae);
        lihatBarang.addActionListener(ae);
        hapusBarang.addActionListener(ae);
        mainMenu.addActionListener(ae);
    }    
    public JButton getCaribarang() {
        return cariBarang;
    }

    public JButton getHapusbarang() {
        return hapusBarang;
    }

    public JButton getLihatbarang() {
        return lihatBarang;
    }

    public JButton getMainmenu() {
        return mainMenu;
    }

    public JButton getTambahbarang() {
        return tambahBarang;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public JTextField getTextBerat() {
        return textBerat;
    }

    public void setTextBerat(JTextField textBerat) {
        this.textBerat = textBerat;
    }

    public JTextField getTextHarga() {
        return textHarga;
    }

    public void setTextHarga(JTextField textHarga) {
        this.textHarga = textHarga;
    }

    public JTextField getTextJumlah() {
        return textJumlah;
    }

    public void setTextJumlah(JTextField textJumlah) {
        this.textJumlah = textJumlah;
    }

    public JTextField getTextNama() {
        return textNama;
    }

    public void setTextNama(JTextField textNama) {
        this.textNama = textNama;
    }

    public ButtonGroup getBG_KategoriBarang() {
        return BG_KategoriBarang;
    }

    public void setBG_KategoriBarang(ButtonGroup BG_KategoriBarang) {
        this.BG_KategoriBarang = BG_KategoriBarang;
    }

    public JRadioButton getButtonFurniture() {
        return buttonFurniture;
    }

    public void setButtonFurniture(JRadioButton buttonFurniture) {
        this.buttonFurniture = buttonFurniture;
    }

    public JRadioButton getButtonKaca() {
        return buttonKaca;
    }

    public void setButtonKaca(JRadioButton buttonKaca) {
        this.buttonKaca = buttonKaca;
    }

    public JRadioButton getButtonPerhiasan() {
        return buttonPerhiasan;
    }

    public void setButtonPerhiasan(JRadioButton buttonPerhiasan) {
        this.buttonPerhiasan = buttonPerhiasan;
    }

    public JButton getCariBarang() {
        return cariBarang;
    }

    public void setCariBarang(JButton cariBarang) {
        this.cariBarang = cariBarang;
    }

    public JButton getHapusBarang() {
        return hapusBarang;
    }

    public void setHapusBarang(JButton hapusBarang) {
        this.hapusBarang = hapusBarang;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public JButton getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(JButton mainMenu) {
        this.mainMenu = mainMenu;
    }

    public JButton getTambahBarang() {
        return tambahBarang;
    }

    public void setTambahBarang(JButton tambahBarang) {
        this.tambahBarang = tambahBarang;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_KategoriBarang = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        tambahBarang = new javax.swing.JButton();
        cariBarang = new javax.swing.JButton();
        hapusBarang = new javax.swing.JButton();
        mainMenu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textHarga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textJumlah = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textBerat = new javax.swing.JTextField();
        buttonFurniture = new javax.swing.JRadioButton();
        buttonKaca = new javax.swing.JRadioButton();
        buttonPerhiasan = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jLabel1.setText("MENU BARANG");

        tambahBarang.setText("Tambah Barang");
        tambahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBarangActionPerformed(evt);
            }
        });

        cariBarang.setText("Cari Barang");
        cariBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariBarangActionPerformed(evt);
            }
        });

        hapusBarang.setText("Hapus Barang");
        hapusBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBarangActionPerformed(evt);
            }
        });

        mainMenu.setText("Menu Utama");
        mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Kategori", "Harga", "Jumlah", "Berat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel5.setText("Harga   :");

        textHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textHargaActionPerformed(evt);
            }
        });

        jLabel6.setText("Jumlah :");

        textJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textJumlahActionPerformed(evt);
            }
        });

        jLabel7.setText("Berat    :");

        jLabel3.setText("Kategori :");

        textBerat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBeratActionPerformed(evt);
            }
        });

        BG_KategoriBarang.add(buttonFurniture);
        buttonFurniture.setText("Perabotan");
        buttonFurniture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFurnitureActionPerformed(evt);
            }
        });

        BG_KategoriBarang.add(buttonKaca);
        buttonKaca.setText("Kaca");
        buttonKaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKacaActionPerformed(evt);
            }
        });

        BG_KategoriBarang.add(buttonPerhiasan);
        buttonPerhiasan.setText("Perhiasan");
        buttonPerhiasan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPerhiasanActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama    :");

        textNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNamaActionPerformed(evt);
            }
        });

        jButton1.setText("Perbaharui Barang");

        jButton2.setText("Batal");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(46, 46, 46)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(tambahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hapusBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jButton2)))
                        .addGap(52, 52, 52)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(15, 15, 15)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textHarga)
                                    .addComponent(textNama)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(17, 17, 17)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textJumlah)
                                    .addComponent(textBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonKaca)
                                    .addComponent(buttonFurniture)
                                    .addComponent(buttonPerhiasan))
                                .addGap(153, 153, 153))))
                    .addComponent(cariBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(497, 497, 497))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(514, 514, 514))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cariBarang))
                .addGap(18, 64, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(buttonFurniture)))
                                    .addComponent(tambahBarang, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(buttonKaca)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonPerhiasan))))
                            .addComponent(hapusBarang))
                        .addGap(21, 21, 21)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(textBerat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(mainMenu)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahBarangActionPerformed

    private void cariBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariBarangActionPerformed

    private void hapusBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hapusBarangActionPerformed

    private void mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainMenuActionPerformed

    private void textHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textHargaActionPerformed

    private void textJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textJumlahActionPerformed

    private void textBeratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBeratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBeratActionPerformed

    private void buttonFurnitureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFurnitureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFurnitureActionPerformed

    private void buttonKacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonKacaActionPerformed

    private void buttonPerhiasanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPerhiasanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPerhiasanActionPerformed

    private void textNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNamaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG_KategoriBarang;
    private javax.swing.JRadioButton buttonFurniture;
    private javax.swing.JRadioButton buttonKaca;
    private javax.swing.JRadioButton buttonPerhiasan;
    private javax.swing.JButton cariBarang;
    private javax.swing.JButton hapusBarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton mainMenu;
    private javax.swing.JButton tambahBarang;
    private javax.swing.JTextField textBerat;
    private javax.swing.JTextField textHarga;
    private javax.swing.JTextField textJumlah;
    private javax.swing.JTextField textNama;
    // End of variables declaration//GEN-END:variables
}
