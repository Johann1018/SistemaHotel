
package Vista;

import BaseDatos.bdProducto;
import Modelo.Producto;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class vPago extends javax.swing.JFrame {
        
    int xMouse, yMouse;
        
    public vPago() {
        initComponents();
        mostrar("");
        inhabilitar();        
    }
     private String accion="guardar";
    
    void ocultar_columnas (){
        tblRegistro.getColumnModel().getColumn(0).setMaxWidth(0);
        tblRegistro.getColumnModel().getColumn(0).setMinWidth(0);
        tblRegistro.getColumnModel().getColumn(0).setPreferredWidth(0);

    }
    
    void inhabilitar (){
//        
//        //Cuadro de Establecer
//        txtIdPago.setVisible(false);
//        cmbTipoComprobante.setEnabled(false);
//        txtCliente.setEnabled(false);
//        taDescripcion.setEnabled(false);
//        txtPrecio.setEnabled(false);
//    
//        
//        btnGuardar.setEnabled(false);
//        btnCancelar.setEnabled(false);
//        btnEliminar.setEnabled(false);
//        txtIdPago.setText("");
//        txtPrecio.setText("");
//        txtCliente.setText("");
//        taDescripcion.setText(""); 
        
    }
    
    
    void habilitar (){
        
        //Cuadro de Establecer
//        txtIdPago.setVisible(false);
//        cmbTipoComprobante.setEnabled(true);
//        txtCliente.setEnabled(true);
//        taDescripcion.setEnabled(true);
//        txtPrecio.setEnabled(true);
//    
//        
//        btnGuardar.setEnabled(true);
//        btnCancelar.setEnabled(true);
//        btnEliminar.setEnabled(true);
//        txtIdPago.setText("");
//        txtPrecio.setText("");
//        txtCliente.setText("");
//        taDescripcion.setText(""); 
        
    }
    
    void mostrar(String buscar){
        try{
            DefaultTableModel modelo;
            bdProducto func = new bdProducto();
            modelo = func.mostrar(buscar);
            
            tblRegistro.setModel(modelo);
            ocultar_columnas();
            lbltotalregistros1.setText("Total Registros : "+ Integer.toString(func.totalregistros));
            
        }
        
        catch(Exception e){
            JOptionPane.showConfirmDialog(rootPane, e);
        }
                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCliente = new javax.swing.JTextField();
        cmbTipoComprobante = new javax.swing.JComboBox<>();
        txtIdPago = new javax.swing.JTextField();
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
        lbltotalregistros1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        txtIdreserva = new javax.swing.JTextField();
        txtTotalReserva = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIdhabitacion = new javax.swing.JTextField();
        txtTotal_pago = new javax.swing.JTextField();
        dFecha_pago = new com.toedter.calendar.JDateChooser();
        dFecha_emision = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtHabitacion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtIgv = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNum_comprobante = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegistro1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtBuscar1 = new javax.swing.JTextField();
        btnBuscar1 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        lbltotalregistros2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(105, 218, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 150, -1));

        cmbTipoComprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleta", "Factura", "Ticket", "Otro" }));
        cmbTipoComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoComprobanteActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTipoComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 200, -1));

        txtIdPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPagoActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 200, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("El ID se almacenara en la BD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Reserva:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Total Pago:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Total Reserva:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

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

        jPanel2.setBackground(new java.awt.Color(186, 80, 233));
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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 550, 300));

        lbltotalregistros1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbltotalregistros1.setText("Registros:");
        jPanel2.add(lbltotalregistros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 200, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Consumo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 570, 360));

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

        txtIdreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdreservaActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 40, -1));

        txtTotalReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalReservaActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotalReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 200, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("Fecha Pago:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        txtIdhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdhabitacionActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdhabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 40, -1));

        txtTotal_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal_pagoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotal_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 200, -1));
        jPanel1.add(dFecha_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 200, -1));
        jPanel1.add(dFecha_emision, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 200, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setText("Habitacion:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setText("Fecha Emision:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Tipo Comprobante:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        txtHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabitacionActionPerformed(evt);
            }
        });
        jPanel1.add(txtHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 150, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setText("IGV:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        txtIgv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIgvActionPerformed(evt);
            }
        });
        jPanel1.add(txtIgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 200, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setText("Num Comprobante:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        txtNum_comprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum_comprobanteActionPerformed(evt);
            }
        });
        jPanel1.add(txtNum_comprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 200, -1));

        jPanel3.setBackground(new java.awt.Color(20, 139, 143));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRegistro1.setModel(new javax.swing.table.DefaultTableModel(
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
        tblRegistro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistro1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRegistro1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 640, 250));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel14.setText("Buscar por pagos:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 20));

        txtBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscar1ActionPerformed(evt);
            }
        });
        jPanel3.add(txtBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 290, -1));

        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/lupa.png"))); // NOI18N
        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 120, -1));

        btnEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/eliminar.png"))); // NOI18N
        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, -1));

        lbltotalregistros2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbltotalregistros2.setText("Registros:");
        jPanel3.add(lbltotalregistros2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 200, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 660, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void txtBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscar1ActionPerformed

    private void tblRegistro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistro1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRegistro1MouseClicked

    private void txtNum_comprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum_comprobanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum_comprobanteActionPerformed

    private void txtIgvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIgvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIgvActionPerformed

    private void txtHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHabitacionActionPerformed

    private void txtTotal_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal_pagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotal_pagoActionPerformed

    private void txtIdhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdhabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdhabitacionActionPerformed

    private void txtTotalReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalReservaActionPerformed

    private void txtIdreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdreservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdreservaActionPerformed

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void tblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistroMouseClicked
        btnGuardar.setText("Editar");
        habilitar();
        //btnEliminar.setEnabled(true);
        accion="editar";

        int fila = tblRegistro.rowAtPoint(evt.getPoint());

        txtIdPago.setText(tblRegistro.getValueAt(fila, 0).toString());
        txtCliente.setText(tblRegistro.getValueAt(fila, 1).toString());
        //taDescripcion.setText(tblRegistro.getValueAt(fila, 2).toString());
        cmbTipoComprobante.setSelectedItem(tblRegistro.getValueAt(fila, 3).toString());
        //txtPrecio.setText(tblRegistro.getValueAt(fila, 4).toString());
    }//GEN-LAST:event_tblRegistroMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

//        if (txtCliente.getText().length() == 0) {
//            JOptionPane.showConfirmDialog(rootPane, "Ingresa un nombre para el producto Por Favor");
//            txtCliente.requestFocus();
//            return;
//        }
//        if (taDescripcion.getText().length() == 0) {
//            JOptionPane.showConfirmDialog(rootPane, "Ingresa una descripcion para el producto Por Favor");
//            taDescripcion.requestFocus();
//            return;
//        }
//        if (txtPrecio.getText().length() == 0) {
//            JOptionPane.showConfirmDialog(rootPane, "Establece el precio del producto Por favor");
//            txtPrecio.requestFocus();
//            return;
//        }
//
//        Producto dts = new Producto();
//        bdProducto func = new bdProducto();
//
//        dts.setNombre(txtCliente.getText());
//
//        dts.setDescripcion(taDescripcion.getText());
//
//        dts.setPrecio_venta(Double.parseDouble(txtPrecio.getText()) );
//
//        int seleccionado=cmbTipoComprobante.getSelectedIndex();
//        dts.setUnidad_medida((String) cmbTipoComprobante.getItemAt(seleccionado));
//
//        if (accion.equals("guardar")) {
//
//            if (func.insertar(dts)) {
//                JOptionPane.showConfirmDialog(rootPane, "El producto fue Registrado Satisfactoriamente");
//                mostrar("");
//                inhabilitar();
//            }
//        }
//        else if (accion.equals("editar")) {
//
//            dts.setIdProducto(Integer.parseInt(txtIdPago.getText()));
//            if (func.editar(dts)) {
//                JOptionPane.showConfirmDialog(rootPane, "El producto fue Editado Satisfactoriamente");
//                mostrar("");
//                inhabilitar();
//            }
//        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        habilitar();
        btnGuardar.setText("Guardar");
        accion="guardar";
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtIdPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPagoActionPerformed

    private void cmbTipoComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoComprobanteActionPerformed
        cmbTipoComprobante.transferFocus();
    }//GEN-LAST:event_cmbTipoComprobanteActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        txtCliente.transferFocus();
    }//GEN-LAST:event_txtClienteActionPerformed

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
            java.util.logging.Logger.getLogger(vPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new vPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbTipoComprobante;
    private com.toedter.calendar.JDateChooser dFecha_emision;
    private com.toedter.calendar.JDateChooser dFecha_pago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbltotalregistros1;
    private javax.swing.JLabel lbltotalregistros2;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTable tblRegistro1;
    private javax.swing.JTextField txtBuscar1;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtHabitacion;
    private javax.swing.JTextField txtIdPago;
    private javax.swing.JTextField txtIdhabitacion;
    private javax.swing.JTextField txtIdreserva;
    private javax.swing.JTextField txtIgv;
    private javax.swing.JTextField txtNum_comprobante;
    private javax.swing.JTextField txtTotalReserva;
    private javax.swing.JTextField txtTotal_pago;
    // End of variables declaration//GEN-END:variables
}
