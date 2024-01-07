package View;

import Controller.UyeOlKomut;
import Controller.GirisYapKomut;
import Controller.ButonKomutlar;
import Controller.GirisEkrani;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pelinustunel
 */
public class TemelAnaGiris extends javax.swing.JFrame implements GirisEkrani{

    ButonKomutlar butonKomutlar = new ButonKomutlar();
    
    GirisYapKomut girisYapKomut = new GirisYapKomut(butonKomutlar);
    UyeOlKomut uyeOlKomut = new UyeOlKomut(butonKomutlar);
    
    public TemelAnaGiris() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code"> 

    private void initComponents() {

        temelGiris = new javax.swing.JButton();
        temelUyeOl = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        temelGiris.setText("Giriş Yap");
        temelGiris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                temelGirisMouseClicked(evt);
            }
        });

        temelUyeOl.setText("Üye Ol");
        temelUyeOl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                temelUyeOlMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(temelGiris)
                .addGap(72, 72, 72)
                .addComponent(temelUyeOl)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temelGiris)
                    .addComponent(temelUyeOl))
                .addGap(133, 133, 133))
        );

        pack();
    }// </editor-fold>                                                 

    private void temelGirisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temelGirisMouseClicked
        
        girisYapKomut.execute();
        butonKomutlar.VisibleGiris();
        setVisible(false);
        
    }//GEN-LAST:event_temelGirisMouseClicked

    private void temelUyeOlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temelUyeOlMouseClicked
        
        uyeOlKomut.execute();
         butonKomutlar.VisibleUye();
        setVisible(false);
      
       
    }//GEN-LAST:event_temelUyeOlMouseClicked

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
            java.util.logging.Logger.getLogger(TemelAnaGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemelAnaGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemelAnaGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemelAnaGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemelAnaGiris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton temelGiris;
    private javax.swing.JButton temelUyeOl;
    // End of variables declaration//GEN-END:variables
}
