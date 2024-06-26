/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Actividad;
import modelo.Usuario;
import utils.GestionIdiomas;

/**
 *
 * @author Estudiante
 */
public class Login extends javax.swing.JFrame {

    private GestionIdiomas gestionIdiomas;
    public static ArrayList<Usuario> usuarios;
    private String idiomaSistema;

    /**
     * Creates new form Login
     */
    public Login() {

        this.usuarios = new ArrayList<Usuario>();
        initComponents();
        cambiarIdioma("Español");
        establecerUsuarios();
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
        jComboBoxIdioma = new javax.swing.JComboBox<>();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelContraseña = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabelInicioSesion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jComboBoxIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Inglés" }));
        jComboBoxIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxIdiomaActionPerformed(evt);
            }
        });

        jLabelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(204, 204, 204));
        jLabelCodigo.setText("Escribe tu codigo para iniciar sesion:");

        jTextFieldCodigo.setBorder(null);
        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyReleased(evt);
            }
        });

        jLabelContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(204, 204, 204));
        jLabelContraseña.setText("Escribe tu contrasena para acceder:");

        jButtonAceptar.setBackground(new java.awt.Color(42, 62, 169));
        jButtonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jPasswordFieldContraseña.setBorder(null);
        jPasswordFieldContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldContraseñaKeyReleased(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(42, 62, 169));

        jLabelInicioSesion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInicioSesion.setText("        LOGIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabelInicioSesion)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(42, 62, 169));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(42, 62, 169));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/172497_lock_icon.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4243324_ux_user_app_basic_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabelCodigo))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCodigo)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(152, 152, 152))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(84, 84, 84)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCodigo)
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabelContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPasswordFieldContraseña)
                        .addGap(4, 4, 4)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jComboBoxIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxIdiomaActionPerformed
        String itemSeleccionado = jComboBoxIdioma.getSelectedItem().toString();
        cambiarIdioma(itemSeleccionado);
    }//GEN-LAST:event_jComboBoxIdiomaActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed

        acceder();

    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jTextFieldCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyReleased

        if (!jTextFieldCodigo.getText().equals("")) {
            if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                acceder();
            }
        }
    }//GEN-LAST:event_jTextFieldCodigoKeyReleased

    private void jPasswordFieldContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaKeyReleased
        if (!jTextFieldCodigo.getText().equals("")) {
            if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                acceder();
            }
        }
    }//GEN-LAST:event_jPasswordFieldContraseñaKeyReleased

    public void cambiarIdioma(String idioma) {
        idiomaSistema = idioma;
        gestionIdiomas = new GestionIdiomas(idioma);
        jLabelInicioSesion.setText(gestionIdiomas.getProperty("inicio_sesion"));
        jLabelCodigo.setText(gestionIdiomas.getProperty("codigo"));
        jLabelContraseña.setText(gestionIdiomas.getProperty("contrasena"));
        jButtonAceptar.setText(gestionIdiomas.getProperty("aceptar"));

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JComboBox<String> jComboBoxIdioma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelInicioSesion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextFieldCodigo;
    // End of variables declaration//GEN-END:variables

    private void establecerUsuarios() {

        var u = new Usuario(1, "123", "Jhojan", "Supervisor", null);
        this.usuarios.add(u);

        var a = new Actividad("reunión", "reuniones necesarias..", 2, "Completada", 4);
        var a1 = new Actividad("desarrollo de producto", "...", 5, "No completada", 8);
        var a2 = new Actividad("analisis", "...", 6, "No completada", 8);
        var a3 = new Actividad("pruebas", "...", 6, "No completada", 8);

        var actividades = new ArrayList<Actividad>();
        actividades.add(a);
        actividades.add(a1);
        actividades.add(a2);
        actividades.add(a3);

        var u2 = new Usuario(2, "123", "David", "Trabajador", actividades);
        this.usuarios.add(u2);

    }

    private void acceder() {
        if ((!jTextFieldCodigo.getText().equals(""))
                && jTextFieldCodigo.getText().matches("[0-9]*")) {

            var usuarioValido = false;
            var user = new Usuario();

            for (Usuario usuario : usuarios) {

                if ((usuario.getCodigo() == Integer.parseInt(jTextFieldCodigo.getText()))
                        && usuario.getPass().equals(String.valueOf(jPasswordFieldContraseña.getPassword()))) {

                    usuarioValido = true;
                    user = usuario;
                    break;
                }
            }
            if (usuarioValido) {

                if (user.getRol().equals("Supervisor")) {

                    this.dispose();
                    new indexSupervisor(user, idiomaSistema).setVisible(true);

                } else {

                    System.out.println(user);
                    this.dispose();
                    new indexTrabajador(user, idiomaSistema).setVisible(true);

                }
            } else {
                limpiarCampos();
                JOptionPane.showMessageDialog(rootPane,
                        gestionIdiomas.getProperty("mensaje_login_error"),
                        gestionIdiomas.getProperty("titulo_error"),
                        JOptionPane.ERROR_MESSAGE);
            }

        } else {

            limpiarCampos();
            JOptionPane.showMessageDialog(rootPane,
                    gestionIdiomas.getProperty("mensaje_codigo_error"),
                    gestionIdiomas.getProperty("titulo_error"),
                    JOptionPane.ERROR_MESSAGE);

        }

    }

    private void limpiarCampos() {
        jTextFieldCodigo.setText("");
        jPasswordFieldContraseña.setText("");
    }
}
