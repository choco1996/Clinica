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
public class HabitacionesDisponibles extends javax.swing.JFrame {

    /**
     * Creates new form HabitacionesDisponibles
     */
    public HabitacionesDisponibles() {
        initComponents();
        mostrarEmpleado("");
        Cerrar();
    }
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/caduceo (1).png"));


        return retValue;
    }
public void mostrarEmpleado(String valor1){
Conection cc= new Conection();
Connection cn =  cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Habitacion");
        modelo.addColumn("Numero");
        modelo.addColumn("Disponibilidad");
        
  

       

        jTableCliente.setModel(modelo);
        String sql = "";
        if(valor1.equals(""))
        {
            sql = "SELECT * from habitacion";
        }
        else
        {
            sql = "SELECT * from habitacion where cod_habitacion,Numerohabitacion,disponibilidad='"+valor1+"'";
        }
        String []datos = new String [3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                datos [0] = rs.getString(1);
                datos [1] = rs.getString(2);
               
              switch (rs.getString(3)) {
               case "1":
                   datos [2]="Disponible";
                   break;
               case "0":
                   datos [2]="No Disponible";
                   break;
            
               default:
                    break;
           }
                //tipo=rs.getString(3);
              ;
                
           
               
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(679, 506));
        setMinimumSize(new java.awt.Dimension(679, 506));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane3.setViewportView(jTableCliente);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 520, 471));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caduceo (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
  
    }//GEN-LAST:event_jTableClienteMouseClicked

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
            java.util.logging.Logger.getLogger(HabitacionesDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HabitacionesDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HabitacionesDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HabitacionesDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HabitacionesDisponibles().setVisible(true);
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
         MenuInternar mAD=new MenuInternar(); 
         mAD.setVisible(true);
         dispose();
    }
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableCliente;
    // End of variables declaration//GEN-END:variables
}