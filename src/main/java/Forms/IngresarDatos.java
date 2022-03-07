/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import static Forms.Main.lista;
import Objetos.Postor;
import Objetos.Apuesta;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author emili
 */
public class IngresarDatos extends javax.swing.JFrame {

    /**
     * Creates new form IngresoDatos
     */
     BufferedImage fondo = ImageIO.read(new File("src/main/java/Imagenes/Fondo2.png"));
    public IngresarDatos() throws IOException  {
        initComponents();
    
        jLabel1.setIcon(new ImageIcon(fondo.getScaledInstance(1200, 208,Image.SCALE_SMOOTH)));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Combox1 = new javax.swing.JComboBox<>();
        Combox3 = new javax.swing.JComboBox<>();
        Combox4 = new javax.swing.JComboBox<>();
        Combox5 = new javax.swing.JComboBox<>();
        Combox6 = new javax.swing.JComboBox<>();
        Combox2 = new javax.swing.JComboBox<>();
        Combox7 = new javax.swing.JComboBox<>();
        Combox8 = new javax.swing.JComboBox<>();
        Combox9 = new javax.swing.JComboBox<>();
        Combox10 = new javax.swing.JComboBox<>();
        AgregarApuesta = new javax.swing.JButton();
        Nombretxt = new javax.swing.JTextField();
        Montotxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Combox1.setBackground(new java.awt.Color(255, 204, 51));
        Combox1.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        Combox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));
        jPanel1.add(Combox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 65, 90, -1));

        Combox3.setBackground(new java.awt.Color(187, 104, 30));
        Combox3.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        Combox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));
        jPanel1.add(Combox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 65, 90, -1));

        Combox4.setBackground(new java.awt.Color(0, 153, 153));
        Combox4.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        Combox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));
        jPanel1.add(Combox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 65, 90, -1));

        Combox5.setBackground(new java.awt.Color(0, 153, 153));
        Combox5.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        Combox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));
        jPanel1.add(Combox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 65, 90, -1));

        Combox6.setBackground(new java.awt.Color(0, 153, 153));
        Combox6.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        Combox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));
        jPanel1.add(Combox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 65, 90, -1));

        Combox2.setBackground(new java.awt.Color(153, 153, 153));
        Combox2.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        Combox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));
        jPanel1.add(Combox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 65, 90, -1));

        Combox7.setBackground(new java.awt.Color(0, 153, 153));
        Combox7.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        Combox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));
        jPanel1.add(Combox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 65, 90, -1));

        Combox8.setBackground(new java.awt.Color(0, 153, 153));
        Combox8.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        Combox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));
        Combox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combox8ActionPerformed(evt);
            }
        });
        jPanel1.add(Combox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, 90, -1));

        Combox9.setBackground(new java.awt.Color(0, 153, 153));
        Combox9.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        Combox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));
        jPanel1.add(Combox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 60, 90, -1));

        Combox10.setBackground(new java.awt.Color(0, 153, 153));
        Combox10.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        Combox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4", "Caballo 5", "Caballo 6", "Caballo 7", "Caballo 8", "Caballo 9", "Caballo 10" }));
        jPanel1.add(Combox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 60, 90, -1));

        AgregarApuesta.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        AgregarApuesta.setText("Ingresar Apuesta");
        AgregarApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarApuestaActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 152, -1, 30));
        jPanel1.add(Nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 68, 239, -1));
        jPanel1.add(Montotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 120, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese el orden de apuesta de Ganador a Perdedor:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setText("Ingrese Apuesta:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setText("Ingrese Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, -1));

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel5.setText("10mo Lugar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 90, 80, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("1er Lugar");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 80, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("2do Lugar");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 80, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("3er Lugar");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 80, -1));

        jLabel9.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("4to Lugar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 80, -1));

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("5to Lugar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 80, -1));

        jLabel11.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("6toLugar");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 80, -1));

        jLabel12.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("7mo Lugar");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 90, 80, -1));

        jLabel13.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("8vo Lugar");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 90, 80, -1));

        jLabel14.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel14.setText("9no Lugar");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 90, 80, -1));

        jLabel15.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel15.setText("Sistema de Ingreso de Apuestas");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 160, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarApuestaActionPerformed
        // TODO add your handling code here:
          System.out.println(Nombretxt.getText());
            int[] caballos = new int[10];
            caballos[0] = Combox1.getSelectedIndex() + 1;
            caballos[1] = Combox2.getSelectedIndex() + 1;
            caballos[2] = Combox3.getSelectedIndex() + 1;
            caballos[3] = Combox4.getSelectedIndex() + 1;
            caballos[4] = Combox5.getSelectedIndex() + 1;
            caballos[5] = Combox6.getSelectedIndex() + 1;
            caballos[6] = Combox7.getSelectedIndex() + 1;
            caballos[7] = Combox8.getSelectedIndex() + 1;
            caballos[8] = Combox9.getSelectedIndex() + 1;
            caballos[9] = Combox10.getSelectedIndex() + 1;
            lista.anadir(new Apuesta(new Postor(Nombretxt.getText()), Double.parseDouble(Montotxt.getText()), caballos));
                 JOptionPane.showMessageDialog(null, " Apuesta Ingresada Correctamente ");
            this.dispose();
    }//GEN-LAST:event_AgregarApuestaActionPerformed

    private void Combox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combox8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         
          try {
                     new IngresarDatos().setVisible(false);
                    new Inicio().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
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
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                   new IngresarDatos().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarApuesta;
    private javax.swing.JComboBox<String> Combox1;
    private javax.swing.JComboBox<String> Combox10;
    private javax.swing.JComboBox<String> Combox2;
    private javax.swing.JComboBox<String> Combox3;
    private javax.swing.JComboBox<String> Combox4;
    private javax.swing.JComboBox<String> Combox5;
    private javax.swing.JComboBox<String> Combox6;
    private javax.swing.JComboBox<String> Combox7;
    private javax.swing.JComboBox<String> Combox8;
    private javax.swing.JComboBox<String> Combox9;
    private javax.swing.JTextField Montotxt;
    private javax.swing.JTextField Nombretxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
