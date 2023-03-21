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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruce
 */
public class Internar extends javax.swing.JFrame {

    /**
     * Creates new form Internar
     */
    public Internar() {
        initComponents();
        mostrarEmpleado("");
        mostrarEmpleado2("");
         Tfecha.setText(fe);
         comid.setVisible(false);
         mostrarHabitaciones("");
Tdoc.setVisible(false);
Tenfe.setVisible(false);
Cerrar();
    }
public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/caduceo (1).png"));


        return retValue;
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
         MenuInternar mAD=new MenuInternar(); 
         mAD.setVisible(true);
         dispose();
    }
  }

    
    Calendar Cal = new GregorianCalendar();
     String fe= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
    
     
     public void mostrarEmpleado(String valor1){
Conection cc= new Conection();
Connection cn =  cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        int v=1;
        
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
       
        JTdoctor.setModel(modelo);
        String sql = "";
        
        if(valor1.equals("1"))
        {
            sql = "SELECT cod_empleado,nombre,apellido from empleado";
        }
        else
        {
            sql = "SELECT cod_empleado,nombre,apellido from empleado where cod_tipoempleado ='"+v+"'";
        }
        String []datos = new String [3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                datos [0] = rs.getString(1);
                datos [1] = rs.getString(2);
                datos [2] = rs.getString(3);
            
          
                  modelo.addRow(datos);
            }
           // jtb_consulta_venta_auto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }}
    
public void mostrarHabitaciones(String valor1){
Conection cc= new Conection();
Connection cn =  cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        int v=1;
        
        modelo.addColumn("Cod");
        
        modelo.addColumn("Disponible");
       
        jTh.setModel(modelo);
        String sql = "";
        
        if(valor1.equals("1"))
        {
            sql = "SELECT cod_habitacion,Disponibilidad from habitacion";
        }
        else
        {
            sql = "SELECT cod_habitacion,Disponibilidad from habitacion where Disponibilidad ='"+v+"'";
        }
        String []datos = new String [3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                datos [0] = rs.getString(1);
          
                      switch (rs.getString(2)) {
               case "0":
                   datos [1]="";
                   break;
               case "1":
                   datos [1]="Disponible";
                   break;
               
               default:
                    break;
           }
            
          
                  modelo.addRow(datos);
            }
           // jtb_consulta_venta_auto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }}
public void mostrarEmpleado2(String valor1){
Conection cc= new Conection();
Connection cn =  cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        int v=2;
        
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
       
        JTenfermera.setModel(modelo);
        String sql = "";
        
        if(valor1.equals("1"))
        {
            sql = "SELECT cod_empleado,nombre,apellido from empleado";
        }
        else
        {
            sql = "SELECT cod_empleado,nombre,apellido from empleado where cod_tipoempleado ='"+v+"'";
        }
        String []datos = new String [3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                datos [0] = rs.getString(1);
                datos [1] = rs.getString(2);
                datos [2] = rs.getString(3);
            
          
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Tenfe = new javax.swing.JTextField();
        Tdoc = new javax.swing.JTextField();
        Tfecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTdoctor = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTenfermera = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Tpa = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTh = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        Thab = new javax.swing.JTextField();
        comid = new javax.swing.JLabel();
        Tdoct = new javax.swing.JTextField();
        Tenferm = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Internacion");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(802, 331));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("Internar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Enfermera");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Doctor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Fecha Ingreso");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));
        getContentPane().add(Tenfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 165, -1));
        getContentPane().add(Tdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 165, -1));
        getContentPane().add(Tfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 165, -1));

        JTdoctor.setModel(new javax.swing.table.DefaultTableModel(
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
        JTdoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTdoctorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTdoctor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 250, 98));

        JTenfermera.setModel(new javax.swing.table.DefaultTableModel(
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
        JTenfermera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTenfermeraMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTenfermera);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 250, 100));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenessubmenucita/icons8-Door Opened-40.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        try {
            Tpa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Tpa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TpaFocusLost(evt);
            }
        });
        getContentPane().add(Tpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 165, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Habitacion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Habitacion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Enfermera");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caduceo (1).png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Paciente");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jTh.setModel(new javax.swing.table.DefaultTableModel(
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
        jTh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jThMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTh);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 250, 100));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Doctor");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));
        getContentPane().add(Thab, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 165, -1));

        comid.setText("Paciente");
        getContentPane().add(comid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 370, 10));
        getContentPane().add(Tdoct, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 160, -1));
        getContentPane().add(Tenferm, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 160, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTdoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTdoctorMouseClicked
  int fila= JTdoctor.getSelectedRow();
        if(fila>=0){
            Tdoc.setText(JTdoctor.getValueAt(fila, 0).toString());
     
          int fila1= JTdoctor.getSelectedRow();
        if(fila1>=0){
            Tdoct.setText(JTdoctor.getValueAt(fila1, 1).toString());

            /*selec=(jTableCliente.getValueAt(fila, 6).toString());
            cbTipoEmpleado.setSelectedIndex(Integer.parseInt(selec)-1);*/
        }} 
    }//GEN-LAST:event_JTdoctorMouseClicked

    private void JTenfermeraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTenfermeraMouseClicked
  int fila= JTenfermera.getSelectedRow();
        if(fila>=0){
            Tenfe.setText(JTenfermera.getValueAt(fila, 0).toString());
     int fila1= JTenfermera.getSelectedRow();
        if(fila1>=0){
            Tenferm.setText(JTenfermera.getValueAt(fila1, 1).toString());
     
         

            /*selec=(jTableCliente.getValueAt(fila, 6).toString());
            cbTipoEmpleado.setSelectedIndex(Integer.parseInt(selec)-1);*/
        }
         

            /*selec=(jTableCliente.getValueAt(fila, 6).toString());
            cbTipoEmpleado.setSelectedIndex(Integer.parseInt(selec)-1);*/
        }
    }//GEN-LAST:event_JTenfermeraMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int doc,enf;
        Conection cc= new Conection();
        Connection cn =  cc.conexion();
        String pa,ha,fecha;
        String sql="";
        
       ha= Thab.getText();
        pa= Tpa.getText();
        doc=Integer.parseInt(Tdoc.getText());
        enf=Integer.parseInt(Tenfe.getText());
        
        fecha=Tfecha.getText();
        

       sql= "INSERT INTO Internar(cod_habitacion,identidad,codigo_enfermera,codigo_doctor,fechaIngreso,FechaSalida) VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement psd=  cn.prepareStatement(sql);
            psd.setString(1,ha);
            psd.setString(2, pa);
            psd.setInt(3, enf);
            psd.setString(5, fecha);
            psd.setInt(4, doc);
            psd.setString(6, " ");
            int n=psd.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       sql= "UPDATE Habitacion SET disponibilidad=? WHERE cod_habitacion=?";

        try {
            PreparedStatement psd=cn.prepareStatement(sql);
            psd.setInt(1,0);
            psd.setString(2,ha);
            int n=psd.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
      mostrarHabitaciones("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TpaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TpaFocusLost
 comid.setVisible(true);
        ResultSet rs = null;
        Statement st = null;
       try {
             
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicor2","root","");
              st = conn.createStatement();
              rs = st.executeQuery("SELECT nombre,apellido,sexo,edad from persona where identidad ='"+Tpa.getText()+"'");
//              SELECT `nombre`, `apellido` FROM `empleado`  WHERE `cod_tipoempleado`= 1

            while(rs.next()){
             
                String x;
               String v = rs.getString("nombre");
               String tmpStrObtenido1 = rs.getString("apellido");
               String t = rs.getString("sexo");
               String tmpStrObtenido3 = rs.getString("edad");
               String v2= "Nombre: "+v+" "+tmpStrObtenido1+" "+"Sexo: "+t+" "+"Edad: "+tmpStrObtenido3;
              
               comid.setText(v2);
               System.out.println(v2);
               
           }
            
          conn.close();
         } catch (Exception e) {
             
             e.printStackTrace();
             return;
         }          // TODO add your handli        // TODO add your handling code here:
    }//GEN-LAST:event_TpaFocusLost

    private void jThMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jThMouseClicked
int fila= jTh.getSelectedRow();
        if(fila>=0){
            Thab.setText(jTh.getValueAt(fila, 0).toString());
     
         

            /*selec=(jTableCliente.getValueAt(fila, 6).toString());
            cbTipoEmpleado.setSelectedIndex(Integer.parseInt(selec)-1);*/
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jThMouseClicked

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
            java.util.logging.Logger.getLogger(Internar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Internar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Internar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Internar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Internar().setVisible(true);
            }
        });
    

         }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTdoctor;
    private javax.swing.JTable JTenfermera;
    private javax.swing.JTextField Tdoc;
    private javax.swing.JTextField Tdoct;
    private javax.swing.JTextField Tenfe;
    private javax.swing.JTextField Tenferm;
    private javax.swing.JTextField Tfecha;
    private javax.swing.JTextField Thab;
    private javax.swing.JFormattedTextField Tpa;
    private javax.swing.JLabel comid;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTh;
    // End of variables declaration//GEN-END:variables
}
