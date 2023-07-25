
package Inicio;


import com.devazt.networking.HttpClient;
import com.devazt.networking.OnHttpRequestComplete;
import com.devazt.networking.Response;
import javax.swing.JOptionPane;
import org.json.JSONException;
import org.json.JSONObject;



public class Sesion extends javax.swing.JFrame {

    public Sesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tfUser = new javax.swing.JTextField();
        tfClave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lEntrada = new javax.swing.JLabel();
        jlEntrada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contrasena.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 130, 130));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 40, 40));
        getContentPane().add(tfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 100, 30));

        tfClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClaveActionPerformed(evt);
            }
        });
        getContentPane().add(tfClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 100, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        lEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/log-in.png"))); // NOI18N
        lEntrada.setToolTipText("");
        lEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lEntradaMouseClicked(evt);
            }
        });
        getContentPane().add(lEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 70, 70));

        jlEntrada.setBackground(new java.awt.Color(204, 102, 0));
        jlEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lol.jpeg"))); // NOI18N
        jlEntrada.setText("jLabel1");
        getContentPane().add(jlEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 322, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lEntradaMouseClicked
        Menu ventana= new Menu();
        HttpClient cliente= new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {
                if(status.isSuccess()){
                    try{
                        JSONObject u=new JSONObject(status.getResult());
                        String UserW=u.getJSONObject("0").get("User").toString();
                        String PasswordW=u.getJSONObject("0").get("Password").toString();
                        if(tfUser.getText().toString().equals(UserW) && tfClave.getText().toString().equals(PasswordW)){
                            this.setVisible(false);
                            ventana.setVisible(true);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Datos incorrectos, vuelve a intentarlo");
                        }
                    }catch(JSONException e){
                    }
                }
                
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            private void setVisible(boolean b) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        String User=tfUser.getText().toString();
        String Password=tfClave.getText().toString();
    
        cliente.excecute("http://localhost/Api/login.php?User="+User+"&Password="+Password+"");
        this.setVisible(false);
    }//GEN-LAST:event_lEntradaMouseClicked

    private void tfClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClaveActionPerformed

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
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sesion().setVisible(true);
            }
        });
    }

    public void mostrar(){
        this.setVisible(true);
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlEntrada;
    private javax.swing.JLabel lEntrada;
    private javax.swing.JTextField tfClave;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
    
}
