/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruce
 */
public class BuscarPaciente extends javax.swing.JFrame {

    /**
     * Creates new form BuscarPaciente
     */
    public BuscarPaciente() {
        initComponents();
        mostrarEmpleado("");
        comnom.setVisible(false);
        comnom2.setVisible(false);
        comedad.setVisible(false);
        Cerrar();
    }
    String tipo;
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/caduceo (1).png"));


        return retValue;
    }
    public void mostrarNombre(String valor1){
Conection cc= new Conection();
Connection cn =  cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        valor1=tbus.getText();
        modelo.addColumn("Identidad");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        modelo.addColumn("Edad");
        modelo.addColumn("Sexo");
        modelo.addColumn("Responde");
        modelo.addColumn("Reside");

        jTableCliente.setModel(modelo);
        String sql = "";
        if(valor1.equals(""))
        {
            sql = "SELECT * from persona";
        }
        else
        { 
            sql = "SELECT * FROM persona where nombre LIKE '%"+valor1+"%'";
        }
        String []datos = new String [8];
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
                datos [6] = rs.getString(7);
                datos [7] = rs.getString(8);
               
            
           
                
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
        
        modelo.addColumn("Identidad");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        
        modelo.addColumn("Telefono");
        modelo.addColumn("Edad");
        modelo.addColumn("Sexo");
        modelo.addColumn("Responde");
        modelo.addColumn("Reside");

        jTableCliente.setModel(modelo);
        String sql = "";
        if(valor1.equals(""))
        {
            sql = "SELECT * from persona";
        }
        else
        { 
            sql = "SELECT * FROM persona where apellido LIKE '%"+valor1+"%'";
        }
        String []datos = new String [8];
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
                datos [6] = rs.getString(7);
                datos [7] = rs.getString(8);
            
           
                
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
        
        modelo.addColumn("Identidad");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        
        modelo.addColumn("Telefono");
        modelo.addColumn("Edad");
        modelo.addColumn("Sexo");
        modelo.addColumn("Responde");
        modelo.addColumn("Reside");

        jTableCliente.setModel(modelo);
        String sql = "";
        if(valor1.equals(""))
        {
            sql = "SELECT * from persona";
        }
        else
        { 
            sql = "SELECT * FROM persona where identidad LIKE '%"+valor1+"%'";
        }
        String []datos = new String [8];
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
                datos [6] = rs.getString(7);
                datos [7] = rs.getString(8);
            
           
                
                  modelo.addRow(datos);
            }
           // jtb_consulta_venta_auto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }}
    public void mostrarEmpleado(String valor1){
Conection cc= new Conection();
Connection cn =  cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel();
       
        modelo.addColumn("Identidad");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        modelo.addColumn("Edad");
        modelo.addColumn("Sexo");
        modelo.addColumn("Responde");

        jTableCliente.setModel(modelo);
        String sql = "";
        if(valor1.equals(""))
        {
            sql = "SELECT * from persona";
        }
        else
        {
            sql = "SELECT * from persona where identidad ='"+valor1+"'";
        }
        String []datos = new String [8];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                datos [0] = rs.getString(1);
                datos [1] = rs.getString(2);
                datos [2] = rs.getString(3);
                datos [3] = rs.getString(4);
                datos [4] = rs.getString(5);
                datos [6] = rs.getString(7);
                datos [7] = rs.getString(8);
            switch (rs.getString(6)) {
               case "M":
                   datos [5]="Masculino";
                   break;
               case "F":
                   datos [5]="Femenino";
                   break;
              
               default:
                    break;
           }
                datos [6] = rs.getString(7);
                tipo=rs.getString(6);
                  modelo.addRow(datos);
            }
           // jtb_consulta_venta_auto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tid = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        btbuscar = new javax.swing.JButton();
        tbus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BTactualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tnom = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tape = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tedad = new javax.swing.JTextField();
        ttel = new javax.swing.JFormattedTextField();
        comnom = new javax.swing.JLabel();
        comnom2 = new javax.swing.JLabel();
        comedad = new javax.swing.JLabel();
        jCfiltro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscar Paciente");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        try {
            tid.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 297, -1));

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 502, 250));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Identidad");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        btbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenessubmenucita/icons8-Búsqueda-40.png"))); // NOI18N
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 75, -1));

        tbus.setText("Ingrese Codigo a Buscar");
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
        tbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbusActionPerformed(evt);
            }
        });
        tbus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbusKeyTyped(evt);
            }
        });
        getContentPane().add(tbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 297, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Apellido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        BTactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenessubmenucita/icons8-Actualizaciones disponibles-40.png"))); // NOI18N
        BTactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(BTactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 83, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        tnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tnomKeyTyped(evt);
            }
        });
        getContentPane().add(tnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 297, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Buscar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Masculino");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jRadioButton2.setText("Femenino");
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
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(50, 50, 50))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("Actualizar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Edad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        tape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tapeKeyTyped(evt);
            }
        });
        getContentPane().add(tape, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 297, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Responde");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        tres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tresKeyTyped(evt);
            }
        });
        getContentPane().add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 300, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caduceo (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        tedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tedadKeyTyped(evt);
            }
        });
        getContentPane().add(tedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 300, -1));

        try {
            ttel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(ttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 300, -1));

        comnom.setForeground(new java.awt.Color(255, 0, 0));
        comnom.setText("1");
        getContentPane().add(comnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 270, 10));

        comnom2.setForeground(new java.awt.Color(255, 0, 0));
        comnom2.setText("1");
        getContentPane().add(comnom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 270, 10));

        comedad.setForeground(new java.awt.Color(255, 0, 0));
        comedad.setText("1");
        comedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                comedadKeyTyped(evt);
            }
        });
        getContentPane().add(comedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 270, 10));

        jCfiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Identidad", "Nombre", "Apellido" }));
        jCfiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCfiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCfiltroActionPerformed(evt);
            }
        });
        getContentPane().add(jCfiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 90, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        String stipo;
        int fila= jTableCliente.getSelectedRow();
        if(fila>=0){
            tid.setText(jTableCliente.getValueAt(fila, 0).toString());
            tnom.setText(jTableCliente.getValueAt(fila, 1).toString());
            tape.setText(jTableCliente.getValueAt(fila, 2).toString());
            tedad.setText(jTableCliente.getValueAt(fila, 4).toString());
            ttel.setText(jTableCliente.getValueAt(fila, 3).toString());
             
            stipo=(jTableCliente.getValueAt(fila, 5).toString());
            switch (stipo) {
                case "Masculino":
                jRadioButton1.setSelected(rootPaneCheckingEnabled);
                break;
                case "Femenino":
                jRadioButton2.setSelected(rootPaneCheckingEnabled);
                break;
                
                default:
                break;
            }
            tres.setText(jTableCliente.getValueAt(fila, 6).toString());
            System.out.println(tipo);

            /*selec=(jTableCliente.getValueAt(fila, 6).toString());
            cbTipoEmpleado.setSelectedIndex(Integer.parseInt(selec)-1);*/
        }

    }//GEN-LAST:event_jTableClienteMouseClicked

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
      int index=jCfiltro.getSelectedIndex()+1;
        switch (index) {
      
               case 1:
                   mostrarIdentidad(tbus.getText());
                   break;
               case 2:
                   mostrarNombre(tbus.getText());
                   break;
               case 3:
                   mostrarApellido(tbus.getText());
                   break;
               
               default:
                    break;
           } 
    }//GEN-LAST:event_btbuscarActionPerformed

    private void tbusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbusFocusLost
    
    }//GEN-LAST:event_tbusFocusLost

    private void tbusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbusMouseClicked
    tbus.setText("");
    }//GEN-LAST:event_tbusMouseClicked

    private void tbusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbusKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tbusKeyTyped

    private void BTactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTactualizarActionPerformed
         
        Conection cc= new Conection();
        Connection cn =  cc.conexion();
        String id,nom,ape,edad,tel,res,tipo;
        
        String sql="";

        
        id=tid.getText();
        nom=tnom.getText();
        ape=tape.getText();
        res=tres.getText();
        tel=ttel.getText();
        edad=tedad.getText();
        if(jRadioButton1.isSelected()){
            tipo="M";
        }else
            tipo="F";
        try {
            sql="UPDATE persona SET identidad=?, nombre=?, apellido=?, telefono=?, edad=?,sexo=?, responde=? WHERE identidad=?";
            PreparedStatement psd=cn.prepareStatement(sql);
            
            psd.setString(1,id);
            psd.setString(2,nom);
            psd.setString(3,ape);
            psd.setString(4,tel);
            psd.setString(5,edad);
            psd.setString(6,tipo);
            psd.setString(7,res);
            psd.setString(8,id);
            psd.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrarEmpleado("");
    }//GEN-LAST:event_BTactualizarActionPerformed

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

    private void tresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tresKeyTyped
        int limite=70;
        if (tres.getText().length()>=limite){

            JOptionPane.showMessageDialog(rootPane, "Solo 70 Caracteres");
        }
    }//GEN-LAST:event_tresKeyTyped

    private void tedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tedadKeyTyped
char c=evt.getKeyChar(); 
                   
          if(Character.isLetter(c)) { 
                          
              evt.consume(); 
              comedad.setVisible(true);
              comedad.setText("Solo numeros");
               
          }
          else{
              comedad.setVisible(false);
               
          }
      if(c<'0' || c>'9')evt.consume();   // TODO add your handling code here:
    }//GEN-LAST:event_tedadKeyTyped

    private void comedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comedadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_comedadKeyTyped

    private void jCfiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCfiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCfiltroActionPerformed

    private void tbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbusActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPaciente().setVisible(true);
            }
        });
    }
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
         CrearPaciente mAD=new CrearPaciente(); 
         mAD.setVisible(true);
         dispose();
    }
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTactualizar;
    private javax.swing.JButton btbuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel comedad;
    private javax.swing.JLabel comnom;
    private javax.swing.JLabel comnom2;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField tape;
    private javax.swing.JTextField tbus;
    private javax.swing.JTextField tedad;
    private javax.swing.JFormattedTextField tid;
    private javax.swing.JTextField tnom;
    private javax.swing.JTextField tres;
    private javax.swing.JFormattedTextField ttel;
    // End of variables declaration//GEN-END:variables
}
