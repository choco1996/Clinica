package clinica;


import clinica.BuscarEmpleado;
import clinica.Conection;
import clinica.Ventas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wayne
 */
public class Sproducto extends javax.swing.JFrame {

    /**
     * Creates new form Sproducto
     */
    public Sproducto() {
        initComponents();
              mostrarInventario(" ");
        jLabel4.setVisible(false);
    }

 
     private void SelecionarPaciente(){
       
        
   int row=jTableCliente.getSelectedRow();
        String cod=jTableCliente.getValueAt(row, 0).toString();
        String nombre=jTableCliente.getValueAt(row, 1).toString();
        String fecha=jTableCliente.getValueAt(row, 2).toString();
        String presentacion=jTableCliente.getValueAt(row, 3).toString();
        String contenido=jTableCliente.getValueAt(row, 4).toString();
        String cantidad=jTableCliente.getValueAt(row, 5).toString();
        String precio=jTableCliente.getValueAt(row, 6).toString();
       
         int i=0; 
         i=i+1;
        DefaultTableModel modelo = (DefaultTableModel) Ventas.JTfacturacion.getModel();
         Object[]  dato=new Object[7];
         
            dato[0]=cod;
            dato[1]=nombre;
            dato[2]=fecha;
            dato[3]=presentacion;
            dato[4]=contenido;
            //dato[5]=cantidad;
            dato[5]=precio;
            dato[6]="1";
            
            modelo.addRow(dato);
            Ventas.JTfacturacion.setModel(modelo);
            Ventas.JTfacturacion.editCellAt(row, 2);
          
            this.dispose();     
 }
   Conection cc = new Conection();
    Connection cn = cc.conexion();
    
    
    
    
    
    
    
    
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

       

        jTableCliente.setModel(modelo);
        String sql = "";
        if(valor1.equals(""))
        {
            sql = "SELECT * from inventario";
        }
        else
        {
            sql = "SELECT * from inventario where fecha_vencimiento LIKE '%"+valor1+"%'";
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


       

        jTableCliente.setModel(modelo);
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

       

        jTableCliente.setModel(modelo);
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


       

        jTableCliente.setModel(modelo);
        String sql = "";
        if(valor1.equals(""))
        {
            sql = "SELECT * from inventario";
        }
        else
        {
            sql = "SELECT * from inventario where 1";
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
        }}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCfiltro = new javax.swing.JComboBox<>();
        btbuscar = new javax.swing.JButton();
        tbus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jScrollPane6.setViewportView(jTableCliente);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caduceo (1).png"))); // NOI18N

        jLabel4.setText("jLabel4");

        jCfiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha Vencimiento", "Nombre", "Codigo", " " }));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jCfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(tbus, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(520, 520, 520)
                                .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(111, 111, 111)
                .addComponent(jLabel4)
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(btbuscar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
SelecionarPaciente();
Ventas.calcularTotal();

    }//GEN-LAST:event_jTableClienteMouseClicked

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
            java.util.logging.Logger.getLogger(Sproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sproducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar;
    private javax.swing.JComboBox<String> jCfiltro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField tbus;
    // End of variables declaration//GEN-END:variables
}
