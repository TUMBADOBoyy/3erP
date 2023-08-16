
package Inicio;
import com.devazt.networking.HttpClient;
import com.devazt.networking.OnHttpRequestComplete;
import com.devazt.networking.Response;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import org.json.JSONObject;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class inV extends javax.swing.JFrame {
    DefaultTableModel modelo;
    float cantidad=0;
    float Total=0;
    float unidad=0;
    float STot=0;
    /**
     * Creates new form buscarID
     */
    public inV() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn("jidventa");
        modelo.addColumn("jidproducto");
        modelo.addColumn("jnombre");
        modelo.addColumn("jcantidad");
        modelo.addColumn("jpreciou");
        modelo.addColumn("jtotal");
        this.tabla.setModel(modelo);
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
        jLabel6 = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        txtIDP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnInsVenta = new javax.swing.JButton();
        txtIDV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnNueva = new javax.swing.JButton();
        btnElimP = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        lblSTotal = new javax.swing.JLabel();
        btnTicket = new javax.swing.JButton();
        lblPre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Engravers MT", 2, 12)); // NOI18N
        jLabel6.setText("Precio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 20));
        jPanel1.add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 110, -1));
        jPanel1.add(txtIDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 110, -1));

        jLabel5.setFont(new java.awt.Font("Engravers MT", 2, 12)); // NOI18N
        jLabel5.setText("Cantidad Producto");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 20));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 40, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Engravers MT", 2, 12)); // NOI18N
        jLabel3.setText("ID PRODUCTO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        btnInsVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/insertar.png"))); // NOI18N
        btnInsVenta.setText("Insertar Producto");
        btnInsVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));
        jPanel1.add(txtIDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 200, -1));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 2, 12)); // NOI18N
        jLabel2.setText("NUM Factura");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lblPrecio.setText("...");
        jPanel1.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID VENTA", "ID PRODUCTO", "nombre", "CANTIDAD", "PRECIO U", "PRECIO T"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 550, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        jButton1.setText("Buscar Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        btnNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        btnNueva.setText("Nueva Venta");
        btnNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaActionPerformed(evt);
            }
        });
        jPanel1.add(btnNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        btnElimP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        btnElimP.setText("Eliminar Producto");
        btnElimP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimPActionPerformed(evt);
            }
        });
        jPanel1.add(btnElimP, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 160, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit.png"))); // NOI18N
        jButton4.setText("Modificar Producto");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Engravers MT", 2, 12)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        lblNombre.setText("...");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Engravers MT", 2, 12)); // NOI18N
        jLabel4.setText("CANTIDAD STOCK");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblStock.setText("...");
        jPanel1.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buy.png"))); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        jPanel1.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        lblSTotal.setFont(new java.awt.Font("Engravers MT", 2, 14)); // NOI18N
        lblSTotal.setText("0");
        jPanel1.add(lblSTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        btnTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/printer.png"))); // NOI18N
        btnTicket.setText("Ticket");
        btnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketActionPerformed(evt);
            }
        });
        jPanel1.add(btnTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        lblPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/t-fotor-20230726105123.png"))); // NOI18N
        lblPre.setText("Presentac");
        jPanel1.add(lblPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
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

    private void btnInsVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsVentaActionPerformed
        // TODO add your handling code here:
        Date todayDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        String fechaActual = sdf.format(todayDate);
        //tffecha.setText(fechaActual);
        cantidad=Float.parseFloat(txtCant.getText());
        Total=unidad*cantidad;
        String total=Float.toString(Total);
        String []info = new String[6];
        info[0]=txtIDV.getText();
        info[1]=txtIDP.getText();
        info[2]=lblNombre.getText();
        info[3]=txtCant.getText();
        info[4]=lblPrecio.getText();
        info[5]=total;
        modelo.addRow(info);
        STot+=Total;
        String ST=Float.toString(STot);
        lblSTotal.setText(ST);
        txtIDP.setText("");
        txtCant.setText("");
        lblPrecio.setText("...");
        lblNombre.setText("...");
        lblStock.setText("...");
        
    }//GEN-LAST:event_btnInsVentaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HttpClient b= new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {
                if(status.isSuccess()){
                    try{
                        JSONObject ID=new JSONObject(status.getResult());
                        String Nombre=ID.getJSONObject("0").get("Nombre").toString();
                        String Precio=ID.getJSONObject("0").get("Precio").toString();
                        String Cantidad=ID.getJSONObject("0").get("Cantidad").toString();
                        lblPrecio.setText(Precio);
                        lblNombre.setText(Nombre);
                        lblStock.setText(Cantidad);
                        unidad=Float.parseFloat(Precio);
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "El producto no existe");
                        lblPrecio.setText("");
                        lblNombre.setText("");
                        lblStock.setText("");
                        unidad=Float.parseFloat("");
                    }
                }
            }
        });
        String ID=txtIDP.getText().toString();
        b.excecute("http://localhost/Api/buscarProducto.php?ID_P="+ID+"");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnElimPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimPActionPerformed
        // TODO add your handling code here:
        int fila=tabla.getSelectedRow();
        if(fila>=0){
            modelo.removeRow(fila);
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione fila");
        }
    }//GEN-LAST:event_btnElimPActionPerformed

    private void btnNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaActionPerformed
        // TODO add your handling code here:
        int fila=tabla.getRowCount();
        for(int i=fila-1; i>=0;i--){
            modelo.removeRow(i);
        }
        txtIDV.setText(" ");
        
    }//GEN-LAST:event_btnNuevaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
        HttpClient cliente= new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {
                if(status.isSuccess()){
                }
            }
        });
        int filas = tabla.getRowCount();
        String venta[][] = new String[filas][6];
        //System.out.println("" + filas);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < 6; j++) {
                venta[i][j] = tabla.getValueAt(i, j).toString();
                //System.out.println("Fila " + i + ", Columna " + j + ": " + venta[i][j]);
            }
            //System.out.println("http://localhost/Api/inVenta.php?ID_Venta="+venta[i][0]+"&ID_Producto="+venta[i][1]+
              //      "&Nombre_Producto="+venta[i][2]+"&Cantidad_Producto="+venta[i][3]+"&Precio="+venta[i][4]+"&Total="+venta[i][5]+"");
            cliente.excecute("http://localhost/Api/inVenta.php?ID_Venta="+venta[i][0]+"&ID_Producto="+venta[i][1]+"&Nombre="+venta[i][2]+"&Cantidad="+venta[i][3]+"&Precio_U="+venta[i][4]+"&Total="+venta[i][5]+"");
        }
        JOptionPane.showMessageDialog(null, "Compra exitosa");
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketActionPerformed
        // TODO add your handling code here:
        ArrayList lista = new ArrayList();
        for(int i=0;i<tabla.getRowCount();i++){
            tick clientes= new tick(tabla.getValueAt(i, 1).toString(), tabla.getValueAt(i, 3).toString(), tabla.getValueAt(i, 5).toString());
            lista.add(clientes);
        }
        
        FileInputStream archivo;
        try {
            archivo = new FileInputStream("C:\\Users\\TUMBADOBoy\\Documents\\NetBeansProjects\\3erP\\src\\Jasper\\newReport.jasper");
            JasperReport reporte = (JasperReport) JRLoader.loadObject(archivo);
            Map parametro = new HashMap();
            parametro.put("STotal", lblSTotal.getText());
            parametro.put("idventa", txtIDV.getText());
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(lista));
            JasperViewer.viewReport(jprint);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(inV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(inV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnTicketActionPerformed
    
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
            java.util.logging.Logger.getLogger(inV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnElimP;
    private javax.swing.JButton btnInsVenta;
    private javax.swing.JButton btnNueva;
    private javax.swing.JButton btnTicket;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSTotal;
    private javax.swing.JLabel lblStock;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtIDP;
    private javax.swing.JTextField txtIDV;
    // End of variables declaration//GEN-END:variables
}
