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
public class EditarCobrador extends javax.swing.JInternalFrame {
    int numero;
    String dni="";
    /**
     * Creates new form EditarCobrador
     */
    public EditarCobrador() {
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

        PanelGestor = new javax.swing.JPanel();
        Modificar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        LabelTitulo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dnichofer = new javax.swing.JTextField();
        nomchofer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        apechofer = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dnicobra = new javax.swing.JTextField();
        nomcobra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        apecobra = new javax.swing.JTextField();

        PanelGestor.setBackground(new java.awt.Color(204, 204, 255));
        PanelGestor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 3, true));

        Modificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Modificar.setText("Cancelar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(0, 51, 153));
        LabelTitulo.setText("CAMBIAR COBRADOR");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("DNI CHOFER :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("NOMBRE CHOFER :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("APELLIDO CHOFER :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("DNI COBRADOR :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("NOMBRE COBRADOR :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("APELLIDO COBRADOR :");

        javax.swing.GroupLayout PanelGestorLayout = new javax.swing.GroupLayout(PanelGestor);
        PanelGestor.setLayout(PanelGestorLayout);
        PanelGestorLayout.setHorizontalGroup(
            PanelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGestorLayout.createSequentialGroup()
                .addGroup(PanelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGestorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelTitulo)
                            .addGroup(PanelGestorLayout.createSequentialGroup()
                                .addGroup(PanelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(65, 65, 65)
                                .addGroup(PanelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomchofer)
                                    .addComponent(dnichofer)
                                    .addComponent(apechofer, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dnicobra)
                                    .addComponent(nomcobra)
                                    .addComponent(apecobra, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(PanelGestorLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton1)
                        .addGap(317, 317, 317)
                        .addComponent(Modificar)))
                .addGap(197, 197, 197))
        );
        PanelGestorLayout.setVerticalGroup(
            PanelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGestorLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LabelTitulo)
                .addGap(99, 99, 99)
                .addGroup(PanelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dnichofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nomchofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(apechofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(dnicobra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nomcobra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(apecobra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addGroup(PanelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modificar)
                    .addComponent(jButton1))
                .addContainerGap(316, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelGestor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelGestor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        this.setVisible(false);
        if(numero==1){
           Inicio.f8.setnumero(1);
           Inicio.f8.setVisible(true); 
        }
        if(numero==2){
           GestorAsociados.f8.setnumero(2);
           GestorAsociados.f8.setVisible(true); 
        }
        
    }//GEN-LAST:event_ModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
                        ConexionOracle  Oracle=new ConexionOracle();
                        Oracle.Conectar();
                        String consultaOracle1="";
                        String consultaOracle = "DELETE FROM COBRADORES WHERE DNI_COBRADOR = '"+dni+"'";
                        if(numero==1){
                        consultaOracle1 = "UPDATE VEHICULOS SET DNI_COBRADOR = '"+dnicobra.getText()+"' WHERE PLACA_VEHICULO= '"+Inicio.f7.getcampoplaca()+"'";
                        }
                        if(numero==2){
                        consultaOracle1 = "UPDATE VEHICULOS SET DNI_COBRADOR = '"+dnicobra.getText()+"' WHERE PLACA_VEHICULO= '"+GestorAsociados.f7.getcampoplaca()+"'";
                        }
                        String consultaOracle2 = "INSERT INTO COBRADORES(DNI_COBRADOR,NOM_COBRADOR,APE_COBRADOR) VALUES('"+dnicobra.getText()+"','"+nomcobra.getText()+"','"+apecobra.getText()+"')";
                        //System.out.println(consultaOracle);
                        Oracle.getst().execute(consultaOracle);
                        Oracle.getst().execute(consultaOracle1);
                        Oracle.getst().execute(consultaOracle2);
                        Oracle.getConexion().close();
                        JOptionPane.showMessageDialog(this, "Cobrador modificado correctamente");
                        this.setVisible(false);
                        if(numero==1){
                            Inicio.f8.setnumero(1);
                            Inicio.f8.CargarTablachoferes("");
                            Inicio.f8.setVisible(true);
                        }
                        if(numero==2){
                            GestorAsociados.f8.setnumero(2);
                            GestorAsociados.f8.CargarTablachoferes("");
                            GestorAsociados.f8.setVisible(true);
                        }
                        
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Error Ingresando Datos - Codigo : "+e);
                    }
    }//GEN-LAST:event_jButton1ActionPerformed

        public void seter(){
        if(numero==1){
        dnichofer.setText(Inicio.f8.dnichofer);
        nomchofer.setText(Inicio.f8.nomchofer);
        apechofer.setText(Inicio.f8.apechofer);
        dnicobra.setText(Inicio.f8.dnicobrador);
        dnichofer.setEnabled(false);
        nomcobra.setText(Inicio.f8.nomcobrador);
        nomchofer.setEnabled(false);
        apecobra.setText(Inicio.f8.apecobrador);
        apechofer.setEnabled(false); 
        dni=dnicobra.getText();
        }
        if(numero==2){
        dnichofer.setText(GestorAsociados.f8.dnichofer);
        nomchofer.setText(GestorAsociados.f8.nomchofer);
        apechofer.setText(GestorAsociados.f8.apechofer);
        dnicobra.setText(GestorAsociados.f8.dnicobrador);
        dnichofer.setEnabled(false);
        nomcobra.setText(GestorAsociados.f8.nomcobrador);
        nomchofer.setEnabled(false);
        apecobra.setText(GestorAsociados.f8.apecobrador);
        apechofer.setEnabled(false); 
        dni=dnicobra.getText();
        }
        }
        
        public void setnumero(int a){
        numero=a;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JButton Modificar;
    private javax.swing.JPanel PanelGestor;
    private javax.swing.JTextField apechofer;
    private javax.swing.JTextField apecobra;
    private javax.swing.JTextField dnichofer;
    private javax.swing.JTextField dnicobra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomchofer;
    private javax.swing.JTextField nomcobra;
    // End of variables declaration//GEN-END:variables
}
