/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import java.awt.HeadlessException;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author Bruce
 */
public class Expedientes extends javax.swing.JFrame {

    /**
     * Creates new form Expedientes
     */
    public Expedientes() {
        
        initComponents();
      comed.setVisible(false);
      comid.setVisible(false);
      this.setResizable(false);
      Cerrar();
      coneda.setVisible(false);
      Lfc.setVisible(false);
      Lrc.setVisible(false);
      Lte.setVisible(false);
      Lpe.setVisible(false);
//    ccod.setVisible(false);
      
       tcod.setVisible(false);
       tnom.setVisible(false);
       tape.setVisible(false);
       ttel.setVisible(false);
       tedad.setVisible(false);
       tidd.setVisible(false);
       lbfecha.setText(fe);
       lbhora.setText(horar);
      COD(); 
    }
    
     private void BuscarPaciente(){
     String  valor1=tidp.getText();
         
        
Conection cc= new Conection();
Connection cn =  cc.conexion();
      

      String Tid,nombre,apellido,telefono,edad,responde;
        String sql = "";
        if(valor1.equals(""))
        {
            sql = "SELECT * from persona";
        }
        else
        { 
            sql = "SELECT * FROM persona where identidad = '"+valor1+"'";
        }
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
               Tid     = rs.getString(1);
               nombre  = rs.getString(2);
                apellido = rs.getString(3);
               telefono  = rs.getString(4);
                edad = rs.getString(5);
                responde = rs.getString(8);
            
          tcod.setText(Tid);
          tnom.setText(nombre);
          tape.setText(apellido);
         
            }
              
           // jtb_consulta_venta_auto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     }
     private void BuscarDoctor(){
         Conection cc= new Conection();
            Connection cn =  cc.conexion();
        String  valor1=tmed.getText();
        String Tcod,id,nombr,apellid,te;
        String sql1 = "";
        if(valor1.equals(""))
        {
            sql1 = "SELECT * from empleado";
        }
        else
        { 
            sql1 = "SELECT * FROM empleado where cod_empleado = '"+valor1+"'";
        }
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql1);
            while (rs.next()){
               Tcod    = rs.getString(1);
               id  = rs.getString(2);
                nombr = rs.getString(3);
               apellid  = rs.getString(4);
                te = rs.getString(6);
               
            
          ttel.setText(Tcod);
          tedad.setText(id);
          tidd.setText(nombr+" "+apellid);
          teee.setText(te);
         
            }
              
           // jtb_consulta_venta_auto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
     private void SelecionarPaciente(){
           Ventas.lidentidad.setText(tcod.getText());
           Ventas.lnombre.setText(tnom.getText()+" "+tape.getText());
           
           Ventas.ldoctor.setText(tidd.getText());
           Ventas.ltel.setText(teee.getText());
           Ventas.lcoddoctor.setText(ttel.getText());
           Ventas.lidd.setText(tedad.getText());
           
           Ventas.cod_empleado=Integer.parseInt(tmed.getText());
           Ventas.cod_consulta=Integer.parseInt(ccod.getText());
           Ventas.identidad=tedad.getText();
         }
    
    
    
    
    
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/caduceo (1).png"));

	
        return retValue;
    }
     Calendar Cal = new GregorianCalendar();
     String fe= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
     String horar= Cal.get(Calendar.HOUR_OF_DAY)+":"+Cal.get(Cal.MINUTE); 

     public void Reporte(){
    Conection cc= new Conection();
try{
        String rutaInforme=System.getProperty("user.dir")+"/src/Reportes/ReporteC.jasper";
        Map parametros= new HashMap();
        parametros.put("ffecha",fe);
        parametros.put("idd",tidp.getText());
        JasperPrint informe = JasperFillManager.fillReport (rutaInforme,parametros,cc.conexion());
        JasperViewer ventanavisor = new JasperViewer(informe, false);
        ventanavisor.setTitle("Expediente");
        ventanavisor.setVisible(true);
                }
        catch (HeadlessException | JRException  e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Error en el Reporte","Error",JOptionPane.ERROR_MESSAGE );
        }
}
     
     public final void COD(){
       Conection cc= new Conection();
        Connection cn =  cc.conexion();
        String sql="";
        int cod,cod1;
        sql = "SELECT count(*) from consulta";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                cod=rs.getInt(1);
                cod1=cod+1;
                System.out.println(cod1);
                ccod.setText(String.valueOf((cod1)));
            }
           // jtb_consulta_venta_auto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
 
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
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tmed = new javax.swing.JTextField();
        tfc = new javax.swing.JTextField();
        trc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tobser = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        tt = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        tpeso = new javax.swing.JTextField();
        tidp = new javax.swing.JFormattedTextField();
        comed = new javax.swing.JLabel();
        comid = new javax.swing.JLabel();
        coneda = new javax.swing.JLabel();
        Lfc = new javax.swing.JLabel();
        Lrc = new javax.swing.JLabel();
        Lte = new javax.swing.JLabel();
        Lpe = new javax.swing.JLabel();
        ccod = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        tnom = new javax.swing.JTextField();
        tcod = new javax.swing.JTextField();
        tape = new javax.swing.JTextField();
        ttel = new javax.swing.JTextField();
        tedad = new javax.swing.JTextField();
        tidd = new javax.swing.JTextField();
        lbfecha = new javax.swing.JLabel();
        lbhora = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        teee = new javax.swing.JTextField();
        tpa = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expediente");
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(710, 660));
        setMinimumSize(new java.awt.Dimension(710, 660));
        setPreferredSize(new java.awt.Dimension(710, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("Identidad del Paciente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 140, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Fecha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Hora:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Codigo del Medico");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("P/A");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("F/C");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Temperatura");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setText("R/C");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, 30));

        tmed.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tmedFocusLost(evt);
            }
        });
        tmed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmedActionPerformed(evt);
            }
        });
        getContentPane().add(tmed, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 120, 30));

        tfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcActionPerformed(evt);
            }
        });
        tfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfcKeyTyped(evt);
            }
        });
        getContentPane().add(tfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 40, -1));

        trc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trcActionPerformed(evt);
            }
        });
        trc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                trcKeyTyped(evt);
            }
        });
        getContentPane().add(trc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 40, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Medicamento");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 600, 110, 30));

        tobser.setColumns(20);
        tobser.setLineWrap(true);
        tobser.setRows(5);
        jScrollPane2.setViewportView(tobser);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 570, 190));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caduceo (1).png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-Plan de tratamiento-40.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 80, 60));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel15.setText("Observaciones");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenessubmenucita/icons8-Búsqueda-40.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, -1, 60));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel16.setText("Nueva Consulta");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, -1, 30));

        try {
            tt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##°")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttActionPerformed(evt);
            }
        });
        tt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ttKeyTyped(evt);
            }
        });
        getContentPane().add(tt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 40, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("Peso");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, 30));

        tpeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tpesoKeyTyped(evt);
            }
        });
        getContentPane().add(tpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 40, -1));

        try {
            tidp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tidp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tidpFocusLost(evt);
            }
        });
        getContentPane().add(tidp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 120, 30));

        comed.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        comed.setText("Medico");
        getContentPane().add(comed, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 250, 20));

        comid.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        comid.setText("Paciente");
        getContentPane().add(comid, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 360, 20));

        coneda.setText("jLabel4");
        getContentPane().add(coneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 100, -1));

        Lfc.setText("jLabel4");
        getContentPane().add(Lfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 80, -1));

        Lrc.setText("jLabel5");
        getContentPane().add(Lrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 80, -1));

        Lte.setText("jLabel12");
        getContentPane().add(Lte, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 100, -1));

        Lpe.setText("jLabel17");
        getContentPane().add(Lpe, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 100, -1));
        getContentPane().add(ccod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenessubmenucita/icons8-bote-de-píldoras-de-prescripción-40.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, 60));

        tnom.setText("jTextField1");
        getContentPane().add(tnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, -1, -1));

        tcod.setText("jTextField1");
        getContentPane().add(tcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, -1, -1));

        tape.setText("jTextField1");
        getContentPane().add(tape, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, -1, -1));

        ttel.setText("jTextField1");
        getContentPane().add(ttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, -1, -1));

        tedad.setText("jTextField1");
        getContentPane().add(tedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, -1, -1));

        tidd.setText("jTextField1");
        getContentPane().add(tidd, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, -1, -1));

        lbfecha.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lbfecha.setText("Fecha");
        getContentPane().add(lbfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 30));

        lbhora.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lbhora.setText("Hora");
        getContentPane().add(lbhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel17.setText("Buscar Expediente");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, -1, 30));

        teee.setText("jTextField1");
        getContentPane().add(teee, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, -1, -1));

        try {
            tpa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 40, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tmedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmedActionPerformed

    private void tfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcActionPerformed

    private void trcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trcActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     int tipo;
        Conection cc= new Conection();
        Connection cn =  cc.conexion();
        String id,peso,pa,fc,t,obser,rc,fecha,hora;
        String sql="";
        int cod_doct,codc; 
        
       
        codc=Integer.parseInt(ccod.getText());
        cod_doct=Integer.parseInt(tmed.getText());
        id= tidp.getText();
        fc=tfc.getText();
        pa=tpa.getText();
        rc=trc.getText();
        peso=tpeso.getText();
        t=tt.getText();
        obser=tobser.getText();
        
    
        //dir=tdir.getText();
        
 sql= "INSERT INTO consulta(cod_consulta,fecha,hora,identidad,cod_empleado,peso,pa,fc,rc,t,observaciones) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement psd=  cn.prepareStatement(sql);
            psd.setInt(1,codc);
            psd.setString(2,fe);
            psd.setString(3, horar);
            psd.setString(4, id);
            psd.setInt(5, cod_doct);
            psd.setString(6, peso);
            psd.setString(7, pa);
            psd.setString(8, fc);
            psd.setString(9,rc);
            psd.setString(10,t);
            psd.setString(11,obser);
           

            int n=psd.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
Reporte();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     BuscarExpediente  mAD=new BuscarExpediente(); 
         mAD.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tidpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tidpFocusLost
   BuscarPaciente();
        comid.setVisible(true);
        ResultSet rs = null;
        Statement st = null;
       try {
             
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicor2","root","");
              st = conn.createStatement();
              rs = st.executeQuery("SELECT nombre,apellido,sexo,edad from persona where identidad ='"+tidp.getText()+"'");
//              SELECT `nombre`, `apellido` FROM `empleado`  WHERE `cod_tipoempleado`= 1

            while(rs.next()){
             
                String x;
               String v = rs.getString("nombre");
               String tmpStrObtenido1 = rs.getString("apellido");
               String t = rs.getString("sexo");
               String tmpStrObtenido3 = rs.getString("edad");
               String v2= v+" "+tmpStrObtenido1+" "+"Sexo: "+t+" "+"Edad: "+tmpStrObtenido3;
              
               comid.setText(v2);
               System.out.println(v2);
               
           }
            
          conn.close();
         } catch (Exception e) {
             
             e.printStackTrace();
             return;
         }  
    }//GEN-LAST:event_tidpFocusLost

    private void tmedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tmedFocusLost
        BuscarDoctor();
  comed.setVisible(true);
  int cod;
        ResultSet rs = null;
        Statement st = null;
       try {
             
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicor2","root","");
              st = conn.createStatement();
              rs = st.executeQuery("SELECT nombre,apellido,cod_tipoempleado from empleado where cod_empleado ='"+tmed.getText()+"'");
//              SELECT `nombre`, `apellido` FROM `empleado`  WHERE `cod_tipoempleado`= 1
            while(rs.next()){
            cod=rs.getInt(3);
            if (cod!=1){
                comed.setText("Este Empleado no es Medico");
                return;
            }else{
               String x;
               String v = rs.getString("nombre");
               String tmpStrObtenido1 = rs.getString("apellido");
           
               String v2= v+" "+tmpStrObtenido1;
              
               comed.setText(v2);
               
               
           }}
            
          conn.close();
         } catch (Exception e) {
             
             return;
         }  
       
       
    }//GEN-LAST:event_tmedFocusLost

    private void tfcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfcKeyTyped
      char c=evt.getKeyChar(); 
                   
          if(Character.isLetter(c)) { 
                          
              evt.consume(); 
              Lfc.setVisible(true);
              Lfc.setText("Solo numeros");
               
          }
          else{
              Lfc.setVisible(false);
               
          } 
  
           if(c<'0' || c>'9')evt.consume();  // TODO add your handling code here:
    }//GEN-LAST:event_tfcKeyTyped

    private void trcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_trcKeyTyped
char c=evt.getKeyChar(); 
                   
          if(Character.isLetter(c)) { 
                          
              evt.consume(); 
              Lrc.setVisible(true);
              Lrc.setText("Solo numeros");
               
          }
          else{
              Lrc.setVisible(false);
               
          } 
  
           if(c<'0' || c>'9')evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_trcKeyTyped

    private void ttKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ttKeyTyped
char c=evt.getKeyChar(); 
                   
          if(Character.isLetter(c)) { 
                          
              evt.consume(); 
              Lte.setVisible(true);
              Lte.setText("Solo numeros");
               
          }
          else{
              Lte.setVisible(false);
               
          } 
  
         if((c<'0' || c>'9') && (c<'°' || c>'°'))evt.consume();       // TODO add your handling code here:
    }//GEN-LAST:event_ttKeyTyped

    private void ttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttActionPerformed

    private void tpesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpesoKeyTyped
char c=evt.getKeyChar(); 
                   
          if(Character.isLetter(c)) { 
                          
              evt.consume(); 
              Lpe.setVisible(true);
              Lpe.setText("Solo numeros");
               
          }
          else{
              Lpe.setVisible(false);
               
          } 
  
           if(c<'0' || c>'9')evt.consume();          // TODO add your handling code here:
    }//GEN-LAST:event_tpesoKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
Ventas v= new Ventas();
SelecionarPaciente();
v.setVisible(true);
this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Expedientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expedientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expedientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expedientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expedientes().setVisible(true);
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
         Administrador mAD=new Administrador(); 
         mAD.setVisible(true);
         dispose();
    }
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lfc;
    private javax.swing.JLabel Lpe;
    private javax.swing.JLabel Lrc;
    private javax.swing.JLabel Lte;
    public static javax.swing.JTextField ccod;
    private javax.swing.JLabel comed;
    private javax.swing.JLabel comid;
    private javax.swing.JLabel coneda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbfecha;
    private javax.swing.JLabel lbhora;
    private javax.swing.JTextField tape;
    private javax.swing.JTextField tcod;
    private javax.swing.JTextField tedad;
    private javax.swing.JTextField teee;
    private javax.swing.JTextField tfc;
    private javax.swing.JTextField tidd;
    public static javax.swing.JFormattedTextField tidp;
    private javax.swing.JTextField tmed;
    private javax.swing.JTextField tnom;
    private javax.swing.JTextArea tobser;
    private javax.swing.JFormattedTextField tpa;
    private javax.swing.JTextField tpeso;
    private javax.swing.JTextField trc;
    private javax.swing.JFormattedTextField tt;
    private javax.swing.JTextField ttel;
    // End of variables declaration//GEN-END:variables
}
