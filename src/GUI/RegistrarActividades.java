/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import static GUI.Login.usuarios;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Actividad;
import modelo.Usuario;
import utils.GestionIdiomas;

/**
 *
 * @author JhojanL
 */
public class RegistrarActividades extends javax.swing.JFrame {

    private GestionIdiomas gestionIdiomas;
    private Usuario user;
    private Usuario trabajador;
    private String idiomaSistema;

    /**
     * Creates new form Login
     */
    public RegistrarActividades(Usuario user, String idiomaSistema) {

        initComponents();
        desactivarPanel();

        this.user = user;
        this.idiomaSistema=idiomaSistema;
        this.trabajador = new Usuario();
        this.jLabelNombreUser.setText(user.getNombre().toUpperCase());
        cambiarIdioma(idiomaSistema);

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelRegistrarActividades = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelGuardar = new javax.swing.JPanel();
        jLabelGuardar = new javax.swing.JLabel();
        jLabelNombreUser = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelCodigoTrabajador = new javax.swing.JLabel();
        jPanelP = new javax.swing.JPanel();
        jLabelTipoActividad = new javax.swing.JLabel();
        jLabelHoras = new javax.swing.JLabel();
        jLabelPrioridad = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jComboBoxActividad = new javax.swing.JComboBox<>();
        jTextFieldHoras = new javax.swing.JFormattedTextField();
        jComboBoxPrioridad = new javax.swing.JComboBox<>();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jLabelNombreTrabajador = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCodigoTrabajador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxIdioma = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(42, 62, 169));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRegistrarActividades.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelRegistrarActividades.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistrarActividades.setText("REGISTRAR ACTIVIDADES");
        jPanel2.add(jLabelRegistrarActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atras.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 23, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 618, 64));

        jPanelGuardar.setBackground(new java.awt.Color(42, 62, 169));
        jPanelGuardar.setPreferredSize(new java.awt.Dimension(170, 49));
        jPanelGuardar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelGuardarMouseMoved(evt);
            }
        });
        jPanelGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelGuardarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelGuardarMouseExited(evt);
            }
        });
        jPanelGuardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGuardar.setText("Guardar");
        jPanelGuardar.add(jLabelGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 72, 27));

        jPanel1.add(jPanelGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 481, -1, 43));

        jLabelNombreUser.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombreUser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNombreUser.setText("USER");
        jPanel1.add(jLabelNombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCodigoTrabajador.setForeground(new java.awt.Color(204, 204, 204));
        jLabelCodigoTrabajador.setText("Codigo trabajador:");
        jPanel3.add(jLabelCodigoTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanelP.setBackground(new java.awt.Color(255, 255, 255));
        jPanelP.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelP.setForeground(new java.awt.Color(255, 255, 255));
        jPanelP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTipoActividad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTipoActividad.setText("Tipo actividad:");
        jPanelP.add(jLabelTipoActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 24, 106, -1));

        jLabelHoras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelHoras.setText("Horas:");
        jPanelP.add(jLabelHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 63, 106, -1));

        jLabelPrioridad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPrioridad.setText("Prioridad:");
        jPanelP.add(jLabelPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 102, 106, -1));

        jLabelDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelDescripcion.setText("Descripcion:");
        jPanelP.add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 169, 106, -1));

        jComboBoxActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "reunion", "desarrollo de producto", "analisis", "prueba" }));
        jPanelP.add(jComboBoxActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 21, 150, -1));

        jTextFieldHoras.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jTextFieldHoras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldHorasKeyTyped(evt);
            }
        });
        jPanelP.add(jTextFieldHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 60, 150, -1));

        jComboBoxPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanelP.add(jComboBoxPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 99, 150, -1));

        jTextFieldDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescripcionActionPerformed(evt);
            }
        });
        jTextFieldDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDescripcionKeyReleased(evt);
            }
        });
        jPanelP.add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 138, 150, 79));

        jPanel3.add(jPanelP, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 83, 390, 230));

        jLabelNombreTrabajador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNombreTrabajador.setText("Nombre trabajador");
        jPanel3.add(jLabelNombreTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, 20));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 67, 403, 10));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaN.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 31, -1, -1));

        jTextFieldCodigoTrabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoTrabajadorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoTrabajadorKeyTyped(evt);
            }
        });
        jPanel3.add(jTextFieldCodigoTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 144, -1, 325));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toma-de-decisionesN.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jComboBoxIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Inglés" }));
        jComboBoxIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxIdiomaActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 502, -1, -1));

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

    private void jPanelGuardarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelGuardarMouseMoved
        jPanelGuardar.setBackground(new Color(67, 91, 220));
    }//GEN-LAST:event_jPanelGuardarMouseMoved

    private void jPanelGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelGuardarMouseExited
        jPanelGuardar.setBackground(new Color(42, 62, 169));
    }//GEN-LAST:event_jPanelGuardarMouseExited

    private void jPanelGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelGuardarMouseClicked
        guardar();
    }//GEN-LAST:event_jPanelGuardarMouseClicked

    private void jTextFieldDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescripcionActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        busqueda();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jTextFieldHorasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHorasKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldHorasKeyTyped

    private void jTextFieldCodigoTrabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoTrabajadorKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCodigoTrabajadorKeyTyped

    private void jTextFieldCodigoTrabajadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoTrabajadorKeyReleased

        if (!jTextFieldCodigoTrabajador.getText().equals("")) {
            if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                busqueda();
            }
        }
    }//GEN-LAST:event_jTextFieldCodigoTrabajadorKeyReleased

    private void jTextFieldDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionKeyReleased
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            guardar();
        }
    }//GEN-LAST:event_jTextFieldDescripcionKeyReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
        new indexSupervisor(user, idiomaSistema).setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jComboBoxIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxIdiomaActionPerformed
        String itemSeleccionado = jComboBoxIdioma.getSelectedItem().toString();
        cambiarIdioma(itemSeleccionado);
    }//GEN-LAST:event_jComboBoxIdiomaActionPerformed

    public void cambiarIdioma(String idioma) {
        gestionIdiomas = new GestionIdiomas(idioma);
        jLabelRegistrarActividades.setText(gestionIdiomas.getProperty("registrar_actividades").toUpperCase());
        jLabelCodigoTrabajador.setText(gestionIdiomas.getProperty("codigo_trabajador"));
        jLabelTipoActividad.setText(gestionIdiomas.getProperty("tipo_actividad"));
        jLabelHoras.setText(gestionIdiomas.getProperty("horas"));
        jLabelPrioridad.setText(gestionIdiomas.getProperty("prioridad"));
        jLabelDescripcion.setText(gestionIdiomas.getProperty("descripcion"));
        jLabelGuardar.setText(gestionIdiomas.getProperty("guardar"));
        
        
        

    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxActividad;
    private javax.swing.JComboBox<String> jComboBoxIdioma;
    private javax.swing.JComboBox<String> jComboBoxPrioridad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCodigoTrabajador;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelGuardar;
    private javax.swing.JLabel jLabelHoras;
    private javax.swing.JLabel jLabelNombreTrabajador;
    private javax.swing.JLabel jLabelNombreUser;
    private javax.swing.JLabel jLabelPrioridad;
    private javax.swing.JLabel jLabelRegistrarActividades;
    private javax.swing.JLabel jLabelTipoActividad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelGuardar;
    private javax.swing.JPanel jPanelP;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldCodigoTrabajador;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JFormattedTextField jTextFieldHoras;
    // End of variables declaration//GEN-END:variables

    private void busqueda() {
        if (!jTextFieldCodigoTrabajador.getText().equals("")) {

            buscarTrabajador();
        } else {
            jTextFieldCodigoTrabajador.setText("");
            JOptionPane.showMessageDialog(rootPane,
                    gestionIdiomas.getProperty("mensaje_campo_vacio"),
                    gestionIdiomas.getProperty("titulo_error"),
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void desactivarPanel() {

        this.jPanelP.setVisible(false);
        jLabelNombreTrabajador.setVisible(false);
    }

    private void activarPanel() {

        this.jPanelP.setVisible(true);
        jLabelNombreTrabajador.setVisible(true);
    }

    private void buscarTrabajador() {

        var encontrado = false;
        var codigo = Integer.parseInt(jTextFieldCodigoTrabajador.getText());

        for (Usuario usuario : usuarios) {
            if (usuario.getCodigo() == codigo && usuario.getRol().equals("Trabajador")) {
                jLabelNombreTrabajador.setText(usuario.getNombre());
                encontrado = true;
                trabajador = usuario;
                break;
            }
        }

        if (encontrado) {

            activarPanel();
        } else {
            trabajador = null;
            jTextFieldCodigoTrabajador.setText("");
            desactivarPanel();
            JOptionPane.showMessageDialog(rootPane,
                    gestionIdiomas.getProperty("mensaje_codT_noEncontrado"),
                    gestionIdiomas.getProperty("titulo_error"),
                    JOptionPane.ERROR_MESSAGE);

        }

    }

    private void guardar() {

        if (trabajador != null) {

            if (!jComboBoxActividad.getSelectedItem().equals("")
                    && !jTextFieldHoras.getText().equals("0")
                    && !jComboBoxPrioridad.getSelectedItem().equals("")
                    && !jTextFieldDescripcion.getText().equals("")) {

                //creo una actividad
                var actividad = new Actividad("" + jComboBoxActividad.getSelectedItem(), jTextFieldDescripcion.getText(),
                        Integer.parseInt(jTextFieldHoras.getText()), "No completada",
                        Integer.parseInt(jComboBoxPrioridad.getSelectedItem().toString()));

                //guardo la actividad nueva
                for (int i = 0; i < usuarios.size(); i++) {
                    if (usuarios.get(i).getCodigo() == trabajador.getCodigo()) {

                        var listaActivades = usuarios.get(i).getActividad();
                        listaActivades.add(actividad);
                        usuarios.get(i).setActividad(listaActivades);
                        break;
                    }

                }

                JOptionPane.showMessageDialog(rootPane,
                        gestionIdiomas.getProperty("mensaje_actividad_guardada"),
                        gestionIdiomas.getProperty("titulo_ok"),
                        JOptionPane.INFORMATION_MESSAGE);

                limpiarCampos();

                System.out.println(trabajador.toString());
            } else {

                JOptionPane.showMessageDialog(rootPane,
                        gestionIdiomas.getProperty("mensaje_campos_incorrectos"),
                        gestionIdiomas.getProperty("titulo_error"),
                        JOptionPane.ERROR_MESSAGE);

            }
        } else {

            JOptionPane.showMessageDialog(rootPane,
                    gestionIdiomas.getProperty("mensaje_busca_trabajador"),
                    gestionIdiomas.getProperty("titulo_error"),
                    JOptionPane.ERROR_MESSAGE);

        }
    }

    private void limpiarCampos() {
        jComboBoxActividad.setSelectedIndex(0);
        jTextFieldHoras.setText("");
        jComboBoxPrioridad.setSelectedIndex(0);
        jTextFieldDescripcion.setText("");

    }

}
