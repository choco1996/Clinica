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

/**
 *
 * @author Bruce
 */
public class Empleados extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    
    public Empleados() {
        initComponents();
        COD();
        Cerrar();
        comcod.setVisible(false);
        comnom.setVisible(false);
        conape.setVisible(false);
     
    }
  public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/caduceo (1).png"));


        return retValue;
    }
PreparedStatement preparedStatement;
PreparedStatement Consulta;
ResultSet resultSet;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tape = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tdir = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tcod = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        BTguardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tid = new javax.swing.JFormattedTextField();
        ttel = new javax.swing.JFormattedTextField();
        tnom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comcod = new javax.swing.JLabel();
        comnom = new javax.swing.JLabel();
        conape = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empleados");
        setBackground(java.awt.Color.gray);
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(673, 590));
        setMinimumSize(new java.awt.Dimension(673, 590));
        setPreferredSize(new java.awt.Dimension(673, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Identidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Apellido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Telefono");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        tape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tapeKeyTyped(evt);
            }
        });
        getContentPane().add(tape, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 297, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Direccion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        tdir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tdirKeyTyped(evt);
            }
        });
        getContentPane().add(tdir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 297, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Codigo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        tcod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tcodFocusLost(evt);
            }
        });
        tcod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tcodKeyTyped(evt);
            }
        });
        getContentPane().add(tcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 297, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Doctor");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jRadioButton3.setText("Secretaria(o)");

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jRadioButton2.setText("Enfermera(o)");
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
                        .addGap(60, 60, 60)
                        .addComponent(jRadioButton1)
                        .addGap(66, 66, 66)
                        .addComponent(jRadioButton3)
                        .addGap(60, 60, 60)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(49, Short.MAX_VALUE))
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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        BTguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenessubmenucita/icons8-Guardar-40.png"))); // NOI18N
        BTguardar.setBorder(null);
        BTguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTguardarActionPerformed(evt);
            }
        });
        getContentPane().add(BTguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 83, 49));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenessubmenucita/icons8-Búsqueda-40.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 83, -1));

        try {
            tid.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 297, -1));

        try {
            ttel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(ttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 297, -1));

        tnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tnomKeyTyped(evt);
            }
        });
        getContentPane().add(tnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 297, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Guardar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("Buscar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caduceo (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        comcod.setForeground(new java.awt.Color(255, 0, 0));
        comcod.setText("1");
        getContentPane().add(comcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 270, 10));

        comnom.setForeground(new java.awt.Color(255, 0, 0));
        comnom.setText("1");
        getContentPane().add(comnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 280, 10));

        conape.setForeground(new java.awt.Color(255, 0, 0));
        conape.setText("1");
        getContentPane().add(conape, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 280, 10));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed
public void COD(){
       Conection cc= new Conection();
        Connection cn =  cc.conexion();
        String id,tel,dir,nom,ape;
        String sql="";
        int cod,cod1;
        sql = "SELECT count(*) from empleado";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                cod=rs.getInt(1);
                cod1=cod+1;
                 tcod.setText(String.valueOf((cod1)));
            }
           // jtb_consulta_venta_auto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
            }


public void Limpiar(){
  tnom.setText("");
  tape.setText("");
  tcod.setText("");
  tdir.setText("");
  ttel.setText("");
  tid.setText("");
}

    private void BTguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTguardarActionPerformed
        int tipo;
        Conection cc= new Conection();
        Connection cn =  cc.conexion();
        String id,tel,dir,nom,ape;
        String sql="";
        int cod;
        cod= Integer.parseInt(tcod.getText());
        id= tid.getText();
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
        
        
        sql= "INSERT INTO Empleado(cod_empleado,id_empleado,nombre,apellido,direccion,telefono,cod_tipoempleado) VALUES(?,?,?,?,?,?,?)";

        try {
            PreparedStatement psd=  cn.prepareStatement(sql);
            psd.setInt(1, cod);
            psd.setString(2, id);
            psd.setString(3, nom);
            psd.setString(4, ape);
            psd.setString(5, dir);
            psd.setString(6, tel);
            psd.setInt(7, tipo);
  
            int n=psd.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
       Limpiar();
       COD();
    }//GEN-LAST:event_BTguardarActionPerformed
  
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
         Administrador mAD=new Administrador(); 
         mAD.setVisible(true);
         dispose();
    }
  }
    /**
     * @param args the command line arguments
     */
    private void tnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnomKeyTyped
    int limite=35;
        if (tnom.getText().length()>=limite){
            evt.consume();
            comnom.setVisible(true);
            comnom.setText("Solo 35 Caracteres");
        }
    char c=evt.getKeyChar(); 
                   
          if(Character.isDigit(c)) { 
              evt.consume(); 
              comnom.setVisible(true);
              comnom.setText("Solo Letras");
               
          }
    }//GEN-LAST:event_tnomKeyTyped

    private void tapeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tapeKeyTyped
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
          }  
    }//GEN-LAST:event_tapeKeyTyped

    private void tcodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tcodFocusLost
Conection cc= new Conection();
Connection cn =  cc.conexion();
int com;
     try{  
          com=Integer.parseInt(tcod.getText());
          Consulta = cn.prepareStatement("Select * From empleado where cod_empleado='"+com+"'");
          resultSet=Consulta.executeQuery(); 
         if (resultSet.next()){
         comcod.setVisible(true);
         comcod.setText("Este codigo ya Existe");
         }
         else{
         comcod.setVisible(false);
         }
     }catch(Exception e){
         System.out.println(e);
     }   
    }//GEN-LAST:event_tcodFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
BuscarEmpleado mAD=new BuscarEmpleado(); 
         mAD.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tcodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcodKeyTyped
      int limite=5;
        if (tnom.getText().length()>=limite){
            evt.consume();
            comcod.setVisible(true);
            comcod.setText("Maximo 5 Numeros");
        }
        else{
        comcod.setVisible(false);
         
        }
    char c=evt.getKeyChar(); 
                   
          if(Character.isLetter(c)) { 
                          
              evt.consume(); 
              comcod.setVisible(true);
              comcod.setText("Solo numeros");
               
          }
          else{
              comcod.setVisible(false);
               
          }
    }//GEN-LAST:event_tcodKeyTyped

    private void tdirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tdirKeyTyped
    int limite=70;
        if (tdir.getText().length()>=limite){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo 70 Caracteres");
        }
    }//GEN-LAST:event_tdirKeyTyped

  
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
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTguardar;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel comcod;
    private javax.swing.JLabel comnom;
    private javax.swing.JLabel conape;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField tape;
    private javax.swing.JTextField tcod;
    private javax.swing.JTextField tdir;
    private javax.swing.JFormattedTextField tid;
    private javax.swing.JTextField tnom;
    private javax.swing.JFormattedTextField ttel;
    // End of variables declaration//GEN-END:variables
}