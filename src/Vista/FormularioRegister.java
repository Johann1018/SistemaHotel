package Vista;

import java.awt.Color;

public class FormularioRegister extends javax.swing.JFrame {

    int xMouse, yMouse;
    public FormularioRegister() {
        initComponents();
        this.setExtendedState(FormularioRegister.MAXIMIZED_BOTH);
        this.setTitle("Sistema De Reserva De Hotel");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeadParque = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Escritorio = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JPanel();
        btnIngresar1 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        btnMaximizar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        lblIdPersona = new javax.swing.JLabel();
        lblApaterno = new javax.swing.JLabel();
        lblAcceso = new javax.swing.JLabel();
        lblAmaterno = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        mSistemaReserva = new javax.swing.JMenu();
        mArchivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mReservas = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        mConsultas = new javax.swing.JMenu();
        mConfiguraciones = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        mHerramientas = new javax.swing.JMenu();
        mAyuda = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeadParque.setBackground(new java.awt.Color(20, 139, 143));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/VentanaIzqRegister.png"))); // NOI18N

        javax.swing.GroupLayout HeadParqueLayout = new javax.swing.GroupLayout(HeadParque);
        HeadParque.setLayout(HeadParqueLayout);
        HeadParqueLayout.setHorizontalGroup(
            HeadParqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HeadParqueLayout.setVerticalGroup(
            HeadParqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        getContentPane().add(HeadParque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 720));

        Escritorio.setBackground(new java.awt.Color(255, 255, 255));
        Escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNombre.setText("Nombre:");
        Escritorio.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 520, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarMouseEntered(evt);
            }
        });

        btnIngresar1.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresar1MouseEntered(evt);
            }
        });

        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/CerrarMenu.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnIngresar1Layout = new javax.swing.GroupLayout(btnIngresar1);
        btnIngresar1.setLayout(btnIngresar1Layout);
        btnIngresar1Layout.setHorizontalGroup(
            btnIngresar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );
        btnIngresar1Layout.setVerticalGroup(
            btnIngresar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btnIngresarLayout = new javax.swing.GroupLayout(btnIngresar);
        btnIngresar.setLayout(btnIngresarLayout);
        btnIngresarLayout.setHorizontalGroup(
            btnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
            .addGroup(btnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnIngresarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnIngresarLayout.setVerticalGroup(
            btnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
            .addGroup(btnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnIngresarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Escritorio.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 20, 20));

        btnMaximizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMaximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/MaximizarMenu.png"))); // NOI18N
        btnMaximizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMaximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaximizarMouseClicked(evt);
            }
        });
        Escritorio.add(btnMaximizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 70, 20, 20));

        btnMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/MinimizarMenu_1.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        Escritorio.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 40, 20, 20));

        lblIdPersona.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblIdPersona.setText("Id:");
        Escritorio.add(lblIdPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 480, -1, -1));

        lblApaterno.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblApaterno.setText("Apellido Paterno:");
        Escritorio.add(lblApaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 560, -1, -1));

        lblAcceso.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblAcceso.setText("Acceso:");
        Escritorio.add(lblAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 640, -1, -1));

        lblAmaterno.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblAmaterno.setText("Apellido Materno:");
        Escritorio.add(lblAmaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 600, -1, -1));

        getContentPane().add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 720));

        jMenuBar2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar2.setName(""); // NOI18N
        jMenuBar2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenuBar2MouseDragged(evt);
            }
        });
        jMenuBar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuBar2MousePressed(evt);
            }
        });

        mSistemaReserva.setText("Sistema Reserva");
        jMenuBar2.add(mSistemaReserva);

        mArchivo.setText("Archivo");

        jMenuItem1.setText("Habitaciones");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mArchivo.add(jMenuItem1);

        jMenuItem2.setText("Productos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mArchivo.add(jMenuItem2);

        jMenuBar2.add(mArchivo);

        mReservas.setText("Reservas");

        jMenuItem3.setText("Reservas y consumos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mReservas.add(jMenuItem3);

        jMenuItem4.setText("Clientes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mReservas.add(jMenuItem4);

        jMenuItem5.setText("Pagos");
        mReservas.add(jMenuItem5);

        jMenuBar2.add(mReservas);

        mConsultas.setText("Consultas");
        jMenuBar2.add(mConsultas);

        mConfiguraciones.setText("Configuraciones");

        jMenuItem6.setText("Usuarios y Accesos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mConfiguraciones.add(jMenuItem6);

        jMenuBar2.add(mConfiguraciones);

        mHerramientas.setText("Herramientas");
        jMenuBar2.add(mHerramientas);

        mAyuda.setText("Ayuda");

        jMenuItem7.setText("Acerca De..");
        mAyuda.add(jMenuItem7);

        jMenuItem8.setText("Ayuda");
        mAyuda.add(jMenuItem8);

        jMenuBar2.add(mAyuda);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
        
    }//GEN-LAST:event_btnIngresarMouseEntered

    private void jMenuBar2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jMenuBar2MouseDragged

    private void jMenuBar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jMenuBar2MousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        vHabitacion form = new vHabitacion();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        vReserva form = new vReserva();
        form.toFront();
        form.setVisible(true);
        vReserva.txtIdTrabajador.setText(lblIdPersona.getText());
        vReserva.txtTrabajador.setText(lblNombre.getText() + " " + lblApaterno.getText());
        vReserva.idusuario=Integer.parseInt(lblIdPersona.getText());
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
            vProducto form = new vProducto();
            form.toFront();
            form.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
            vCliente form = new vCliente();
            form.toFront();
            form.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        vTrabajador form = new vTrabajador();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void btnIngresar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresar1MouseEntered

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
           System.exit(0);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnMaximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizarMouseClicked
       this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnMaximizarMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
           this.setExtendedState(ICONIFIED);

    }//GEN-LAST:event_btnMinimizarMouseClicked
    
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
            java.util.logging.Logger.getLogger(FormularioRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Escritorio;
    private javax.swing.JPanel HeadParque;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JPanel btnIngresar;
    private javax.swing.JPanel btnIngresar1;
    private javax.swing.JLabel btnMaximizar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    public static javax.swing.JLabel lblAcceso;
    public static javax.swing.JLabel lblAmaterno;
    public static javax.swing.JLabel lblApaterno;
    public static javax.swing.JLabel lblIdPersona;
    public static javax.swing.JLabel lblNombre;
    public static javax.swing.JMenu mArchivo;
    private javax.swing.JMenu mAyuda;
    public static javax.swing.JMenu mConfiguraciones;
    private javax.swing.JMenu mConsultas;
    private javax.swing.JMenu mHerramientas;
    private javax.swing.JMenu mReservas;
    private javax.swing.JMenu mSistemaReserva;
    // End of variables declaration//GEN-END:variables
}
