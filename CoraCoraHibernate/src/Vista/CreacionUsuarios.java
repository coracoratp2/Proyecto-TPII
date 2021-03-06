/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.Controlador;
import Modelo.Usuarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RicardoManuél
 */
public class CreacionUsuarios extends javax.swing.JInternalFrame {
    int row=-1;
    MyModel7 modelo;
    Controlador oper;
    /**
     * Creates new form CreacionUsuarios
     */
    public CreacionUsuarios() {
        initComponents();
        oper = new Controlador();
        CargarTablaUsuarios("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAgregar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoid = new javax.swing.JTextField();
        campocontra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        agregarasoc = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Boxtipos = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablausuarios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        PanelAgregar.setBackground(new java.awt.Color(204, 204, 255));
        PanelAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 3, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("MANTENIMIENTO DE USUARIOS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ID USUARIO :");

        campoid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoidActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("CONTRASEÑA :");

        agregarasoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        agregarasoc.setText("Agregar");
        agregarasoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarasocActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("TIPO DE USUARIO :");

        Boxtipos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMINISTRADOR", "GESTOR DE ASOCIADOS", "ENCARGADO DE BUSES", "SECRETARIA" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("TABLA DE USUARIOS");

        tablausuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tablausuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablausuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablausuarios);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAgregarLayout = new javax.swing.GroupLayout(PanelAgregar);
        PanelAgregar.setLayout(PanelAgregarLayout);
        PanelAgregarLayout.setHorizontalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(PanelAgregarLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                                        .addComponent(agregarasoc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1)
                                        .addGap(78, 78, 78)
                                        .addComponent(jButton2))
                                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(65, 65, 65)
                                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(campoid)
                                            .addComponent(campocontra, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Boxtipos, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel5))
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        PanelAgregarLayout.setVerticalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(campocontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boxtipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarasoc)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(34, 34, 34)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoidActionPerformed

    private void agregarasocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarasocActionPerformed
        try{
//            ConexionOracle  Oracle=new ConexionOracle();
//            Oracle.Conectar();
//            String consultaOracle = "INSERT INTO USUARIOS(ID_USER,PASS_USER,TIPO_USER) VALUES"
//            + "('"+campoid.getText()+"','"+campocontra.getText()+"','"+Boxtipos.getSelectedItem().toString()+"')";
//            //System.out.println(consultaOracle);
//            Oracle.getst().execute(consultaOracle);
            Usuarios U = new Usuarios(campoid.getText(),campocontra.getText(),
                            Boxtipos.getSelectedItem().toString());
            oper.crearUsuarios(U);
//            Oracle.getConexion().close();
            //JOptionPane.showMessageDialog(this, "Usuario agregado correctamente");
            CargarTablaUsuarios("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error Ingresando Datos - Codigo : "+e);
        }
    }//GEN-LAST:event_agregarasocActionPerformed

    private void tablausuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablausuariosMouseClicked
        row=tablausuarios.getSelectedRow();
        campoid.setText(tablausuarios.getValueAt(row, 0).toString());
        campocontra.setText(tablausuarios.getValueAt(row, 1).toString());
        String tipo = tablausuarios.getValueAt(row, 2).toString();
        switch(tipo){
            case "ADMINISTRADOR": Boxtipos.setSelectedIndex(0);
                      break;
            case "GESTOR DE ASOCIADOS": Boxtipos.setSelectedIndex(1);
                      break;
            case "ENCARGADO DE BUSES": Boxtipos.setSelectedIndex(2);
                      break;
            case "SECRETARIA": Boxtipos.setSelectedIndex(3);
                      break;      
        }
    }//GEN-LAST:event_tablausuariosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
                    if(row!=-1){    
                        ConexionOracle  Oracle=new ConexionOracle();
                        Oracle.Conectar();
                        String consultaOracle = "UPDATE USUARIOS SET PASS_USER = '"+campocontra.getText()+
                                "',TIPO_USER = '"+Boxtipos.getSelectedItem().toString()+"' WHERE ID_USER = '"+
                                campoid.getText()+"'";
                        //System.out.println(consultaOracle);
                        Oracle.getst().execute(consultaOracle);
                        Oracle.getConexion().close();
                        JOptionPane.showMessageDialog(this, "Usuario modificado correctamente");
                        CargarTablaUsuarios("");
                    }else{
                        JOptionPane.showMessageDialog(this, "POR FAVOR SELECCIONE UNA FILA");
                    }
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Error Ingresando Datos - Codigo : "+e);
                    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //row=tablausuarios.getSelectedRow();
        if(row!=-1){
        ConexionOracle  Oracle=new ConexionOracle();
        Oracle.Conectar();
        String consultaOracle="DELETE FROM USUARIOS WHERE ID_USER = '"+campoid.getText()+"'"; 
        try{
            int resp = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar?","ELIMINAR USUARIO", JOptionPane.YES_NO_OPTION);
              if(resp==JOptionPane.YES_OPTION){
                ResultSet rs=Oracle.getst().executeQuery(consultaOracle);
                CargarTablaUsuarios("");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }else{
            JOptionPane.showMessageDialog(null, "POR FAVOR SELECCIONE UNA FILA");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    void CargarTablaUsuarios(String valor)
    {
    String[] titulos={"ID Usuario","Contraseña Usuario","Tipo Usuario"};
    String[] registro=new String[3];
    String consultaOracle= "";
    modelo=new MyModel7(null,titulos);
    
    
    ConexionOracle  Oracle=new ConexionOracle();
    Oracle.Conectar();
    //Connection cn=Oracle.Conectar();
    consultaOracle="SELECT ID_USER,PASS_USER,TIPO_USER FROM USUARIOS";
       try {
           
//           Statement st=cn.createStatement();
           ResultSet rs=Oracle.getst().executeQuery(consultaOracle);
           while(rs.next())
           {
               registro[0]=rs.getString("ID_USER");
               registro[1]=rs.getString("PASS_USER");
               registro[2]=rs.getString("TIPO_USER");
               modelo.addRow(registro);
           }
           tablausuarios.setModel(modelo);
           tablausuarios.getTableHeader().setReorderingAllowed(false);
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex);
       }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Boxtipos;
    private javax.swing.JPanel PanelAgregar;
    private javax.swing.JButton agregarasoc;
    private javax.swing.JTextField campocontra;
    private javax.swing.JTextField campoid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablausuarios;
    // End of variables declaration//GEN-END:variables
}
class MyModel7 extends DefaultTableModel 
{
   public MyModel7(Object[][] data, Object[] cols) 
   {
      super(data, cols);
   }

   @Override
   public boolean isCellEditable(int row, int col) 
   {
      return false;
   }
}