/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Pregrado
 */
public class RegistrarSalida extends javax.swing.JInternalFrame {
    static Toolkit t = Toolkit.getDefaultToolkit();
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Date date = new Date();
    DateFormat hora = new SimpleDateFormat("HH:mm");
    DateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
    MyModel3 modelo;
    String plaquita;
    int numero;
    int row=-1;
    /**
     * Creates new form RegistrarSalida
     */
    public RegistrarSalida() {
        initComponents();
        this.setPreferredSize(new java.awt.Dimension((screenSize.width)*2/3, screenSize.height));
        PanelRegistrar.setPreferredSize(new java.awt.Dimension((screenSize.width)*2/3-12, screenSize.height-31));
        //CargarTablaSalidas("");
        COMPROBANTE.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRegistrar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablasalida = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        campoplaca = new javax.swing.JTextField();
        COMPROBANTE = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numsalidas = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(540, 400));

        PanelRegistrar.setBackground(new java.awt.Color(204, 204, 255));
        PanelRegistrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 3, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("REGISTRAR SALIDA");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("REGISTRAR SALIDA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablasalida.setModel(new javax.swing.table.DefaultTableModel(
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
        tablasalida.setMaximumSize(new java.awt.Dimension(500, 64));
        tablasalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablasalidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablasalida);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("INGRESE PLACA:");

        campoplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoplacaActionPerformed(evt);
            }
        });

        COMPROBANTE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        COMPROBANTE.setText("GENERAR COMPROBANTE");
        COMPROBANTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMPROBANTEActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("BUSCAR ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Total de Salidas :");

        numsalidas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout PanelRegistrarLayout = new javax.swing.GroupLayout(PanelRegistrar);
        PanelRegistrar.setLayout(PanelRegistrarLayout);
        PanelRegistrarLayout.setHorizontalGroup(
            PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistrarLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistrarLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(222, 222, 222))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistrarLayout.createSequentialGroup()
                        .addComponent(COMPROBANTE)
                        .addGap(284, 284, 284))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistrarLayout.createSequentialGroup()
                        .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelRegistrarLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(69, 69, 69)
                                .addComponent(numsalidas))
                            .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1)
                                .addGroup(PanelRegistrarLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(jButton2))
                                .addGroup(PanelRegistrarLayout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(178, 178, 178))))
                        .addGap(120, 120, 120))))
        );
        PanelRegistrarLayout.setVerticalGroup(
            PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegistrarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(53, 53, 53)
                        .addComponent(jButton1)
                        .addGap(52, 52, 52)
                        .addComponent(COMPROBANTE))
                    .addComponent(numsalidas))
                .addContainerGap(299, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{            
                        CargarTablaSalidas("");
                        ConexionOracle  Oracle=new ConexionOracle();
                        Oracle.Conectar();
                        String pla="";
                        String esta="";
                        String consultaOracle1="SELECT PLACA_VEHICULO,ESTADO_VEHICULO FROM VEHICULOS WHERE PLACA_VEHICULOS = '"+campoplaca.getText()+"'";
                        ResultSet rs=Oracle.getst().executeQuery(consultaOracle1);
                        while(rs.next())
                        {
                        pla=rs.getString("PLACA_VEHICULO");
                        esta=rs.getString("ESTADO_VEHICULO");
                        }
                        if(!pla.equals("")){
                            if(esta.equals("Habilitado")){
                                String consultaOracle = "INSERT INTO SALIDAS(ID_SALIDA,HORA_SALIDA,FECHA_SALIDA,PLACA_VEHICULO) VALUES"
                                        + "('"+campoplaca.getText()+" - "+(tablasalida.getRowCount()+1)+"','"+hora.format(date)+"','"+fecha.format(date)+"','"+campoplaca.getText()+"')";
                                //System.out.println(consultaOracle);
                                Oracle.getst().execute(consultaOracle);
                                Oracle.getConexion().close();
                                JOptionPane.showMessageDialog(this, "Salida agregado correctamente");
                                CargarTablaSalidas("");
                                int salidas=tablasalida.getRowCount();
                                numsalidas.setText(Integer.toString(salidas));
                                repaint();
                                if(tablasalida.getRowCount()%3==0){
                                    COMPROBANTE.setVisible(true);
                                    plaquita=campoplaca.getText();
                                }else{
                                    COMPROBANTE.setVisible(false);
                                }
                            }else{
                                JOptionPane.showMessageDialog(this, "ESTE VEHICULO ESTA SANCIONADO ");
                            }
                        }else{
                            JOptionPane.showMessageDialog(this, "NO EXISTE ESE VEHICULO");
                        }
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(this, "Error Ingresando Datos - Codigo : "+e);
                    }
    }//GEN-LAST:event_jButton1ActionPerformed

    void CargarTablaSalidas(String valor)
    {
    String[] titulos={"ID Salida","Hora","Fecha"};
    String[] registro=new String[3];
    String consultaOracle= "";
    modelo=new MyModel3(null,titulos);
    
    
    ConexionOracle  Oracle=new ConexionOracle();
    Oracle.Conectar();
    //Connection cn=Oracle.Conectar();
    consultaOracle="SELECT ID_SALIDA,HORA_SALIDA,FECHA_SALIDA FROM SALIDAS WHERE PLACA_VEHICULO = '"+campoplaca.getText()+"'";
       try {
           
//           Statement st=cn.createStatement();
           ResultSet rs=Oracle.getst().executeQuery(consultaOracle);
           while(rs.next())
           {
               registro[0]=rs.getString("ID_SALIDA");
               registro[1]=rs.getString("HORA_SALIDA");
               registro[2]=rs.getString("FECHA_SALIDA");
               modelo.addRow(registro);
           }
           tablasalida.setModel(modelo);
           tablasalida.getTableHeader().setReorderingAllowed(false);
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex);
       }
    }
    
    private void campoplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoplacaActionPerformed

    private void COMPROBANTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPROBANTEActionPerformed
        this.setVisible(false);
        if(numero==1){
            Inicio.f13.setVisible(true);
            Inicio.f13.setnumero(1);
            Inicio.f13.seter(plaquita);
        }
        if(numero==3){
            EncargadoBuses.f13.setVisible(true);
            EncargadoBuses.f13.setnumero(3);
            EncargadoBuses.f13.seter(plaquita);
        }
        
        
    }//GEN-LAST:event_COMPROBANTEActionPerformed

    private void tablasalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablasalidaMouseClicked
        
    }//GEN-LAST:event_tablasalidaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
        ConexionOracle  Oracle=new ConexionOracle();
        Oracle.Conectar();
        String pla="";
        String esta="";
        String consultaOracle1="SELECT PLACA_VEHICULO,ESTADO_VEHICULO FROM VEHICULOS WHERE PLACA_VEHICULO = '"+campoplaca.getText()+"'";
        ResultSet rs=Oracle.getst().executeQuery(consultaOracle1);
        while(rs.next())
        {
            pla=rs.getString("PLACA_VEHICULO");
        }
        if(!pla.equals("")){
            CargarTablaSalidas("");
            int salidas=tablasalida.getRowCount();
            numsalidas.setText(Integer.toString(salidas));
            repaint();
        }else{
            JOptionPane.showMessageDialog(this, "NO EXISTE ESE VEHICULO");
        }
        }catch(Exception e){
        
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void setnumero(int a ){
        numero=a;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton COMPROBANTE;
    private javax.swing.JPanel PanelRegistrar;
    private javax.swing.JTextField campoplaca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel numsalidas;
    private javax.swing.JTable tablasalida;
    // End of variables declaration//GEN-END:variables
}

class MyModel3 extends DefaultTableModel 
{
   public MyModel3(Object[][] data, Object[] cols) 
   {
      super(data, cols);
   }

   public boolean isCellEditable(int row, int col) 
   {
      return false;
   }
}
