/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;
    
/**
 *
 * @author RicardoManuél
 */
public class AgregarVehiculo extends javax.swing.JInternalFrame {
    /**
     * Creates new form AgregarVehiculo
     */
    int numero;
    public AgregarVehiculo() {
        initComponents();
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
        campoplaca = new javax.swing.JTextField();
        campomodelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        agregarasoc = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nomchofer = new javax.swing.JTextField();
        dnichofer = new javax.swing.JTextField();
        apechofer = new javax.swing.JTextField();
        dnicobra = new javax.swing.JTextField();
        nomcobra = new javax.swing.JTextField();
        apecobra = new javax.swing.JTextField();
        BoxTipos = new javax.swing.JComboBox();

        PanelAgregar.setBackground(new java.awt.Color(204, 204, 255));
        PanelAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 3, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("AGREGAR VEHICULO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("PLACA :");

        campoplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoplacaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("AÑO :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("TIPO DE VEHICULO :");

        agregarasoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        agregarasoc.setText("Agregar");
        agregarasoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarasocActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("NOMBRE CHOFER :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("DNI CHOFER :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("APELLIDO CHOFER :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("NOMBRE COBRADOR :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("DNI COBRADOR :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("APELLIDO COBRADOR :");

        BoxTipos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BUS", "COASTER", "COMBI" }));

        javax.swing.GroupLayout PanelAgregarLayout = new javax.swing.GroupLayout(PanelAgregar);
        PanelAgregar.setLayout(PanelAgregarLayout);
        PanelAgregarLayout.setHorizontalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(agregarasoc)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(65, 65, 65)
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoplaca)
                                .addComponent(campomodelo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nomchofer)
                                .addComponent(dnichofer)
                                .addComponent(apechofer, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dnicobra)
                                .addComponent(nomcobra)
                                .addComponent(apecobra, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BoxTipos, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(398, Short.MAX_VALUE))
        );
        PanelAgregarLayout.setVerticalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(campoplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campomodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BoxTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dnichofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nomchofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(apechofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(dnicobra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nomcobra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(apecobra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarasoc)
                    .addComponent(jButton2))
                .addGap(113, 113, 113))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoplacaActionPerformed

    private void agregarasocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarasocActionPerformed
        String consultaOracle="";
        try{
            ConexionOracle  Oracle=new ConexionOracle();
            Oracle.Conectar();
            if(numero==1){
            consultaOracle = "INSERT INTO VEHICULOS(PLACA_VEHICULO,MODELO_VEHICULO,ANIO_VEHICULO,DNI_ASOCIADO,DNI_CHOFER,DNI_COBRADOR,ESTADO_VEHICULO,DSAN_VEHICULO) VALUES"
            + "('"+campoplaca.getText()+"','"+BoxTipos.getSelectedItem().toString()+"','"+campomodelo.getText()+"','"+Inicio.f7.getcampodni()+"','"+dnichofer.getText()+"','"+dnicobra.getText()+"','Habilitado','0')";
            }
            if(numero==2){
            consultaOracle = "INSERT INTO VEHICULOS(PLACA_VEHICULO,MODELO_VEHICULO,ANIO_VEHICULO,DNI_ASOCIADO,DNI_CHOFER,DNI_COBRADOR,ESTADO_VEHICULO,DSAN_VEHICULO) VALUES"
            + "('"+campoplaca.getText()+"','"+BoxTipos.getSelectedItem().toString()+"','"+campomodelo.getText()+"','"+GestorAsociados.f7.getcampodni()+"','"+dnichofer.getText()+"','"+dnicobra.getText()+"','Habilitado','0')";
            }
            String consultaOracle1 = "INSERT INTO CHOFERES(DNI_CHOFER,NOM_CHOFER,APE_CHOFER) VALUES"
            + "('"+dnichofer.getText()+"','"+nomchofer.getText()+"','"+apechofer.getText()+"')";
            String consultaOracle2 = "INSERT INTO COBRADORES(DNI_COBRADOR,NOM_COBRADOR,APE_COBRADOR) VALUES"
            + "('"+dnicobra.getText()+"','"+nomcobra.getText()+"','"+apecobra.getText()+"')";
            Oracle.getst().execute(consultaOracle1);
            Oracle.getst().execute(consultaOracle2);
            Oracle.getst().execute(consultaOracle);
            Oracle.getConexion().close();
            JOptionPane.showMessageDialog(null, "Vehiculo agregado correctamente");
            this.setVisible(false);
            if(numero==1){
            Inicio.f7.setnumero(1);
            Inicio.f7.CargarTablaVehiculos("");
            Inicio.f7.setVisible(true);
            }
            if(numero==2){
            GestorAsociados.f7.setnumero(2);
            GestorAsociados.f7.CargarTablaVehiculos("");
            GestorAsociados.f7.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Ingresando Datos - Codigo : "+e);
        }
    }//GEN-LAST:event_agregarasocActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        if(numero==1){
            Inicio.f7.setnumero(1);
            Inicio.f7.setVisible(true);
            }
            if(numero==2){
            GestorAsociados.f7.setnumero(2);
            GestorAsociados.f7.setVisible(true);
            }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox BoxTipos;
    private javax.swing.JPanel PanelAgregar;
    private javax.swing.JButton agregarasoc;
    private javax.swing.JTextField apechofer;
    private javax.swing.JTextField apecobra;
    private javax.swing.JTextField campomodelo;
    private javax.swing.JTextField campoplaca;
    private javax.swing.JTextField dnichofer;
    private javax.swing.JTextField dnicobra;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomchofer;
    private javax.swing.JTextField nomcobra;
    // End of variables declaration//GEN-END:variables

 public void vaciar(){
     campoplaca.setText("");
     campomodelo.setText("");
     BoxTipos.setSelectedIndex(0);
     nomchofer.setText("");
     nomcobra.setText("");
     dnichofer.setText("");
     dnicobra.setText("");
     apechofer.setText("");
     apecobra.setText("");
     
 }
 
 public void setnumero(int a){
        numero=a;
    }

}
