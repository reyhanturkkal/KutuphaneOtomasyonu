package View;


import Controller.KitapIslemleri;
import Controller.Kitap;
import Controller.EkranIslemContext;
import Controller.PersonelEkranOrtakIslemler;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author pelinustunel
 */
public class KitapEkrani extends javax.swing.JDialog implements PersonelEkranOrtakIslemler{

    DefaultTableModel model;
    KitapIslemleri islemler = new KitapIslemleri();
   
    
    /**
     * Creates new form KitapEkrani
     */
    public KitapEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) kitap_tablosu.getModel();
        kitapGoruntule();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        kitap_tablosu = new javax.swing.JTable();
        arama_cubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ad_alani = new javax.swing.JTextField();
        yazar_alani = new javax.swing.JTextField();
        sayfa_alani = new javax.swing.JTextField();
        kategori_alani = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        kitapekle = new javax.swing.JButton();
        guncelle = new javax.swing.JButton();
        sil = new javax.swing.JButton();
        geriDon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kitap_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "book_id", "name", "author", "page", "category_name", "added_by_user"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            kitap_tablosu.getColumnModel().getColumn(5).setResizable(false);
        }

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel1.setText("Kitap Adı:");

        jLabel2.setText("Kitabın Yazarı:");

        jLabel3.setText("Sayfa Sayısı:");

        jLabel4.setText("Kitabın Kategorisi:");

        mesaj_yazisi.setForeground(new java.awt.Color(255, 102, 102));

        kitapekle.setText("Kitap Ekle");
        kitapekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitapekleActionPerformed(evt);
            }
        });

        guncelle.setText("Kitap Güncelle");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });

        sil.setText("Kitap Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        geriDon.setText("Geri Dön");
        geriDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriDonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arama_cubugu)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mesaj_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ad_alani)
                                    .addComponent(yazar_alani)
                                    .addComponent(sayfa_alani)
                                    .addComponent(kategori_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))))
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kitapekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(geriDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kitapekle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(yazar_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncelle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sayfa_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(geriDon)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(kategori_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(mesaj_yazisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**/
    
    // Kitap Filtreleme ve Arama
    public void dinamikAra(String ara){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model); 
        
        kitap_tablosu.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
        
    }  
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        
        String ara = arama_cubugu.getText();
        dinamikAra(ara);
        
    }//GEN-LAST:event_arama_cubuguKeyReleased

    // Kitap Eklemek için Buton
    private void kitapekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitapekleActionPerformed
        
        mesaj_yazisi.setText("");
        
        String name = ad_alani.getText();
        String author = yazar_alani.getText();
        String page = sayfa_alani.getText();
        String category_name = kategori_alani.getText();
        
        islemler.kitapEkle(name,author,page,category_name);
        kitapGoruntule();
        mesaj_yazisi.setText("Yeni Kitap Eklendi");
                
        
    }//GEN-LAST:event_kitapekleActionPerformed

    // Kitabın Bilgilerini Güncellemek için tablodaki isme tıklamaya yarayacak
    private void kitap_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kitap_tablosuMouseClicked
        
        int selectedrow = kitap_tablosu.getSelectedRow();
        ad_alani .setText(model.getValueAt(selectedrow,1).toString());
        yazar_alani .setText(model.getValueAt(selectedrow,2).toString());
        sayfa_alani .setText(model.getValueAt(selectedrow,3).toString());
        kategori_alani .setText(model.getValueAt(selectedrow,4).toString());
        
        
    }//GEN-LAST:event_kitap_tablosuMouseClicked

    // Kitap Güncellemek için seçilen kitabın bilgilerini text field lardan alma
    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
       
        String name = ad_alani.getText();
        String author = yazar_alani.getText();
        String page = sayfa_alani.getText();
        String category_name = kategori_alani.getText();
        
        int selectedrow = kitap_tablosu.getSelectedRow();
        
        // Kitap listeden silinmezse onun kontrolünü yapıyor
        if (selectedrow == -1) {
            
            if(model.getRowCount() == 0) {
                
                mesaj_yazisi.setText("Kitap Tablosu şu anda boş");     
            } else {
                
                 mesaj_yazisi.setText("Güncellemek istediğiniz kitabı seçmediğiniz için işlem yapılamamaktadır"); 
            }  
        } else {
            
            int book_id = (int) model.getValueAt(selectedrow, 0);
            
            islemler.kitapGuncelle(book_id,name,author,page,category_name);
            kitapGoruntule();
            mesaj_yazisi.setText("Kitap başarıyla güncellendi.");
        }
        
        
    }//GEN-LAST:event_guncelleActionPerformed

    // Kitabı silmek için mouse ile seçilen kitabın id 'sini alma
    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        
        mesaj_yazisi.setText("");
        
        int selectedrow = kitap_tablosu.getSelectedRow();
        
        if (selectedrow == -1){
            
            if (model.getRowCount() == 0){
                
                mesaj_yazisi.setText("Kitap Tablosu şu anda boş");   
            } else {
                mesaj_yazisi.setText("Lütfen silmek istediğiniz kitabı seçiniz..."); 
            } 
        } else {
            
            int book_id = (int) model.getValueAt(selectedrow,0);
            
            islemler.kitapSil(book_id);
            kitapGoruntule();
            mesaj_yazisi.setText("Kitap başarıyla silindi.");
            
            
        } 
    }//GEN-LAST:event_silActionPerformed

    public void geriDonEkran(){
        PersonelAraEkran araEkran = new PersonelAraEkran();
        setVisible(false);
        araEkran.setVisible(true);
    }
    
    private void geriDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriDonMouseClicked
        geriDonEkran();
    }//GEN-LAST:event_geriDonMouseClicked

    
    /**
     * @param args the command line arguments
     */
    
    // Kitap tablosunun Görüntülenmesi
    public void kitapGoruntule(){
        
        model.setRowCount(0);
        ArrayList<Kitap> kitaplar = new ArrayList<Kitap>();
        
        EkranIslemContext kitaplariGetir = new EkranIslemContext(islemler);
        kitaplar = kitaplariGetir.calistirStrategy();
        
        if(kitaplar != null) {
            
            for(Kitap kitap : kitaplar) {
                Object[] eklenecek = {kitap.getBook_id(),kitap.getName(),kitap.getAuthor(),kitap.getPage(),kitap.getCategory_name(),kitap.getAdded_by_user()};
                model.addRow(eklenecek);
            }
            
        }
        
        
    }
    
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
            java.util.logging.Logger.getLogger(KitapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KitapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KitapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KitapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KitapEkrani dialog = new KitapEkrani(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField ad_alani;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JButton geriDon;
    private javax.swing.JButton guncelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField kategori_alani;
    private javax.swing.JTable kitap_tablosu;
    private javax.swing.JButton kitapekle;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextField sayfa_alani;
    private javax.swing.JButton sil;
    private javax.swing.JTextField yazar_alani;
    // End of variables declaration//GEN-END:variables
}
