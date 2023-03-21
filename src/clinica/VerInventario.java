/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joraf
 */
public class VerInventario extends javax.swing.JFrame {

    /**
     * Creates new form VerInventario
     */
    public VerInventario() {
        initComponents();
        mostrarInventario(" ");
        jLabel4.setVisible(false);
        
        
    }
    
     public void Bfecha(String valor1){
Conection cc= new Conection();
Connection cn =  cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha");
        modelo.addColumn("Presentacion");
        modelo.addColumn("Contenido");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");

       

        jTableCliente4.setModel(modelo);
        String sql = "";
        if(valor1.equals(""))
        {
            sql = "SELECT * from inventario";
        }
        else
        {
            sql = "SELECT * from inventario where fecha_vencimiento LIKE '%"+valor1+"%'";
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
                datos [6] = rs.getString(7);
                
           
               
                  modelo.addRow(datos);
            }
           // jtb_consulta_venta_auto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }};
    
     public void Bcodigo(String valor1){
Conection cc= new Conection();
Connection cn =  cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha");
        modelo.addColumn("Presentacion");
        modelo.addColumn("Contenido");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");

       

        jTableCliente4.setModel(modelo);
        String sql = "";
        if(valor1.equals(""))
        {
            sql = "SELECT * from inventario";
        }
        else
        {
            sql = "SELECT * from inventario where cod_medicamento LIKE '%"+valor1+"%'";
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
                datos [6] = rs.getString(7);
               
                
           
               
                  modelo.addRow(datos);
            }
           // jtb_consulta_venta_auto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }};
    
    public void Bnombre(String valor1){
Conection cc= new Conection();
Connection cn =  cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha");
        modelo.addColumn("Presentacion");
        modelo.addColumn("Contenido");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");


       

        jTableCliente4.setModel(modelo);
        String sql = "";
        if(valor1.equals(""))
        {
            sql = "SELECT * from inventario";
        }
        else
        {
            sql = "SELECT * from inventario where nombre_comercial LIKE '%"+valor1+"%'";
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
                datos [6] = rs.getString(7);
                
           
               
                  modelo.addRow(datos);
            }
           // jtb_consulta_venta_auto.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }};
    
public void mostrarInventario(String valor1){
Conection cc= new Conection();
Connection cn =  cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha");
        modelo.addColumn("Presentacion");
        modelo.addColumn("Contenido");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");


       

        jTableCliente4.setModel(modelo);
        String sql = "";
        if(valor1.equals(""))
        {
            sql = "SELECT * from inventario";
        }
        else
        {
            sql = "SELECT * from inventario where 1";
        }
        String []datos = new String [5];
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

        jFrame1 = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tcod = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCliente1 = new javax.swing.JTable();
        tcod2 = new javax.swing.JTextField();
        tcod3 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableCliente2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableCliente3 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableCliente4 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCfiltro = new javax.swing.JComboBox<>();
        btbuscar = new javax.swing.JButton();
        tbus = new javax.swing.JTextField();
        tcantidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Medicamentos");
        jFrame1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Paciente");
        jFrame1.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caduceo (1).png"))); // NOI18N
        jFrame1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tcod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tcodKeyTyped(evt);
            }
        });
        jFrame1.getContentPane().add(tcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 70, -1));

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

        jFrame1.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 280, 130));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Facturacion");
        jFrame1.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, -1, -1));

        jTableCliente1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableCliente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCliente1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableCliente1);

        jFrame1.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 280, 300));

        tcod2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tcod2KeyTyped(evt);
            }
        });
        jFrame1.getContentPane().add(tcod2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 70, -1));

        tcod3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tcod3KeyTyped(evt);
            }
        });
        jFrame1.getContentPane().add(tcod3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 297, -1));

        jTableCliente2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableCliente2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCliente2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableCliente2);

        jFrame1.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 280, 130));

        jTableCliente3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableCliente3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCliente3MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableCliente3);

        jFrame1.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 280, 130));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Enfermera");
        jFrame1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCliente4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableCliente4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCliente4MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableCliente4);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 458, 269));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caduceo (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 214, -1, -1));

        jCfiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha Vencimiento", "Nombre", "Codigo", " " }));
        jCfiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCfiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCfiltroActionPerformed(evt);
            }
        });
        getContentPane().add(jCfiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 90, 30));

        btbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenessubmenucita/icons8-Búsqueda-40.png"))); // NOI18N
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 75, -1));

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
        getContentPane().add(tbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 330, -1));
        getContentPane().add(tcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 70, -1));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tcodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcodKeyTyped

    }//GEN-LAST:event_tcodKeyTyped

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked

    }//GEN-LAST:event_jTableClienteMouseClicked

    private void jTableCliente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCliente1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableCliente1MouseClicked

    private void tcod2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcod2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tcod2KeyTyped

    private void tcod3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcod3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tcod3KeyTyped

    private void jTableCliente2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCliente2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableCliente2MouseClicked

    private void jTableCliente3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCliente3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableCliente3MouseClicked

    private void jTableCliente4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCliente4MouseClicked
//int fila= jTableCliente4.getSelectedRow();
//        if(fila>=0){
//            tcantidad.setText(jTableCliente4.getValueAt(fila, 0).toString());
//     
//          int fila1= jTableCliente4.getSelectedRow();
//        if(fila1>=0){
//            tcantidad.setText(jTableCliente4.getValueAt(fila1, 6).toString());
//        }}
    }//GEN-LAST:event_jTableCliente4MouseClicked

    private void jCfiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCfiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCfiltroActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        int index=jCfiltro.getSelectedIndex()+1;
        switch (index) {

            case 1:
            Bfecha(tbus.getText());
            break;
            case 2:
            Bnombre(tbus.getText());
            break;
            case 3:
            Bcodigo(tbus.getText());
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

    private void tbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbusActionPerformed

    private void tbusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbusKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tbusKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VerInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCfiltro;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTable jTableCliente1;
    private javax.swing.JTable jTableCliente2;
    private javax.swing.JTable jTableCliente3;
    private javax.swing.JTable jTableCliente4;
    private javax.swing.JTextField tbus;
    private javax.swing.JTextField tcantidad;
    private javax.swing.JTextField tcod;
    private javax.swing.JTextField tcod2;
    private javax.swing.JTextField tcod3;
    // End of variables declaration//GEN-END:variables
}
