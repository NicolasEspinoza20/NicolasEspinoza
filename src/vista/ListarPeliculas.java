
package vista;

import controlador.Registro;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Pelicula;

/**
 *
 * @author Nicolas Espinoza
 */
public class ListarPeliculas extends javax.swing.JFrame {

    /**
     * Creates new form ListarPeliculas
     */
    public ListarPeliculas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlbl_idpelicula = new javax.swing.JLabel();
        jtxt_buscarId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_datos = new javax.swing.JTable();
        jbtn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Peliculas");

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jlbl_idpelicula.setText("Id Pelicula:");

        jtxt_buscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_buscarIdActionPerformed(evt);
            }
        });

        jtbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Pelicula", "Titulo Pelicula", "Autor Pelicula", "Precio Pelicula", "Disponible Pelicula"
            }
        ));
        jScrollPane1.setViewportView(jtbl_datos);

        jbtn_buscar.setText("Buscar");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbl_idpelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_buscarId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtn_buscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_idpelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_buscarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_buscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_buscarIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_buscarIdActionPerformed

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed
        String titulo,autor;
        int precio, id;
        boolean disponible;
        
        Registro reg = new Registro();
        DefaultTableModel modelo = (DefaultTableModel)this.jtbl_datos.getModel();
        
        try {
           
            id = Integer.parseInt(this.jtxt_buscarId.getText());
            
     
        } catch (NumberFormatException e) {
            id=0;
            
            modelo.setRowCount(0);
            
            if (id==0) { // listar todos los datos de la tabla osea uso de select *
                List<Pelicula> lista = reg.buscarTodos();
                
                for (Pelicula pel : lista) {
                    id = pel.getIdPelicula();
                    titulo = pel.getTituloPelicula();
                    autor = pel.getAutorPelicula();
                    precio = pel.getPrecioPelicula();
                    disponible = pel.isDisponible();
                    
                    modelo.addRow(new Object [] {id,titulo,autor,precio,disponible});
                    
                    
                }
                
            }else{// consulta por id
                
                Pelicula pelicula = reg.buscarPorId(id);
                id = pelicula.getIdPelicula();
                titulo = pelicula.getTituloPelicula();
                    autor = pelicula.getAutorPelicula();
                    precio = pelicula.getPrecioPelicula();
                    disponible = pelicula.isDisponible();
                modelo.addRow(new Object [] {id,titulo,autor,precio,disponible});
            }
        
        }
    }//GEN-LAST:event_jbtn_buscarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ListarPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ListarPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ListarPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ListarPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ListarPeliculas().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JLabel jlbl_idpelicula;
    private javax.swing.JTable jtbl_datos;
    private javax.swing.JTextField jtxt_buscarId;
    // End of variables declaration//GEN-END:variables
}
