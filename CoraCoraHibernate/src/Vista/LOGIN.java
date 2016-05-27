package Vista;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RicardoManuél
 */
public class LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    public LOGIN() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(LOGIN.DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Acceder = new javax.swing.JButton();
        CampoContra = new javax.swing.JPasswordField();
        Acceder1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 3, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("INICIAR SESION");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Usuario :");

        CampoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoUsuarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Contraseña :");

        Acceder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Acceder.setText("Acceder");
        Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccederActionPerformed(evt);
            }
        });

        CampoContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoContraActionPerformed(evt);
            }
        });
        CampoContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CampoContraKeyPressed(evt);
            }
        });

        Acceder1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Acceder1.setText("Salir");
        Acceder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acceder1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Acceder, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CampoContra, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Acceder1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)))
                .addContainerGap(432, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel2)
                .addGap(93, 93, 93)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(81, 81, 81)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(104, 104, 104)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Acceder)
                    .addComponent(Acceder1))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoUsuarioActionPerformed

    private void AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccederActionPerformed

        String[] registro=new String[3];
        String consultaOracle= "";
        ConexionOracle  Oracle=new ConexionOracle();
        Oracle.Conectar();
        consultaOracle="SELECT ID_USER,PASS_USER,TIPO_USER FROM USUARIOS ";
        String ventanatipo="";
        try {
           
//           Statement st=cn.createStatement();
           ResultSet rs=Oracle.getst().executeQuery(consultaOracle);
           while(rs.next())
           {
               registro[0]=rs.getString("ID_USER");
               registro[1]=rs.getString("PASS_USER");
               registro[2]=rs.getString("TIPO_USER");
               if(CampoUsuario.getText().equals(registro[0]) && registro[1].equals(new String((CampoContra.getPassword())))){
                   ventanatipo=registro[2];
               }
           }
           if(ventanatipo.equals("ADMINISTRADOR")){
               this.setVisible(false);
               Inicio.main();
           }
           if(ventanatipo.equals("ENCARGADO DE BUSES")){
               this.setVisible(false);
               EncargadoBuses.main();
           }
           if(ventanatipo.equals("GESTOR DE ASOCIADOS")){
               this.setVisible(false);
               GestorAsociados.main();
           }
           if(ventanatipo.equals("SECRETARIA")){
               this.setVisible(false);
               Secretaria.main();
           }
           if(ventanatipo.equals("")){
               JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña Incorrecta");
           }
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex);
       }
    }//GEN-LAST:event_AccederActionPerformed

    private void CampoContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoContraActionPerformed

    private void Acceder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acceder1ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir?","Salir del Sistema", JOptionPane.YES_NO_OPTION);
              if(resp==JOptionPane.YES_OPTION){
                 System.exit(0); 
              }
    }//GEN-LAST:event_Acceder1ActionPerformed

    private void CampoContraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoContraKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             String[] registro=new String[3];
             String consultaOracle= "";
             ConexionOracle  Oracle=new ConexionOracle();
             Oracle.Conectar();
             consultaOracle="SELECT ID_USER,PASS_USER,TIPO_USER FROM USUARIOS ";
             String ventanatipo="";
             try {

     //           Statement st=cn.createStatement();
                ResultSet rs=Oracle.getst().executeQuery(consultaOracle);
                while(rs.next())
                {
                    registro[0]=rs.getString("ID_USER");
                    registro[1]=rs.getString("PASS_USER");
                    registro[2]=rs.getString("TIPO_USER");
                    if(CampoUsuario.getText().equals(registro[0]) && registro[1].equals(new String((CampoContra.getPassword())))){
                        ventanatipo=registro[2];
                    }
                }
                if(ventanatipo.equals("ADMINISTRADOR")){
                    this.setVisible(false);
                    Inicio.main();
                }
                if(ventanatipo.equals("ENCARGADO DE BUSES")){
                    this.setVisible(false);
                    EncargadoBuses.main();
                }
                if(ventanatipo.equals("GESTOR DE ASOCIADOS")){
                    this.setVisible(false);
                    GestorAsociados.main();
                }
                if(ventanatipo.equals("SECRETARIA")){
                    this.setVisible(false);
                    Secretaria.main();
                }
                if(ventanatipo.equals("")){
                    JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña Incorrecta");
                }
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex);
            }
       }
    }//GEN-LAST:event_CampoContraKeyPressed

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new LOGIN().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acceder;
    private javax.swing.JButton Acceder1;
    private javax.swing.JPasswordField CampoContra;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
