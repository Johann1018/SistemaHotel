
package Vista;

import BaseDatos.bdConsumo;
import Modelo.Consumo;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class vConsumo extends javax.swing.JFrame {
    
    public static String idreserva;
    public static String Cliente;
    int xMouse, yMouse;
        
    public vConsumo() {
        initComponents();
        mostrar(idreserva);
        txtCliente.setText(Cliente);
        txtIdReserva.setText(idreserva);
        inhabilitar();        
    }
     private String accion="guardar";
    
    void ocultar_columnas (){
        tblRegistro.getColumnModel().getColumn(0).setMaxWidth(0);
        tblRegistro.getColumnModel().getColumn(0).setMinWidth(0);
        tblRegistro.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        tblRegistro.getColumnModel().getColumn(1).setMaxWidth(0);
        tblRegistro.getColumnModel().getColumn(1).setMinWidth(0);
        tblRegistro.getColumnModel().getColumn(1).setPreferredWidth(0);
        
        tblRegistro.getColumnModel().getColumn(2).setMaxWidth(0);
        tblRegistro.getColumnModel().getColumn(2).setMinWidth(0);
        tblRegistro.getColumnModel().getColumn(2).setPreferredWidth(0);

    }
    
    void inhabilitar (){
        
        //Cuadro de Establecer
        txtIdConsumo.setVisible(false);
        
        txtIdReserva.setVisible(false);
        txtCliente.setVisible(false); 
        txtIdProducto.setEnabled(false);
        txtProducto.setEnabled(false);
        txtCantidad.setEnabled(false);
        
        txtPrecio.setEnabled(false);
        cmbEstado.setEnabled(false);
                
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
        
        txtIdConsumo.setText("");
        txtPrecio.setText("");
        txtIdProducto.setText("");
        txtProducto.setText("");
        txtCantidad.setText("");
        
        
    }
    
    
    void habilitar (){
        
        //Cuadro de Establecer
        txtIdConsumo.setVisible(false);
        
        txtIdReserva.setVisible(false);
        txtCliente.setVisible(true); 
        txtIdProducto.setEnabled(false);
        txtProducto.setEnabled(true);
        txtCantidad.setEnabled(true);
        
        txtPrecio.setEnabled(true);
        cmbEstado.setEnabled(true);
                
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
        
        txtIdConsumo.setText("");
        txtPrecio.setText("");
        txtIdProducto.setText("");
        txtProducto.setText("");
        txtCantidad.setText("");
        
    }
    
    void mostrar(String buscar){
        try{
            DefaultTableModel modelo;
            bdConsumo func = new bdConsumo();
            modelo = func.mostrar(buscar);
            
            tblRegistro.setModel(modelo);
            ocultar_columnas();
            lbltotalregistros1.setText("Total Registros : "+ Integer.toString(func.totalregistros));
            lblConsumo.setText("Consumo Total $/. " + func.totalconsumo);
        } 
        
        catch(Exception e){
            JOptionPane.showConfirmDialog(rootPane, e);
        }
                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIdProducto = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        txtProducto = new javax.swing.JTextField();
        txtIdConsumo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        lblConsumo = new javax.swing.JLabel();
        lbltotalregistros1 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtIdReserva = new javax.swing.JTextField();
        buscarProducto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(105, 218, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 40, -1));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceptado", "Cancelado" }));
        cmbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 200, -1));

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 210, -1));

        txtIdConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdConsumoActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdConsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 200, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("El ID se almacenara en la BD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Reserva:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Estado:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Producto:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 170, 250, 50));

        btnNuevo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/Nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, 250, 50));

        btnGuardar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, 250, 50));

        jPanel2.setBackground(new java.awt.Color(20, 139, 143));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistro);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 56, 1210, 290));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 200, -1));

        lblConsumo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblConsumo.setText("Consumo:");
        jPanel2.add(lblConsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 30));

        lbltotalregistros1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbltotalregistros1.setText("Registros:");
        jPanel2.add(lbltotalregistros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1230, 360));

        btnMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/MinimizarMenu_1.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 40, 20, 20));

        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/CerrarMenu.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 20, 20));

        Header.setBackground(new java.awt.Color(105, 218, 200));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1230, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 20));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 260, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("Cantidad:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setText("Precio de Venta:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 200, -1));

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 210, -1));

        txtIdReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdReservaActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 40, -1));

        buscarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/examinar.png"))); // NOI18N
        buscarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarProductoMouseClicked(evt);
            }
        });
        jPanel1.add(buscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 30, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        txtProducto.transferFocus();
    }//GEN-LAST:event_txtProductoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        
        habilitar();  
        btnGuardar.setText("Guardar");
        accion="guardar";
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        if (txtIdProducto.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Ingresa seleccionar un producto Por Favor");
            buscarProducto.requestFocus();
            return;
        }
         if (txtCantidad.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Ingresa una cantidad de consumo Por Favor");
            txtCantidad.requestFocus();
            return;
        }
        if (txtPrecio.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Ingresa un precio de venta del producto Por favor");
            txtPrecio.requestFocus();
            return;
        }
        
        Consumo dts = new Consumo();
        bdConsumo func = new bdConsumo();
        
        dts.setIdreserva(Integer.parseInt(txtIdReserva.getText()));
        dts.setIdproducto(Integer.parseInt(txtIdProducto.getText()));    
        dts.setCantidad(Double.parseDouble(txtCantidad.getText()));
        dts.setPrecio_venta(Double.parseDouble(txtPrecio.getText()));
               
        int seleccionado=cmbEstado.getSelectedIndex();       
        dts.setEstado((String) cmbEstado.getItemAt(seleccionado));   
        
        if (accion.equals("guardar")) {
            
            if (func.insertar(dts)) {
                JOptionPane.showConfirmDialog(rootPane, "El consumo " + txtProducto.getText() + " del cliente "
                + txtCliente.getText() + " Ha sido registrado correctamente");
                mostrar(idreserva);
                inhabilitar();
            }
        }
        else if (accion.equals("editar")) {
                
                dts.setIdconsumo(Integer.parseInt(txtIdConsumo.getText()));
                if (func.editar(dts)) {
                    JOptionPane.showConfirmDialog(rootPane, "El consumo del cliente "
                    + txtCliente.getText() + " ha sido modificado correctamente");
                    mostrar(idreserva);
                    inhabilitar();
                }
            }
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            if (!txtIdConsumo.getText().equals("")) {
                int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estas seguro de que quieres Eliminar el producto?","Confirmar",2);
                
                if (confirmacion==0) {
                    bdConsumo func = new bdConsumo();
                    Consumo dts = new Consumo();
                    
                    dts.setIdconsumo(Integer.parseInt(txtIdConsumo.getText()));
                    func.eliminar(dts);
                    mostrar(idreserva);
                    inhabilitar();
                }
            
            }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtIdConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdConsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdConsumoActionPerformed

    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed
        txtIdProducto.transferFocus();
    }//GEN-LAST:event_txtIdProductoActionPerformed

    private void tblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistroMouseClicked
        btnGuardar.setText("Editar");
        habilitar();
        btnEliminar.setEnabled(true);
        accion="editar";
        
        int fila = tblRegistro.rowAtPoint(evt.getPoint());
        
        txtIdConsumo.setText(tblRegistro.getValueAt(fila, 0).toString());
        txtIdReserva.setText(tblRegistro.getValueAt(fila, 1).toString());
        txtIdProducto.setText(tblRegistro.getValueAt(fila, 2).toString());
        txtProducto.setText(tblRegistro.getValueAt(fila, 3).toString());
        txtCantidad.setText(tblRegistro.getValueAt(fila, 4).toString());
        txtPrecio.setText(tblRegistro.getValueAt(fila, 5).toString());
        
        cmbEstado.setSelectedItem(tblRegistro.getValueAt(fila, 6).toString());
        
    }//GEN-LAST:event_tblRegistroMouseClicked

    private void cmbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoActionPerformed
        cmbEstado.transferFocus();
    }//GEN-LAST:event_cmbEstadoActionPerformed

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtIdReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdReservaActionPerformed

    private void buscarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarProductoMouseClicked
        VentanaProducto form = new VentanaProducto();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_buscarProductoMouseClicked

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
            java.util.logging.Logger.getLogger(vConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vConsumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel buscarProducto;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConsumo;
    private javax.swing.JLabel lbltotalregistros1;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtIdConsumo;
    public static javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdReserva;
    public static javax.swing.JTextField txtPrecio;
    public static javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
