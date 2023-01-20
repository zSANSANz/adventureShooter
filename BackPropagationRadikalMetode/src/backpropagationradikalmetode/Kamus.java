/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backpropagationradikalmetode;

import backpropagationradikalmetode.utility.jdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andri
 */
public class Kamus extends javax.swing.JPanel {
    private static DefaultTableModel tblDokumen;
    
    /**
     * Creates new form Pelatihan
     */
    public Kamus() throws SQLException {
        initComponents();
        
        //tblDokumen.setVisible(false);
        LblDokumen.setVisible(false);
        tblDokumen = new DefaultTableModel();
        TblDokumen.setModel(tblDokumen);
        tblDokumen.addColumn("kata");
        
        String sqlSelectTokenisasi = "SELECT * FROM tb_kata";
        Statement stTokenisasi = (Statement) jdbc.getConnection().createStatement();
        ResultSet rsTokenisasi = stTokenisasi.executeQuery(sqlSelectTokenisasi);

        tblDokumen.getDataVector().removeAllElements();
        tblDokumen.fireTableDataChanged();
        while (rsTokenisasi.next()) {
            Object[] oTokenisasi = new Object[1];
            oTokenisasi[0] = rsTokenisasi.getString("nama_kata");
           
            tblDokumen.addRow(oTokenisasi);
        }

        
        cmbJenisKata.addItem("Kata Benda Positif");
        cmbJenisKata.addItem("Kata Benda Negatif");
        cmbJenisKata.addItem("Kata Sifat Positif");
        cmbJenisKata.addItem("Kata Sifat Negatif");
        cmbJenisKata.addItem("Kata Kerja Positif");
        cmbJenisKata.addItem("Kata Kerja Negatif");
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtIsi = new javax.swing.JTextArea();
        cmdTambah = new javax.swing.JButton();
        cmdClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmdCari = new javax.swing.JButton();
        cmbJenisKata = new javax.swing.JComboBox();
        jScrollPane7 = new javax.swing.JScrollPane();
        TblDokumen = new javax.swing.JTable();
        LblDokumen = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        txtIsi.setColumns(20);
        txtIsi.setRows(5);
        jScrollPane1.setViewportView(txtIsi);

        cmdTambah.setText("Tambahkan");
        cmdTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTambahActionPerformed(evt);
            }
        });

        cmdClear.setText("Clear");
        cmdClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClearActionPerformed(evt);
            }
        });

        jLabel1.setText("Jenis Kata :");

        jLabel2.setText("Isi :");

        cmdCari.setText("Cari");
        cmdCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCariActionPerformed(evt);
            }
        });

        TblDokumen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(TblDokumen);

        LblDokumen.setText("DOKUMEN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(cmbJenisKata, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(cmdCari, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(395, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LblDokumen)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(307, 307, 307))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(cmdClear, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cmdTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(119, 119, 119)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCari)
                    .addComponent(cmbJenisKata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblDokumen)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmdClear)
                        .addComponent(cmdTambah))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCariActionPerformed
        String sqlSelectTokenisasi = null;
                
        if (cmbJenisKata.getSelectedItem().toString().equals("Kata Benda Positif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='benda' AND nilai_kata='1'";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Benda Negatif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='benda' AND nilai_kata='0'";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Sifat Positif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='sifat' AND nilai_kata='1'";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Sifat Negatif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='sifat' AND nilai_kata='0'";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Kerja Positif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='kerja' AND nilai_kata='1'";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Kerja Negatif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='kerja' AND nilai_kata='0'";
        } 
        
        try {
            
            Statement stTokenisasi = (Statement) jdbc.getConnection().createStatement();
            ResultSet rsTokenisasi = stTokenisasi.executeQuery(sqlSelectTokenisasi);
            
            tblDokumen.getDataVector().removeAllElements();
            tblDokumen.fireTableDataChanged();
            while (rsTokenisasi.next()) {
                Object[] oTokenisasi = new Object[1];
                oTokenisasi[0] = rsTokenisasi.getString("nama_kata");
                
                tblDokumen.addRow(oTokenisasi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Kamus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdCariActionPerformed

    private void cmdTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTambahActionPerformed
        String sqlInsertKata = null;
                
        if (cmbJenisKata.getSelectedItem().toString().equals("Kata Benda Positif")) {
        sqlInsertKata = "INSERT INTO tb_kata(id_kata, nama_kata, tipe_kata, nilai_kata) "
                + "VALUES(NULL, '" + txtIsi.getText() + "', 'benda', 1)";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Benda Negatif")) {
            sqlInsertKata = "INSERT INTO tb_kata(id_kata, nama_kata, tipe_kata, nilai_kata) "
                + "VALUES(NULL, '" + txtIsi.getText() + "', 'benda', 0)";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Sifat Positif")) {
            sqlInsertKata = "INSERT INTO tb_kata(id_kata, nama_kata, tipe_kata, nilai_kata) "
                + "VALUES(NULL, '" + txtIsi.getText() + "', 'sifat', 1)";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Sifat Negatif")) {
            sqlInsertKata = "INSERT INTO tb_kata(id_kata, nama_kata, tipe_kata, nilai_kata) "
                + "VALUES(NULL, '" + txtIsi.getText() + "', 'sifat', 0)";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Kerja Positif")) {
            sqlInsertKata = "INSERT INTO tb_kata(id_kata, nama_kata, tipe_kata, nilai_kata) "
                + "VALUES(NULL, '" + txtIsi.getText() + "', 'kerja', 1)";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Kerja Negatif")) {
            sqlInsertKata = "INSERT INTO tb_kata(id_kata, nama_kata, tipe_kata, nilai_kata) "
                + "VALUES(NULL, '" + txtIsi.getText() + "', 'kerja', 0)";
        } 
        
        Statement st;
        try {
            st = (Statement) jdbc.getConnection().createStatement();
            st.executeUpdate(sqlInsertKata);
        } catch (SQLException ex) {
            Logger.getLogger(Kamus.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                String sqlSelectTokenisasi = null;
                
        if (cmbJenisKata.getSelectedItem().toString().equals("Kata Benda Positif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='benda' AND nilai_kata='1'";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Benda Negatif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='benda' AND nilai_kata='0'";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Sifat Positif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='sifat' AND nilai_kata='1'";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Sifat Negatif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='sifat' AND nilai_kata='0'";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Kerja Positif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='kerja' AND nilai_kata='1'";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Kerja Negatif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='kerja' AND nilai_kata='0'";
        } 
        
        try {
            
            Statement stTokenisasi = (Statement) jdbc.getConnection().createStatement();
            ResultSet rsTokenisasi = stTokenisasi.executeQuery(sqlSelectTokenisasi);
            
            tblDokumen.getDataVector().removeAllElements();
            tblDokumen.fireTableDataChanged();
            while (rsTokenisasi.next()) {
                Object[] oTokenisasi = new Object[1];
                oTokenisasi[0] = rsTokenisasi.getString("nama_kata");
                
                tblDokumen.addRow(oTokenisasi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Kamus.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        txtIsi.setText("");
    }//GEN-LAST:event_cmdTambahActionPerformed

    private void cmdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClearActionPerformed
        txtIsi.setText("");
                String sqlSelectTokenisasi = null;
                
        if (cmbJenisKata.getSelectedItem().toString().equals("Kata Benda Positif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='benda' AND nilai_kata='1'";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Benda Negatif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='benda' AND nilai_kata='0'";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Sifat Positif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='sifat' AND nilai_kata='1'";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Sifat Negatif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='sifat' AND nilai_kata='0'";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Kerja Positif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='kerja' AND nilai_kata='1'";
        } else if (cmbJenisKata.getSelectedItem().toString().equals("Kata Kerja Negatif")) {
            sqlSelectTokenisasi = "SELECT * FROM tb_kata WHERE tipe_kata='kerja' AND nilai_kata='0'";
        } 
        
        try {
            
            Statement stTokenisasi = (Statement) jdbc.getConnection().createStatement();
            ResultSet rsTokenisasi = stTokenisasi.executeQuery(sqlSelectTokenisasi);
            
            tblDokumen.getDataVector().removeAllElements();
            tblDokumen.fireTableDataChanged();
            while (rsTokenisasi.next()) {
                Object[] oTokenisasi = new Object[1];
                oTokenisasi[0] = rsTokenisasi.getString("nama_kata");
                
                tblDokumen.addRow(oTokenisasi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Kamus.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cmdClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblDokumen;
    private javax.swing.JTable TblDokumen;
    private javax.swing.JComboBox cmbJenisKata;
    private javax.swing.JButton cmdCari;
    private javax.swing.JButton cmdClear;
    private javax.swing.JButton cmdTambah;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea txtIsi;
    // End of variables declaration//GEN-END:variables
}
