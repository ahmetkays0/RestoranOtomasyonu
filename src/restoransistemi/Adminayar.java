/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoransistemi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ewnS
 */
public class Adminayar extends javax.swing.JFrame {

    
   
    public Adminayar() {
        initComponents();
        
    }
    int mouseX;
    int mouseY;
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        cikisadmin = new javax.swing.JLabel();
        girisgeri = new javax.swing.JLabel();
        userayarlar = new javax.swing.JButton();
        garosngiris = new javax.swing.JLabel();
        urunayarlar = new javax.swing.JButton();
        adminayarlar = new javax.swing.JButton();
        masaayar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adminsurukle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Girişi");
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        cikisadmin.setBackground(new java.awt.Color(204, 59, 16));
        cikisadmin.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        cikisadmin.setForeground(new java.awt.Color(255, 255, 255));
        cikisadmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cikisadmin.setText("x");
        cikisadmin.setOpaque(true);
        cikisadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikisadminMouseClicked(evt);
            }
        });

        girisgeri.setBackground(new java.awt.Color(255, 255, 255));
        girisgeri.setFont(new java.awt.Font("Gotham Narrow Bold", 0, 24)); // NOI18N
        girisgeri.setForeground(new java.awt.Color(255, 255, 255));
        girisgeri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kilitt.png"))); // NOI18N
        girisgeri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                girisgeriMouseClicked(evt);
            }
        });

        userayarlar.setBackground(new java.awt.Color(204, 59, 16));
        userayarlar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        userayarlar.setForeground(new java.awt.Color(255, 255, 255));
        userayarlar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/userkucuk.png"))); // NOI18N
        userayarlar.setText("Garson Hesap Ayarları");
        userayarlar.setBorder(null);
        userayarlar.setBorderPainted(false);
        userayarlar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        userayarlar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        userayarlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userayarlarActionPerformed(evt);
            }
        });

        garosngiris.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        garosngiris.setForeground(new java.awt.Color(204, 59, 16));
        garosngiris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/garsonkucuk.png"))); // NOI18N
        garosngiris.setText("Garson işlem sayfası");
        garosngiris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                garosngirisMouseClicked(evt);
            }
        });

        urunayarlar.setBackground(new java.awt.Color(204, 59, 16));
        urunayarlar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        urunayarlar.setForeground(new java.awt.Color(255, 255, 255));
        urunayarlar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/yemek.png"))); // NOI18N
        urunayarlar.setText("Ürün Ayarları");
        urunayarlar.setBorder(null);
        urunayarlar.setBorderPainted(false);
        urunayarlar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        urunayarlar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        urunayarlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunayarlarActionPerformed(evt);
            }
        });

        adminayarlar.setBackground(new java.awt.Color(204, 59, 16));
        adminayarlar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        adminayarlar.setForeground(new java.awt.Color(255, 255, 255));
        adminayarlar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/userkucuk.png"))); // NOI18N
        adminayarlar.setText("Admin Hesap Ayarları");
        adminayarlar.setBorder(null);
        adminayarlar.setBorderPainted(false);
        adminayarlar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        adminayarlar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        adminayarlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminayarlarActionPerformed(evt);
            }
        });

        masaayar.setBackground(new java.awt.Color(204, 59, 16));
        masaayar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        masaayar.setForeground(new java.awt.Color(255, 255, 255));
        masaayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/masakucukk.png"))); // NOI18N
        masaayar.setText("Masa Ayarları");
        masaayar.setBorder(null);
        masaayar.setBorderPainted(false);
        masaayar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        masaayar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        masaayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masaayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(garosngiris)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(userayarlar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adminayarlar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(masaayar)
                                .addComponent(urunayarlar))
                            .addGap(3, 3, 3)))
                    .addComponent(girisgeri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cikisadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {adminayarlar, masaayar, urunayarlar, userayarlar});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cikisadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(girisgeri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(urunayarlar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(masaayar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminayarlar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userayarlar)
                .addGap(30, 30, 30)
                .addComponent(garosngiris)
                .addContainerGap())
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(560, 110, 290, 360);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Gotham Narrow Light", 0, 70)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Ayarlar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 290, 240, 80);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Gotham Narrow Black", 0, 100)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Admin");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 190, 330, 120);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/arkaplan.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 950, 560);

        adminsurukle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                adminsurukleMouseDragged(evt);
            }
        });
        adminsurukle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                adminsurukleMousePressed(evt);
            }
        });
        getContentPane().add(adminsurukle);
        adminsurukle.setBounds(0, 0, 940, 29);

        setSize(new java.awt.Dimension(940, 559));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cikisadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikisadminMouseClicked
        //cıkış tuşu
       int uyarı= JOptionPane.showConfirmDialog(this,"Cıkış Yapılsın mı ?","Uyarı!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(uyarı==JOptionPane.YES_OPTION){
            System.exit(0);
        }
       
    }//GEN-LAST:event_cikisadminMouseClicked

    private void adminsurukleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminsurukleMouseDragged
       //paneli hareket ettirmek icin gerekli kod
        int kordinatX=evt.getXOnScreen();
        int kordinatY=evt.getYOnScreen();
        
        this.setLocation(kordinatX-mouseX,kordinatY-mouseY);
    }//GEN-LAST:event_adminsurukleMouseDragged

    private void adminsurukleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminsurukleMousePressed
      mouseX=evt.getX();
       mouseY=evt.getY();
    }//GEN-LAST:event_adminsurukleMousePressed

    private void girisgeriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisgeriMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Giris().setVisible(true);
            
              
    }//GEN-LAST:event_girisgeriMouseClicked

    private void masaayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masaayarActionPerformed

        new Masaayarlar().setVisible(true);
    }//GEN-LAST:event_masaayarActionPerformed

    private void urunayarlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunayarlarActionPerformed
        // TODO add your handling code here:
        new Urunayarları().setVisible(true);
    }//GEN-LAST:event_urunayarlarActionPerformed

    private void userayarlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userayarlarActionPerformed
        // TODO add your handling code here:
        new garsonhesapayarlar().setVisible(true);
    }//GEN-LAST:event_userayarlarActionPerformed

    private void adminayarlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminayarlarActionPerformed
        // TODO add your handling code here:
        new adminhesapayarlar().setVisible(true);
    }//GEN-LAST:event_adminayarlarActionPerformed

    private void garosngirisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_garosngirisMouseClicked
        //Adminin ayarlar menüsünden direk garson kısmına gider
        this.setVisible(false);
        new IslemPanel().setVisible(true);
    }//GEN-LAST:event_garosngirisMouseClicked

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
            java.util.logging.Logger.getLogger(Adminayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminayar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminayarlar;
    private javax.swing.JLabel adminsurukle;
    private javax.swing.JLabel cikisadmin;
    private javax.swing.JLabel garosngiris;
    private javax.swing.JLabel girisgeri;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton masaayar;
    private javax.swing.JButton urunayarlar;
    private javax.swing.JButton userayarlar;
    // End of variables declaration//GEN-END:variables
}
