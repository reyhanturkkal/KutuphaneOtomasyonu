package View;


import Controller.OduncIslemleri;
import Controller.Kitap;
import Controller.Uyeler;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author pelinustunel
 */
public class OduncAlmaEkrani extends javax.swing.JDialog {

    DefaultTableModel kitapModel;
    DefaultTableModel uyeModel;
    OduncIslemleri kitapislemler = new OduncIslemleri();
    OduncIslemleri uyeislemler = new OduncIslemleri();
    
     
    /**
     * Creates new form OduncAlmaEkrani
     */
    public OduncAlmaEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        kitapModel = (DefaultTableModel) kitap_tablosu.getModel();
        uyeModel = (DefaultTableModel) kullanici_tablosu.getModel();
        kitapGoruntuleWithoutLoans();
        uyeleriGoruntule();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kitap_adi_alani = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ogrenci_adi_alani = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        alinan_tarih_alani = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        teslim_tarih_alani = new javax.swing.JTextField();
        onayla = new javax.swing.JButton();
        geri_don = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        kitap_tablosu = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        kullanici_tablosu = new javax.swing.JTable();
        mesaj_yazisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ödünç Alma");

        jLabel2.setText("Kitap Alanı");

        jLabel3.setText("Öğrenci Alanı");

        jLabel4.setText("Kitap Adı");

        jLabel5.setText("Öğrenci Adı:");

        jLabel6.setText("Alınan Tarih:");

        jLabel7.setText("Teslim Tarih:");

        onayla.setText("Onayla");
        onayla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onaylaActionPerformed(evt);
            }
        });

        geri_don.setText("Geri Dön");
        geri_don.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geri_donMouseClicked(evt);
            }
        });

        kitap_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "book_id", "name", "author", "page", "category_name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kitap_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kitap_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kitap_tablosu);
        if (kitap_tablosu.getColumnModel().getColumnCount() > 0) {
            kitap_tablosu.getColumnModel().getColumn(0).setResizable(false);
            kitap_tablosu.getColumnModel().getColumn(1).setResizable(false);
            kitap_tablosu.getColumnModel().getColumn(2).setResizable(false);
            kitap_tablosu.getColumnModel().getColumn(3).setResizable(false);
            kitap_tablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        kullanici_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "user_id", "username", "user_type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kullanici_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullanici_tablosuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(kullanici_tablosu);
        if (kullanici_tablosu.getColumnModel().getColumnCount() > 0) {
            kullanici_tablosu.getColumnModel().getColumn(0).setResizable(false);
            kullanici_tablosu.getColumnModel().getColumn(1).setResizable(false);
            kullanici_tablosu.getColumnModel().getColumn(2).setResizable(false);
        }

        mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(394, 394, 394)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ogrenci_adi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(alinan_tarih_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(teslim_tarih_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(onayla)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(geri_don))))
                                    .addComponent(jLabel7)
                                    .addComponent(mesaj_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kitap_adi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kitap_adi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(ogrenci_adi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(alinan_tarih_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(teslim_tarih_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onayla)
                    .addComponent(geri_don))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(mesaj_yazisi)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onaylaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onaylaActionPerformed
       mesaj_yazisi.setText("");
    
    try {
        int selectedBookIndex = kitap_tablosu.getSelectedRow();
        int selectedUserIndex = kullanici_tablosu.getSelectedRow();

        if (selectedBookIndex == -1 || selectedUserIndex == -1) {
            mesaj_yazisi.setText("Lütfen bir kitap ve bir öğrenci seçin.");
            return;
        }

        int bookId = (int) kitapModel.getValueAt(selectedBookIndex, 0);
        int userId = (int) uyeModel.getValueAt(selectedUserIndex, 0);

        String alinanTarih = alinan_tarih_alani.getText();
        String teslimTarih = teslim_tarih_alani.getText();

        kitapislemler.oduncEkle(bookId, userId, alinanTarih, teslimTarih);
        kitapGoruntule();
        mesaj_yazisi.setText("Ödünç işleminiz başarılı");
    } catch (NumberFormatException ex) {
        ex.printStackTrace();
        mesaj_yazisi.setText("Hata: Kitap ID ve Öğrenci ID sayısal olmalıdır.");
    }
         kitapGoruntuleWithoutLoans();
        
    }//GEN-LAST:event_onaylaActionPerformed

    private void kitap_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kitap_tablosuMouseClicked
        int selectedrow = kitap_tablosu.getSelectedRow();
        kitap_adi_alani .setText(kitapModel.getValueAt(selectedrow,1).toString());
    }//GEN-LAST:event_kitap_tablosuMouseClicked

    private void kullanici_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullanici_tablosuMouseClicked
        int selectedrow = kullanici_tablosu.getSelectedRow();
        ogrenci_adi_alani .setText(uyeModel.getValueAt(selectedrow,1).toString());
    }//GEN-LAST:event_kullanici_tablosuMouseClicked

    
    public void geriDonEkran(){
        PersonelAraEkran araEkran = new PersonelAraEkran();
        setVisible(false);
        araEkran.setVisible(true);
    }
    
    private void geri_donMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geri_donMouseClicked
        geriDonEkran();
    }//GEN-LAST:event_geri_donMouseClicked

    
     // Kitap tablosunun Görüntülenmesi
    public void kitapGoruntule() {
        kitapModel.setRowCount(0);
        ArrayList<Kitap> kitaplar = kitapislemler.kitaplariGetir();
        if (kitaplar != null) {
            for (Kitap kitap : kitaplar) {
                Object[] eklenecek = { kitap.getBook_id(), kitap.getName(), kitap.getAuthor(), kitap.getPage(), kitap.getCategory_name() };
                kitapModel.addRow(eklenecek);
            }
        }
    }
    // Kitap tablosunun Uyeler ile Görüntülenmesi
    public void kitapGoruntuleWithoutLoans() {
    kitapModel.setRowCount(0);
    ArrayList<Kitap> kitaplar = kitapislemler.kitaplariGetirWithoutLoans();
    if (kitaplar != null) {
        for (Kitap kitap : kitaplar) {
            Object[] eklenecek = { kitap.getBook_id(), kitap.getName(), kitap.getAuthor(), kitap.getPage(), kitap.getCategory_name() };
            kitapModel.addRow(eklenecek);
        }
    }
}
    
  // Üyeler tablosunun Görüntülenmesi
    public void uyeleriGoruntule() {
        uyeModel.setRowCount(0);
        ArrayList<Uyeler> uye = uyeislemler.uyeleriGetir();
        if (uye != null) {
            for (Uyeler uyeler : uye) {
                Object[] eklenecek1 = { uyeler.getUser_id(), uyeler.getUsername(), uyeler.getUserType(), uyeler.getTelefon(), uyeler.getEmail() };
                uyeModel.addRow(eklenecek1);
            }
        }
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OduncAlmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OduncAlmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OduncAlmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OduncAlmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OduncAlmaEkrani dialog = new OduncAlmaEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alinan_tarih_alani;
    private javax.swing.JButton geri_don;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kitap_adi_alani;
    private javax.swing.JTable kitap_tablosu;
    private javax.swing.JTable kullanici_tablosu;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextField ogrenci_adi_alani;
    private javax.swing.JButton onayla;
    private javax.swing.JTextField teslim_tarih_alani;
    // End of variables declaration//GEN-END:variables
}