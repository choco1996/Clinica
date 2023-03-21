/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;

/**
 *
 * @author David
 */
public class BuscarEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form BuscarEmpleado
     */
    public BuscarEmpleado() {
        initComponents();
        mostrarCodigo("");
        Cerrar();
      
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
    }
String tipo;
public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/caduceo (1).png"));


        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tape = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tdir = new javax.swing.JTextField();
        tid = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ttel = new javax.swing.JFormattedTextField();
        tcod = new javax.swing.JTextField();
        tnom = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        btbuscar = new javax.swing.JButton();
        tbus = new javax.swing.JTextField();
        BTactualizar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        conape = new javax.swing.JLabel();
        comnom = new javax.swing.JLabel();
        jCfiltro = new javax.swing.JComboBox<>();
        comnom1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Busqueda Empleado");
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(1118, 546));
        setMinimumSize(new java.awt.Dimension(1118, 546));
        setPreferredSize(new java.awt.Dimension(1118, 546));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Identidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Apellido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Telefono");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        tape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tapeKeyTyped(evt);
            }
        });
        getContentPane().add(tape, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 297, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Direccion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        tdir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tdirKeyTyped(evt);
            }
        });
        getContentPane().add(tdir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 296, -1));

        try {
            tid.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 297, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Codigo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caduceo (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        try {
            ttel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(ttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 296, -1));

        tcod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tcodKeyTyped(evt);
            }
        });
        getContentPane().add(tcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 297, -1));

        tnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tnomKeyTyped(evt);
            }
        });
        getContentPane().add(tnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 297, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Doctor/Dentista");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jRadioButton3.setText("Secretaria");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jRadioButton2.setText("Enfermera");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Tipo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jRadioButton1)
                        .addGap(66, 66, 66)
                        .addComponent(jRadioButton3)
                        .addGap(60, 60, 60)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(50, 50, 50))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCliente);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 530, 250));

        btbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenessubmenucita/icons8-Búsqueda-40.png"))); // NOI18N
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 75, -1));

        tbus.setText("Buscar....");
        tbus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tbusFocusLost(evt);
            }
        });
        tbus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbusMouseClicked(evt);
            }
        });
        tbus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbusKeyTyped(evt);
            }
        });
        getContentPane().add(tbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 297, -1));

        BTactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenessubmenucita/icons8-Actualizaciones disponibles-40.png"))); // NOI18N
        BTactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(BTactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 83, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Buscar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("Actualizar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));

        conape.setForeground(new java.awt.Color(255, 0, 0));
        conape.setText("1");
        conape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                conapeKeyTyped(evt);
            }
        });
        getContentPane().add(conape, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 270, 10));

        comnom.setForeground(new java.awt.Color(255, 0, 0));
        comnom.setText("1");
        comnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                comnomKeyTyped(evt);
            }
        });
        getContentPane().add(comnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 270, 10));

        jCfiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Identidad", "Nombre", "Apellido" }));
        jCfiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCfiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCfiltroActionPerformed(evt);
            }
        });
        getContentPane().add(jCfiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 90, 30));

        comnom1.setForeground(new java.awt.Color(255, 0, 0));
        comnom1.setText("1");
        comnom1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                comnom1KeyTyped(evt);
            }
        });
        getContentPane().add(comnom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 270, 10));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void mostrarCodigo(String valor1){
Conection cc= new Conection();
Connection cn =  cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Identidad");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Tipo Empleado");

        jTableCliente.setModel(modelo);
        String sql = "";
        if(valor1.equals(""))
        {
            sql = "SELECT * from empleado";
        }
        else
        {
            sql = "SELECT * from empleado where cod_empleado ='"+valor1+"'";
        }
        String []datos = new String [7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                datos [0] = rs.getString(1);
                datos [1] = rs.getString(2);
                datos [2] = rs.getString(3);
                datos [3] = rs.getString(4);
                datos [4] = rs.getString(5);
                datos [5] = rs.getString(6);
                switch (rs.getString(7)) {
               case "1":
                   datos [6]="Doctor(a)";
                   break;
               case "2":
                   datos [6]="Secretario(a)";
                   break;
               case "3":
                   datos [6]="Enfermera(a)";
                   break;
               default:
                    break;
           }
                tipo=rs.getString(7);
                  modelo.addRow(datos);
            }
           // jtb_consulta_venta_auto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }}
public void mostrarIdentidad(String valor1){
Conection cc= new Conection();
Connection cn =  cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Identidad");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Tipo Empleado");

        jTableCliente.setModel(modelo);
        String sql = "";
        if(valor1.equals(""))
        {
            sql = "SELECT * from empleado";
        }
        else
        {
            sql = "SELECT * from empleado where id_empleado LIKE '%"+valor1+"%'";
        }
        String []datos = new String [7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                datos [0] = rs.getString(1);
                datos [1] = rs.getString(2);
                datos [2] = rs.getString(3);
                datos [3] = rs.getString(4);
                datos [4] = rs.getString(5);
                datos [5] = rs.getString(6);
                switch (rs.getString(7)) {
               case "1":
                   datos [6]="Doctor(a)";
                   break;
               case "2":
                   datos [6]="Secretario(a)";
                   break;
               case "3":
                   datos [6]="Enfermera(a)";
                   break;
               default:
                    break;
           }
                tipo=rs.getString(7);
                  modelo.addRow(datos);
            }
           // jtb_consulta_venta_auto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }}

public void mostrarNombre(String valor1){
Conection cc= new Conection();
Connection cn =  cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Identidad");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Tipo Empleado");

        jTableCliente.setModel(modelo);
        String sql = "";
        if(valor1.equals(""))
        {
            sql = "SELECT * from empleado";
        }
        else
        { 
            sql = "SELECT * FROM empleado where nombre LIKE '%"+valor1+"%'";
        }
        String []datos = new String [7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                datos [0] = rs.getString(1);
                datos [1] = rs.getString(2);
                datos [2] = rs.getString(3);
                datos [3] = rs.getString(4);
                datos [4] = rs.getString(5);
                datos [5] = rs.getString(6);
                switch (rs.getString(7)) {
               case "1":
                   datos [6]="Doctor(a)";
                   break;
               case "2":
                   datos [6]="Secretario(a)";
                   break;
               case "3":
                   datos [6]="Enfermera(a)";
                   break;
               default:
                    break;
           }
                tipo=rs.getString(7);
                  modelo.addRow(datos);
            }
           // jtb_consulta_venta_auto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }}

public void mostrarApellido(String valor1){
Conection cc= new Conection();
Connection cn =  cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Identidad");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Tipo Empleado");

        jTableCliente.setModel(modelo);
        String sql = "";
        if(valor1.equals(""))
        {
            sql = "SELECT * from empleado";
        }
        else
        {
            sql = "SELECT * from empleado where apellido LIKE '%"+valor1+"%'";
        }
        String []datos = new String [7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                datos [0] = rs.getString(1);
                datos [1] = rs.getString(2);
                datos [2] = rs.getString(3);
                datos [3] = rs.getString(4);
                datos [4] = rs.getString(5);
                datos [5] = rs.getString(6);
                switch (rs.getString(7)) {
               case "1":
                   datos [6]="Doctor(a)";
                   break;
               case "2":
                   datos [6]="Secretario(a)";
                   break;
               case "3":
                   datos [6]="Enfermera(a)";
                   break;
               default:
                    break;
           }
                tipo=rs.getString(7);
                  modelo.addRow(datos);
            }
           // jtb_consulta_venta_auto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }}

 



    private void tapeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tapeKeyTyped
        int limite=35;
        if (tape.getText().length()>=limite){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo 35 Caracteres");
        }
        char c=evt.getKeyChar();

        if(Character.isDigit(c)) {
            JOptionPane.showMessageDialog(rootPane,"Solo Letras");

        }
    }//GEN-LAST:event_tapeKeyTyped

    private void tdirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tdirKeyTyped
        int limite=70;
        if (tdir.getText().length()>=limite){
            
            JOptionPane.showMessageDialog(rootPane, "Solo 70 Caracteres");
        }

    }//GEN-LAST:event_tdirKeyTyped

    private void tnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnomKeyTyped
        int limite=35;
        if (tnom.getText().length()>=limite){
            
            JOptionPane.showMessageDialog(rootPane, "Solo 35 Caracteres");
        }
        char c=evt.getKeyChar();

        if(Character.isDigit(c)) {
            
            JOptionPane.showMessageDialog(rootPane,"Solo Letras");

        }
    }//GEN-LAST:event_tnomKeyTyped

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
    int index=jCfiltro.getSelectedIndex()+1;
        switch (index) {
               case 1:
                   mostrarCodigo(tbus.getText());
                   break;
               case 2:
                   mostrarIdentidad(tbus.getText());
                   break;
               case 3:
                   mostrarNombre(tbus.getText());
                   break;
               case 4:
                   mostrarApellido(tbus.getText());
                   break;
               
               default:
                    break;
           } 
    }//GEN-LAST:event_btbuscarActionPerformed

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
    String stipo;
        int fila= jTableCliente.getSelectedRow();
        if(fila>=0){
            tcod.setText(jTableCliente.getValueAt(fila, 0).toString());
            tid.setText(jTableCliente.getValueAt(fila, 1).toString());
            tnom.setText(jTableCliente.getValueAt(fila, 2).toString());
            tape.setText(jTableCliente.getValueAt(fila, 3).toString());
            tdir.setText(jTableCliente.getValueAt(fila, 4).toString());
            ttel.setText(jTableCliente.getValueAt(fila, 5).toString());
            stipo=(jTableCliente.getValueAt(fila, 6).toString());
            switch (stipo) {
               case "Doctor(a)":
                   jRadioButton1.setSelected(rootPaneCheckingEnabled);
                   break;
               case "Secretario(a)":
                   jRadioButton2.setSelected(rootPaneCheckingEnabled);
                   break;
               case "Enfermera(a)":
                   jRadioButton3.setSelected(rootPaneCheckingEnabled);
                   break;
               default:
                    break;
           }
           System.out.println(tipo);

            /*selec=(jTableCliente.getValueAt(fila, 6).toString());
            cbTipoEmpleado.setSelectedIndex(Integer.parseInt(selec)-1);*/
        }
      
    }//GEN-LAST:event_jTableClienteMouseClicked

    private void tbusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbusFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tbusFocusLost

    private void tbusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbusKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tbusKeyTyped

    private void tbusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbusMouseClicked
tbus.setText("");
    }//GEN-LAST:event_tbusMouseClicked

    private void BTactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTactualizarActionPerformed
        int tipo;
        Conection cc= new Conection();
        Connection cn =  cc.conexion();
        String id,nom,ape,tel,dir;
        int cod;
        String sql="";

        cod= Integer.parseInt(tcod.getText());
        id=tid.getText();
        nom=tnom.getText();
        ape=tape.getText();
        dir=tdir.getText();
        tel=ttel.getText();
        if(jRadioButton1.isSelected()){
            tipo=1;
        }else
        if(jRadioButton2.isSelected()){
            tipo=2;
        }else{
            tipo=3;}
        try {
            sql="UPDATE Empleado SET id_empleado=?, nombre=?, apellido=?, direccion=?, telefono=? WHERE cod_empleado=?";
            PreparedStatement psd=cn.prepareStatement(sql);
            psd.setString(1,id);
            psd.setString(2,nom);
            psd.setString(3,ape);
            psd.setString(4,dir);
            psd.setString(5,tel);
            psd.setInt(6,cod);
            psd.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
 mostrarCodigo("");
    }//GEN-LAST:event_BTactualizarActionPerformed

    private void tcodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcodKeyTyped

    }//GEN-LAST:event_tcodKeyTyped

    private void comnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comnomKeyTyped
  int limite=70;
        if (tdir.getText().length()>=limite){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo 70 Caracteres");
        }
    }//GEN-LAST:event_comnomKeyTyped

    private void conapeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_conapeKeyTyped
int limite=35;
        if (tape.getText().length()>=limite){
            evt.consume();
            conape.setVisible(true);
            conape.setText("Solo 35 Caracteres");
        }
    char c=evt.getKeyChar(); 
          if(Character.isDigit(c)) { 
               evt.consume();
               conape.setVisible(true);
               conape.setText("Solo Letras");
          }          // TODO add your handling code here:
    }//GEN-LAST:event_conapeKeyTyped

    private void comnom1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comnom1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_comnom1KeyTyped

    private void jCfiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCfiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCfiltroActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed
public void Cerrar(){
    
        try{
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
            confirmarSalida();
            }
        });
    }catch(Exception e){
    e.printStackTrace();
    }
    }
    public void confirmarSalida(){
  int valor=JOptionPane.showConfirmDialog(this,"¿Esta Seguro de Cerrar?","Advertencia",JOptionPane.YES_NO_OPTION);
    if(valor==JOptionPane.YES_OPTION){
         Empleados mAD=new Empleados(); 
         mAD.setVisible(true);
         dispose();
    }
  }
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
            java.util.logging.Logger.getLogger(BuscarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTactualizar;
    private javax.swing.JButton btbuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel comnom;
    private javax.swing.JLabel comnom1;
    private javax.swing.JLabel conape;
    private javax.swing.JComboBox<String> jCfiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField tape;
    private javax.swing.JTextField tbus;
    private javax.swing.JTextField tcod;
    private javax.swing.JTextField tdir;
    private javax.swing.JFormattedTextField tid;
    private javax.swing.JTextField tnom;
    private javax.swing.JFormattedTextField ttel;
    // End of variables declaration//GEN-END:variables
}
