/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author joraf
 */
public class Ventas extends javax.swing.JFrame {

    /**
     * Creates new form Ventas
     */
    public Ventas() {
        initComponents();
        ocultar();
        COD();
        codfact.setVisible(false);
        lcoddoctor.setVisible(false);
       // mostrarPaciente("");
       lafecha.setText(fe+" "+horar);
      
    }
    public static int i,cod_empleado,cod_consulta;
    public static String identidad;
     
    Calendar Cal = new GregorianCalendar();
     String fe= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
     String horar= Cal.get(Calendar.HOUR_OF_DAY)+":"+Cal.get(Cal.MINUTE); 

    public void ocultar(){
        Expedientes e= new Expedientes();
        e.setVisible(false);
    }
    public final void COD(){
       Conection cc= new Conection();
        Connection cn =  cc.conexion();
        String sql="";
        int cod,cod1;
        sql = "SELECT count(*) from factura";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                cod=rs.getInt(1);
                cod1=cod+1;
                codfact.setText(String.valueOf((cod1)));
                Idfactura.setText(String.valueOf((cod1)));
            }
           // jtb_consulta_venta_auto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
    public void medic_cobra(){
      int test=Integer.parseInt(JTfacturacion.getValueAt(i, 5).toString());
      if (test>0) {
      Conection cc= new Conection();
      Connection cn =  cc.conexion();
      int cod_medicamento,cantidad,codcon;
      codcon=cod_consulta-1;
      cod_medicamento=Integer.parseInt(JTfacturacion.getValueAt(i, 0).toString());
      cod_consulta=Integer.parseInt(Expedientes.ccod.getText());
      cantidad=Integer.parseInt(JTfacturacion.getValueAt(i, 6).toString());
     String sql= "INSERT INTO med_consulta(cod_medicamento,cod_consulta,cantidad) VALUES(?,?,?)";

        try {
            PreparedStatement psd=  cn.prepareStatement(sql);
            psd.setInt(1, cod_medicamento);
            psd.setInt(2, codcon);
            psd.setInt(3, cantidad);
            int n=psd.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    
      }
    };
    public void medic_free(){
        int test=Integer.parseInt(JTfacturacion.getValueAt(i, 5).toString());
        if (test==0) {
      Conection cc= new Conection();
      Connection cn =  cc.conexion();
      int cod_medicamento,cantidad,codcon;
      codcon=cod_consulta-1;
      cod_medicamento=Integer.parseInt(JTfacturacion.getValueAt(i, 0).toString());
      cod_consulta=Integer.parseInt(Expedientes.ccod.getText());
      cantidad=Integer.parseInt(JTfacturacion.getValueAt(i, 6).toString());
     String sql= "INSERT INTO med_consultafree(cod_medicamento,cod_consulta,cantidad) VALUES(?,?,?)";

        try {
            PreparedStatement psd=  cn.prepareStatement(sql);
            psd.setInt(1, cod_medicamento);
            psd.setInt(2, codcon);
            psd.setInt(3, cantidad);
            int n=psd.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    };
    public void vender(){
        Conection cc= new Conection();
        Connection cn =  cc.conexion();
        String fecha;
        int factura,codcon;
        factura=Integer.parseInt(codfact.getText());
        fecha=fe;
        codcon=cod_consulta-1;
        
      
       String sql= "INSERT INTO factura(id_fact,identidad,cod_empleado,fecha,cod_consulta) VALUES(?,?,?,?,?)";

        try {
            PreparedStatement psd=  cn.prepareStatement(sql);
            psd.setInt(1,factura);
            psd.setString(2,identidad);
            psd.setInt(3,cod_empleado);
            psd.setString(4,fecha);
            psd.setInt(5,codcon);
            int n=psd.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    };
    
    
    public void facturar(){
        int fila=JTfacturacion.getModel().getRowCount();
        vender();
        for (i = 0; i < fila; i++) {
          medic_cobra();
          medic_free();
         
        }
 
    };
    
         public static void subcalcularTotal() {
         int fila=JTfacturacion.getModel().getRowCount(), subtotal,cantidad,total=0;
       for(int x=0; x<fila;x ++){
       subtotal=Integer.parseInt(JTfacturacion.getValueAt(x, 5).toString());
       cantidad=Integer.parseInt(JTfacturacion.getValueAt(x, 6).toString());
       total=(subtotal*cantidad)+total;
       }
       txt_total.setText(Integer.toString(total));
    };

    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Mdonar = new javax.swing.JMenuItem();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTfacturacion = new javax.swing.JTable();
        ltel = new javax.swing.JLabel();
        lafecha = new javax.swing.JLabel();
        lnombre = new javax.swing.JLabel();
        lfactura = new javax.swing.JLabel();
        lidentidad = new javax.swing.JLabel();
        lcoddoctor = new javax.swing.JLabel();
        BTbuscar = new javax.swing.JButton();
        BTbuscar1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lidd = new javax.swing.JLabel();
        ldoctor = new javax.swing.JLabel();
        lfecha = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        codfact = new javax.swing.JTextField();
        Idfactura = new javax.swing.JLabel();

        jPopupMenu1.setComponentPopupMenu(jPopupMenu1);

        Mdonar.setText("Donar");
        Mdonar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MdonarMouseClicked(evt);
            }
        });
        Mdonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MdonarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Mdonar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1035, 552));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Producto");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caduceo (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Donacion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, -1));

        JTfacturacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nombre", "Fecha Vencimiento", "Presentacion", "Contenido", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTfacturacion.setComponentPopupMenu(jPopupMenu1);
        JTfacturacion.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                JTfacturacionPropertyChange(evt);
            }
        });
        JTfacturacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTfacturacionKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(JTfacturacion);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 480, 300));

        ltel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ltel.setText("Telefono Doctor");
        getContentPane().add(ltel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 120, -1));

        lafecha.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lafecha.setText("Fecha");
        getContentPane().add(lafecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 180, -1));

        lnombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lnombre.setText("Bruce Wayne ");
        getContentPane().add(lnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 210, -1));

        lfactura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lfactura.setText("Id factura");
        getContentPane().add(lfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        lidentidad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lidentidad.setText("99");
        getContentPane().add(lidentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 120, 20));

        lcoddoctor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lcoddoctor.setText("Cod doctor");
        getContentPane().add(lcoddoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 70, -1));

        BTbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenessubmenucita/icons8-Búsqueda-40.png"))); // NOI18N
        BTbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BTbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        BTbuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenessubmenucita/icons8-Búsqueda-40.png"))); // NOI18N
        BTbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTbuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(BTbuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Paciente");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 90, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenessubmenucita/icons8-donar-40.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("TOTAL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, -1, -1));
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 140, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setText("Facturacion");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        lidd.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lidd.setText("Cod doctor");
        getContentPane().add(lidd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 120, -1));

        ldoctor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ldoctor.setText("Nombre y apellido Doctor");
        getContentPane().add(ldoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, -1));

        lfecha.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lfecha.setText("Fecha:");
        getContentPane().add(lfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 40, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenessubmenucita/icons8-recibo-40.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));
        getContentPane().add(codfact, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 100, 20));

        Idfactura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Idfactura.setText("999");
        getContentPane().add(Idfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 120, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTbuscarActionPerformed
   Sproducto y = new Sproducto();
        y.setVisible(true);
        
    }//GEN-LAST:event_BTbuscarActionPerformed

    private void BTbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTbuscar1ActionPerformed
        Scliente y = new Scliente();
        y.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_BTbuscar1ActionPerformed

    private void MdonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MdonarActionPerformed
        // TODO add your handling code here:
         int fila=JTfacturacion.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) JTfacturacion.getModel();
        modelo.removeRow(fila);
        JTfacturacion.setModel(modelo);
        calcularTotal();
      
    }//GEN-LAST:event_MdonarActionPerformed

    private void MdonarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MdonarMouseClicked
   //JTfacturacion.setColumnModel(columnModel);
    eliminarElemento();
    }//GEN-LAST:event_MdonarMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formFocusGained

    private void JTfacturacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTfacturacionKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_DELETE)
          eliminarElemento();
    }//GEN-LAST:event_JTfacturacionKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     txt_total.setText("0");
      int fila=JTfacturacion.getModel().getRowCount();
       for(int x=0; x<fila;x ++){
       JTfacturacion.setValueAt(0,x,5);
     }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
facturar();    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JTfacturacionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_JTfacturacionPropertyChange
     //    calcularTotal();        // TODO add your handling code here:
        subcalcularTotal();
    }//GEN-LAST:event_JTfacturacionPropertyChange

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTbuscar;
    private javax.swing.JButton BTbuscar1;
    public static javax.swing.JLabel Idfactura;
    public static javax.swing.JTable JTfacturacion;
    private javax.swing.JMenuItem Mdonar;
    private javax.swing.JTextField codfact;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JLabel lafecha;
    public static javax.swing.JLabel lcoddoctor;
    public static javax.swing.JLabel ldoctor;
    public static javax.swing.JLabel lfactura;
    public static javax.swing.JLabel lfecha;
    public static javax.swing.JLabel lidd;
    public static javax.swing.JLabel lidentidad;
    public static javax.swing.JLabel lnombre;
    public static javax.swing.JLabel ltel;
    private static javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables

    public static void calcularTotal() {
       int fila=JTfacturacion.getModel().getRowCount(), total=0;
       for(int x=0; x<fila;x ++){
           total=Integer.parseInt(JTfacturacion.getValueAt(x, 5).toString())+total;
       
       }
       txt_total.setText(Integer.toString(total));
    }

    private void eliminarElemento() {
        int fila=JTfacturacion.getSelectedRow();
   if(fila!=-1){     
   DefaultTableModel modelo = (DefaultTableModel) JTfacturacion.getModel();
        modelo.removeRow(fila);
        JTfacturacion.setModel(modelo);
        calcularTotal();
   }
   else JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla");
    }
}
