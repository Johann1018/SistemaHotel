
package Vista;

import BaseDatos.bdReserva;
import Modelo.Reserva;
import java.awt.Color;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class vReserva extends javax.swing.JFrame {
        
    int xMouse, yMouse;
        
    public vReserva() {
        initComponents();
        mostrar("");
        inhabilitar();        
    }
     private String accion="guardar";
     public static int idusuario;
    
    void ocultar_columnas (){
        tblRegistro.getColumnModel().getColumn(0).setMaxWidth(0);
        tblRegistro.getColumnModel().getColumn(0).setMinWidth(0);
        tblRegistro.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        tblRegistro.getColumnModel().getColumn(1).setMaxWidth(0);
        tblRegistro.getColumnModel().getColumn(1).setMinWidth(0);
        tblRegistro.getColumnModel().getColumn(1).setPreferredWidth(0);

        tblRegistro.getColumnModel().getColumn(3).setMaxWidth(0);
        tblRegistro.getColumnModel().getColumn(3).setMinWidth(0);
        tblRegistro.getColumnModel().getColumn(3).setPreferredWidth(0);

        tblRegistro.getColumnModel().getColumn(5).setMaxWidth(0);
        tblRegistro.getColumnModel().getColumn(5).setMinWidth(0);
        tblRegistro.getColumnModel().getColumn(5).setPreferredWidth(0);

        
    }
    
    void inhabilitar (){
        
        //Cuadro de Establecer
        txtIdReserva.setVisible(false);
        txtIdHabitacion.setVisible(false);
        txtIdCliente.setVisible(false);
        txtIdTrabajador.setVisible(false);
  
        txtNumero.setEnabled(false);
        txtCliente.setEnabled(false);
        txtTrabajador.setEnabled(false);       
        cmbTipo.setEnabled(false);
        
        dcFechaReserva.setEnabled(false);
        dcFechaIngreso.setEnabled(false);
        dcFechaSalida.setEnabled(false);
        
        txtCosto.setEnabled(false);
        cmbTipo.setEnabled(false);
        
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
        buscarCliente.setEnabled(false);
        buscarHabitacion.setEnabled(false);
        
        txtIdReserva.setText("");
        txtIdHabitacion.setText("");
        txtNumero.setText("");
        txtCliente.setText(""); 
        txtCosto.setText("");
        txtIdCliente.setText("");
        
    }
    
    
    void habilitar (){
        
        //Cuadro de Establecer
        txtIdReserva.setVisible(false);
        txtIdHabitacion.setVisible(false);
        txtIdCliente.setVisible(false);
        txtIdTrabajador.setVisible(false);
  
        txtNumero.setEnabled(false);
        txtCliente.setEnabled(false);
        txtTrabajador.setEnabled(false);     
        
        cmbTipo.setEnabled(true);
        
        dcFechaReserva.setEnabled(true);
        dcFechaIngreso.setEnabled(true);
        dcFechaSalida.setEnabled(true);
        
        txtCosto.setEnabled(true);
        cmbTipo.setEnabled(true);
        
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
        buscarCliente.setEnabled(true);
        buscarHabitacion.setEnabled(true);
        
        txtIdReserva.setText("");
        txtIdHabitacion.setText("");
        txtNumero.setText("");
        txtCliente.setText(""); 
        txtCosto.setText("");
        txtIdCliente.setText(""); 
        
    }
    
    void mostrar(String buscar){
        try{
            DefaultTableModel modelo;
            bdReserva func = new bdReserva();
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
        txtNumero = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        txtIdReserva = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lbltotalregistros1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        btnVerConsumo = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtIdHabitacion = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtIdTrabajador = new javax.swing.JTextField();
        txtTrabajador = new javax.swing.JTextField();
        dcFechaReserva = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        dcFechaIngreso = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        dcFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        buscarHabitacion = new javax.swing.JLabel();
        buscarCliente = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(105, 218, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 160, 30));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reserva", "Alquiler" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 250, -1));

        txtIdReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdReservaActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 180, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("El ID se almacenara en la BD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Habitacion:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Tipo Reserva:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Fecha Reserva:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, 40));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Cliente:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

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

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setText("Buscar por habitacion:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 210, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 200, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 200, -1));

        lbltotalregistros1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbltotalregistros1.setText("Registros:");
        jPanel2.add(lbltotalregistros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, -1, 30));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1210, 260));

        btnVerConsumo.setText("Ver Consumo");
        btnVerConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerConsumoActionPerformed(evt);
            }
        });
        jPanel2.add(btnVerConsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 160, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1230, 330));

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

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("Trabajador:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtIdHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdHabitacionActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 50, 30));

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 160, 30));

        txtIdTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdTrabajadorActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 50, -1));

        txtTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrabajadorActionPerformed(evt);
            }
        });
        jPanel1.add(txtTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 190, -1));
        jPanel1.add(dcFechaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 200, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Fecha Ingreso:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, 40));
        jPanel1.add(dcFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 200, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setText("Fecha Salida:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, 40));
        jPanel1.add(dcFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 200, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setText("Costo:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, -1));

        txtCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 250, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setText("Estado Reserva:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alquiler", "Pagada", "Anulada" }));
        cmbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 200, -1));

        buscarHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/examinar.png"))); // NOI18N
        buscarHabitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarHabitacionMouseClicked(evt);
            }
        });
        jPanel1.add(buscarHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 30, 30));

        buscarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/examinar.png"))); // NOI18N
        buscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarClienteMouseClicked(evt);
            }
        });
        jPanel1.add(buscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 30, 30));

        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 50, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        
        habilitar();  
        btnGuardar.setText("Guardar");
        accion="guardar";
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        if (txtIdHabitacion.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes seleccionar una Habitacion Por favor");
            txtIdHabitacion.requestFocus();
            return;
        }
         if (txtIdCliente.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes seleccionar un Cliente Por Favor");
            txtIdCliente.requestFocus();
            return;
        }
        if (txtCosto.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un precio del alojamiento");
            txtCosto.requestFocus();
            return;
        }
        
        Reserva dts = new Reserva();
        bdReserva func = new bdReserva();
        
        dts.setIdhabitacion(Integer.parseInt(txtIdHabitacion.getText()));      
        dts.setIdcliente(Integer.parseInt(txtIdCliente.getText()));     
        dts.setIdtrabajador(idusuario); 
            
        int seleccionado=cmbTipo.getSelectedIndex();       
        dts.setTipo_reserva((String) cmbTipo.getItemAt(seleccionado));
        
        //calendario
        Calendar cal;
        int d,m,a;
        cal=dcFechaReserva.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);   
        m=cal.get(Calendar.MONTH);
        a=cal.get(Calendar.YEAR) - 1900;
        dts.setFecha_reserva(new Date(a,m,d));
        
        cal=dcFechaIngreso.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);   
        m=cal.get(Calendar.MONTH);
        a=cal.get(Calendar.YEAR) - 1900;
        dts.setFecha_ingresa(new Date(a,m,d));
        
        cal=dcFechaSalida.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);   
        m=cal.get(Calendar.MONTH);
        a=cal.get(Calendar.YEAR) - 1900;
        dts.setFecha_salida(new Date(a,m,d));
        
        dts.setCosto_alojamiento(Double.parseDouble(txtCosto.getText()));
        seleccionado=cmbEstado.getSelectedIndex();       
        dts.setEstado((String) cmbEstado.getItemAt(seleccionado));
        
        if (accion.equals("guardar")) {
            
            if (func.insertar(dts)) {
                JOptionPane.showConfirmDialog(rootPane, "El reserva fue Registrada Satisfactoriamente");
                mostrar("");
                inhabilitar();
            } 
        }
        else if (accion.equals("editar")) {
                
                dts.setIdreserva(Integer.parseInt(txtIdReserva.getText()));
                dts.setIdtrabajador(Integer.parseInt(txtIdTrabajador.getText()));
                if (func.editar(dts)) {
                    JOptionPane.showConfirmDialog(rootPane, "El reserva fue Editada Satisfactoriamente");
                    mostrar("");
                    inhabilitar();
                }
            }
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            if (!txtIdReserva.getText().equals("")) {
                int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estas seguro de que quieres Eliminar la reserva?","Confirmar",2);
                
                if (confirmacion==0) {
                    bdReserva func = new bdReserva();
                    Reserva dts = new Reserva();
                    
                    dts.setIdreserva(Integer.parseInt(txtIdReserva.getText()));
                    func.eliminar(dts);
                    mostrar("");
                    inhabilitar();
                }
            
            }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       mostrar(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIdReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdReservaActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        txtNumero.transferFocus();
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void tblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistroMouseClicked
        btnGuardar.setText("Editar");
        habilitar();
        btnEliminar.setEnabled(true);
        accion="editar";
        
        int fila = tblRegistro.rowAtPoint(evt.getPoint());
        
        txtIdReserva.setText(tblRegistro.getValueAt(fila, 0).toString());
        txtIdHabitacion.setText(tblRegistro.getValueAt(fila, 1).toString());
        txtNumero.setText(tblRegistro.getValueAt(fila, 2).toString());
        txtIdCliente.setText(tblRegistro.getValueAt(fila, 3).toString());
        txtCliente.setText(tblRegistro.getValueAt(fila, 4).toString());
        txtIdTrabajador.setText(tblRegistro.getValueAt(fila, 5).toString());
        txtTrabajador.setText(tblRegistro.getValueAt(fila, 6).toString());
        
        cmbTipo.setSelectedItem(tblRegistro.getValueAt(fila, 7).toString());
        dcFechaReserva.setDate(Date.valueOf(tblRegistro.getValueAt(fila, 8).toString()));
        dcFechaIngreso.setDate(Date.valueOf(tblRegistro.getValueAt(fila, 9).toString()));
        dcFechaSalida.setDate(Date.valueOf(tblRegistro.getValueAt(fila, 10).toString()));
        txtCosto.setText(tblRegistro.getValueAt(fila, 11).toString());
        cmbEstado.setSelectedItem(tblRegistro.getValueAt(fila, 12).toString());
    }//GEN-LAST:event_tblRegistroMouseClicked

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        cmbTipo.transferFocus();
    }//GEN-LAST:event_cmbTipoActionPerformed

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

    private void txtIdHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdHabitacionActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtIdTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdTrabajadorActionPerformed

    private void txtTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrabajadorActionPerformed

    private void txtCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoActionPerformed

    private void cmbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstadoActionPerformed

    private void buscarHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarHabitacionMouseClicked
        VentanaHabitacion form = new VentanaHabitacion();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_buscarHabitacionMouseClicked

    private void buscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarClienteMouseClicked
        VentanaCliente form = new VentanaCliente();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_buscarClienteMouseClicked

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void btnVerConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerConsumoActionPerformed
        int fila = tblRegistro.getSelectedRow();
        vConsumo.idreserva = tblRegistro.getValueAt(fila, 0).toString();
        vConsumo.Cliente = tblRegistro.getValueAt(fila, 4).toString();
        
        vConsumo form = new vConsumo();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnVerConsumoActionPerformed

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
            java.util.logging.Logger.getLogger(vReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new vReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVerConsumo;
    private javax.swing.JLabel buscarCliente;
    private javax.swing.JLabel buscarHabitacion;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbTipo;
    private com.toedter.calendar.JDateChooser dcFechaIngreso;
    private com.toedter.calendar.JDateChooser dcFechaReserva;
    private com.toedter.calendar.JDateChooser dcFechaSalida;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltotalregistros1;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtBuscar;
    public static javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCosto;
    public static javax.swing.JTextField txtIdCliente;
    public static javax.swing.JTextField txtIdHabitacion;
    private javax.swing.JTextField txtIdReserva;
    public static javax.swing.JTextField txtIdTrabajador;
    public static javax.swing.JTextField txtNumero;
    public static javax.swing.JTextField txtTrabajador;
    // End of variables declaration//GEN-END:variables
}
