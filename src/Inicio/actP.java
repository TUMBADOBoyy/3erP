
package Inicio;
import com.devazt.networking.HttpClient;
import com.devazt.networking.OnHttpRequestComplete;
import com.devazt.networking.Response;
import javax.swing.JOptionPane;
import org.json.JSONObject;
public class actP extends javax.swing.JFrame {
    String ID;
    
    public actP() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfPrecio = new javax.swing.JTextField();
        tfPresentacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        tfID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnActP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(tfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 110, -1));
        jPanel1.add(tfPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 110, -1));

        jLabel6.setFont(new java.awt.Font("Engravers MT", 2, 10)); // NOI18N
        jLabel6.setText("Precio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 20));

        jLabel5.setFont(new java.awt.Font("Engravers MT", 2, 10)); // NOI18N
        jLabel5.setText("Presentacion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 20));
        jPanel1.add(tfMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 110, -1));
        jPanel1.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 110, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 40, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Engravers MT", 2, 10)); // NOI18N
        jLabel4.setText("Marca");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Engravers MT", 2, 10)); // NOI18N
        jLabel3.setText("Nombre: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));
        jPanel1.add(tfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 110, -1));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 2, 12)); // NOI18N
        jLabel2.setText("Ingresa ID deL Producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        btnActP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizado.png"))); // NOI18N
        btnActP.setText("Actualizar");
        btnActP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActPActionPerformed(evt);
            }
        });
        jPanel1.add(btnActP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/t.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        HttpClient b=new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {
                if(status.isSuccess()){
                    try{
                            JSONObject ID=new JSONObject(status.getResult());
                            String NOM=ID.getJSONObject("0").get("Nombre").toString();
                            String Marca=ID.getJSONObject("0").get("Marca").toString();
                            String Presentacion=ID.getJSONObject("0").get("Presentacion").toString();
                            String Precio=ID.getJSONObject("0").get("Precio").toString();
                            tfNombre.setText(NOM);
                            tfMarca.setText(Marca);
                            tfPresentacion.setText(Presentacion);
                            tfPrecio.setText(Precio);
                            tfID.setText("");
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "El producto no esta en la base de datos");
                        tfNombre.setText("");
                        tfMarca.setText("");
                        tfPresentacion.setText("");
                        tfPrecio.setText("");
                        tfID.setText("");
                    }
                }
            }
        });
        ID=tfID.getText().toString();
        b.excecute("http://localhost/Api/buscarPID.php?ID="+ID+"");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActPActionPerformed
        // TODO add your handling code here:
        HttpClient ap = new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {
                if(status.isSuccess()){
                    try{
                        JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");
                        tfNombre.setText("");
                        tfMarca.setText("");
                        tfPresentacion.setText("");
                        tfPrecio.setText("");
                        tfID.setText("");
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un problema al actualizar producto");
                        tfNombre.setText("");
                        tfMarca.setText("");
                        tfPresentacion.setText("");
                        tfPrecio.setText("");
                        tfID.setText("");
                    }
                }
            }
        });
        String Nom=tfNombre.getText().toString();
        String Marca=tfMarca.getText().toString();
        String Presentacion=tfPresentacion.getText().toString();
        String Precio=tfPrecio.getText().toString();
        ap.excecute("http://localhost/Api/ActP.php?ID="+ID+"&Nombre="+Nom+"&Marca="+Marca+"&Presentacion="+Presentacion+"&Precio="+Precio+"");
    }//GEN-LAST:event_btnActPActionPerformed

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
            java.util.logging.Logger.getLogger(actP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new actP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActP;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPrecio;
    private javax.swing.JTextField tfPresentacion;
    // End of variables declaration//GEN-END:variables
}
