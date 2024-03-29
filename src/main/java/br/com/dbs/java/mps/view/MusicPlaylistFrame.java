/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dbs.java.mps.view;

import javax.swing.JFrame;

/**
 *
 * @author DBS
 */
public class MusicPlaylistFrame extends javax.swing.JFrame {

    /**
     * Creates new form MusicPlaylistFrame
     */
    public MusicPlaylistFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraDeMenu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuCadastro = new javax.swing.JMenu();
        menuItemCantor = new javax.swing.JMenuItem();
        menuItemMusica = new javax.swing.JMenuItem();
        menuSistema = new javax.swing.JMenu();
        menuItemUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DBS Java - Music Playlist v1.0");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        menuArquivo.setText("Arquivo");
        barraDeMenu.add(menuArquivo);

        menuCadastro.setText("Cadastro");

        menuItemCantor.setText("Cantor");
        menuItemCantor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCantorActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCantor);

        menuItemMusica.setText("Música");
        menuItemMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMusicaActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemMusica);

        barraDeMenu.add(menuCadastro);

        menuSistema.setText("Sistema");

        menuItemUsuario.setText("Usuarios");
        menuSistema.add(menuItemUsuario);

        barraDeMenu.add(menuSistema);

        setJMenuBar(barraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void menuItemCantorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCantorActionPerformed
        new CantorFrame(this).setVisible(true);
    }//GEN-LAST:event_menuItemCantorActionPerformed

    private void menuItemMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMusicaActionPerformed
        new MusicaDialog(this).setVisible(true);
    }//GEN-LAST:event_menuItemMusicaActionPerformed

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
            java.util.logging.Logger.getLogger(MusicPlaylistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusicPlaylistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusicPlaylistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicPlaylistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicPlaylistFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuItemCantor;
    private javax.swing.JMenuItem menuItemMusica;
    private javax.swing.JMenuItem menuItemUsuario;
    private javax.swing.JMenu menuSistema;
    // End of variables declaration//GEN-END:variables
}
