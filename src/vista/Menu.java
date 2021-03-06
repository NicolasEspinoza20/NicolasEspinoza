
package vista;

/**
 *
 * @author Nicolas Espinoza
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_opciones = new javax.swing.JMenu();
        jmi_agregar = new javax.swing.JMenuItem();
        jmi_opcion = new javax.swing.JMenuItem();
        jmi_listar = new javax.swing.JMenuItem();
        jmi_salir = new javax.swing.JMenuItem();
        jmi_acerca = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Peliculas");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jmi_opciones.setText("Opciones");

        jmi_agregar.setText("Agregar");
        jmi_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregarActionPerformed(evt);
            }
        });
        jmi_opciones.add(jmi_agregar);

        jmi_opcion.setText("Eliminar");
        jmi_opcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_opcionActionPerformed(evt);
            }
        });
        jmi_opciones.add(jmi_opcion);

        jMenu1.add(jmi_opciones);

        jmi_listar.setText("Listar Peliculas");
        jmi_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_listarActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_listar);

        jmi_salir.setText("Salir");
        jmi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_salirActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_salir);

        jMenuBar1.add(jMenu1);

        jmi_acerca.setText("Ayuda");

        jMenuItem5.setText("Acerca de");
        jmi_acerca.add(jMenuItem5);

        jMenuBar1.add(jmi_acerca);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listarActionPerformed
            new ListarPeliculas().setVisible(true);
    }//GEN-LAST:event_jmi_listarActionPerformed

    private void jmi_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregarActionPerformed
        new AgregarPelicula().setVisible(true);
    }//GEN-LAST:event_jmi_agregarActionPerformed

    private void jmi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_salirActionPerformed
            System.exit(0);
    }//GEN-LAST:event_jmi_salirActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jmi_opcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_opcionActionPerformed
        new EliminarPelicula().setVisible(true);
    }//GEN-LAST:event_jmi_opcionActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu jmi_acerca;
    private javax.swing.JMenuItem jmi_agregar;
    private javax.swing.JMenuItem jmi_listar;
    private javax.swing.JMenuItem jmi_opcion;
    private javax.swing.JMenu jmi_opciones;
    private javax.swing.JMenuItem jmi_salir;
    // End of variables declaration//GEN-END:variables
}
