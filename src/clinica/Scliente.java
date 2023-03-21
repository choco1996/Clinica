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
 * @author Wayne
 */
public class Scliente extends javax.swing.JFrame {

    /**
     * Creates new form Scliente
     */
    public Scliente() {
        initComponents();
        mostrarEmpleado("");
    }
    
    
     private void SelecionarPaciente(){
       
        
        int row=jTableCliente.getSelectedRow();
        String id=jTableCliente.getValueAt(row, 0).toString();
        String nombre=jTableCliente.getValueAt(row, 1).toString();
        String apellido=jTableCliente.getValueAt(row, 2).toString();
        
       
         
           Ventas.lidentidad.setText(id);
           Ventas.lnombre.setText(nombre+" "+apellido);
           
         
            this.dispose();    
 }
   Conection cc = new Conection();
    Connection cn = cc.conexion();
    
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        selecionar = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        tbus = new javax.swing.JTextField();
        jCfiltro = new javax.swing.JComboBox<>();
        btbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        selecionar.setText("jMenuItem1");
        jPopupMenu1.add(selecionar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableClienteMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCliente);

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

        jCfiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Identidad", "Nombre", "Apellido" }));
        jCfiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCfiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCfiltroActionPerformed(evt);
            }
        });

        btbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenessubmenucita/icons8-Búsqueda-40.png"))); // NOI18N
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caduceo (1).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tbus, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbuscar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
SelecionarPaciente();       
dispose();
            /*selec=(jTableCliente.getValueAt(fila, 6).toString());
            cbTipoEmpleado.setSelectedIndex(Integer.parseInt(selec)-1);*/
        
    }//GEN-LAST:event_jTableClienteMouseClicked

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

    private void jCfiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCfiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCfiltroActionPerformed

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

    private void jTableClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableClienteMouseEntered

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
            java.util.logging.Logger.getLogger(Scliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scliente().setVisible(true);
            }
        });
    }
public static javax.swing.JTable jTable_Autos;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar;
    private javax.swing.JComboBox<String> jCfiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JMenuItem selecionar;
    private javax.swing.JTextField tbus;
    // End of variables declaration//GEN-END:variables
}
