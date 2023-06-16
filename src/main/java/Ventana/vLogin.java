package Ventana;
import Ventana.vAdminProfesores;
import static Ventana.vAdminProfesores.contadorProfesores;
import static Ventana.vAdminProfesores.profesores;
import static Ventana.vAdministrarCursos.contadorCursos;
import static Ventana.vAdministrarCursos.cursos;
import java.awt.Color;
import javax.swing.JOptionPane;

public class vLogin extends javax.swing.JFrame {
    
    public static int num;
    public static int num2;
    public vLogin() {
        initComponents();
        setVisible(true);
        this.getContentPane().setBackground(Color.white);

        
    }
    
    /*
    private Profesor buscaCod(String codigo){
        if(contadorProfesores==0){
            JOptionPane.showMessageDialog(null, "No hay usuarios ingresados previamente." , "Aviso" , JOptionPane.INFORMATION_MESSAGE);
        }else if(!(tCodigo.getText().equals(profesores[contadorProfesores-1]))){
            
        }
        return profesores[contadorProfesores-1];
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eMax = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bSalir = new javax.swing.JButton();
        bIngresar = new javax.swing.JButton();
        tPassword = new javax.swing.JTextField();
        tCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eMax.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        eMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eMax.setText("DTT");

        jLabel1.setText("Made by: Harold S. Catún Guevara");

        jLabel2.setText("202145353. ICS");

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        bIngresar.setText("-Ingreso-");
        bIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIngresarActionPerformed(evt);
            }
        });

        tCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCodigoActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo:");

        jLabel5.setText("Contraseña:");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eMax, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(157, 157, 157))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(98, 98, 98)))
                        .addComponent(bSalir))
                    .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(eMax, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addComponent(bIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bSalir)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    private void bIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIngresarActionPerformed
        // TODO add your handling code here:
        
        String Acodigo = tCodigo.getText();
        String Apassword=tPassword.getText();
        //Profesor prof=buscaCod(tCodigo.getText());
        
        if(Acodigo.equals("admin")&&Apassword.equals("admin")){
            vAdminProfesores bAdmin=new vAdminProfesores();
            this.setVisible(false);
            bAdmin.setVisible(true);
            
            
        }else if(contadorProfesores==0){
            JOptionPane.showMessageDialog(null, "No hay usuarios ingresados previamente." , "Aviso" , JOptionPane.INFORMATION_MESSAGE);
            tCodigo.setText("");
            tPassword.setText("");
            tCodigo.requestFocus();
            
        }else {
               for(int i=0;i<contadorProfesores;i++){
                   if(Acodigo.equals(profesores[i].codigo) && Apassword.equals(profesores[i].contrasenia)){
                       for(int o=0;o<contadorCursos;o++){
                        if(!profesores[i].nombre.equals(cursos[o].profesor)){
                            JOptionPane.showMessageDialog(null, "Deben de haber profesores con cursos." , "Aviso" , JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }else{
                            num=i;
                            num2=o;
                            this.setVisible(false);
                            vModulo juan = new vModulo();
                            juan.setVisible(true);
                            break;
                        }
                       }
                        
                   }
                   
               }
            }
    }//GEN-LAST:event_bIngresarActionPerformed

    private void tCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCodigoActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bIngresar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel eMax;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField tCodigo;
    private javax.swing.JTextField tPassword;
    // End of variables declaration//GEN-END:variables
}
