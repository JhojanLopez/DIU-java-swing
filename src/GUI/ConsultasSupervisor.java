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
import javax.swing.table.DefaultTableModel;
import modelo.Actividad;
import modelo.Usuario;
import utils.GestionIdiomas;

/**
 *
 * @author JhojanL
 */
public class ConsultasSupervisor extends javax.swing.JFrame {

    private GestionIdiomas gestionIdiomas;
    private Usuario user;
    private Usuario trabajador;
    private String idiomaSistema;
    private DefaultTableModel modelo;

    /**
     * Creates new form Login
     */
    public ConsultasSupervisor(Usuario user, String idiomaSistema) {

        initComponents();
        desactivarPanel();

        this.user = user;
        this.idiomaSistema = idiomaSistema;
        this.trabajador = new Usuario();
        this.jLabelNombreUser.setText(user.getNombre().toUpperCase());
        modelo = new DefaultTableModel();
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
        jLabelConsultas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelGuardar = new javax.swing.JPanel();
        jLabelGuardar = new javax.swing.JLabel();
        jLabelNombreUser = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelCodigoTrabajador = new javax.swing.JLabel();
        jPanelP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsulta = new javax.swing.JTable();
        jLabelNombreTrabajador = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCodigoTrabajador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(42, 62, 169));

        jLabelConsultas.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelConsultas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConsultas.setText("CONSULTAS");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atras.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(193, 193, 193)
                .addComponent(jLabelConsultas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelConsultas)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18))
        );

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

        jLabelGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGuardar.setText("Guardar");

        javax.swing.GroupLayout jPanelGuardarLayout = new javax.swing.GroupLayout(jPanelGuardar);
        jPanelGuardar.setLayout(jPanelGuardarLayout);
        jPanelGuardarLayout.setHorizontalGroup(
            jPanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGuardarLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabelGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanelGuardarLayout.setVerticalGroup(
            jPanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGuardarLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabelGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelNombreUser.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombreUser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNombreUser.setText("USER");

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

        tablaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tipo de actividad", "Descripcion", "Horas estimadas", "Estado", "Prioridad"
            }
        ));
        jScrollPane1.setViewportView(tablaConsulta);

        jPanelP.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 240));

        jPanel3.add(jPanelP, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 83, 500, 240));

        jLabelNombreTrabajador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNombreTrabajador.setText("Nombre trabajador");
        jPanel3.add(jLabelNombreTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 20));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 67, 520, 10));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toma-de-decisionesN.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 229, Short.MAX_VALUE)
                .addComponent(jPanelGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jLabelNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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

    private void jPanelGuardarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelGuardarMouseMoved
        jPanelGuardar.setBackground(new Color(67, 91, 220));
    }//GEN-LAST:event_jPanelGuardarMouseMoved

    private void jPanelGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelGuardarMouseExited
        jPanelGuardar.setBackground(new Color(42, 62, 169));
    }//GEN-LAST:event_jPanelGuardarMouseExited

    private void jPanelGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelGuardarMouseClicked

    }//GEN-LAST:event_jPanelGuardarMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        busqueda();
    }//GEN-LAST:event_jLabel11MouseClicked

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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
        new indexSupervisor(user, idiomaSistema).setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    public void cambiarIdioma(String idioma) {
        gestionIdiomas = new GestionIdiomas(idioma);
        jLabelConsultas.setText(gestionIdiomas.getProperty("consultas").toUpperCase());
        jLabelCodigoTrabajador.setText(gestionIdiomas.getProperty("codigo_trabajador"));
        jLabelGuardar.setText(gestionIdiomas.getProperty("guardar"));
        modelo.addColumn(gestionIdiomas.getProperty("tipo_actividad"));
        modelo.addColumn(gestionIdiomas.getProperty("descripcion"));
        modelo.addColumn(gestionIdiomas.getProperty("horas"));
        modelo.addColumn(gestionIdiomas.getProperty("estado"));
        modelo.addColumn(gestionIdiomas.getProperty("prioridad"));
        this.tablaConsulta.setModel(modelo);

    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCodigoTrabajador;
    private javax.swing.JLabel jLabelConsultas;
    private javax.swing.JLabel jLabelGuardar;
    private javax.swing.JLabel jLabelNombreTrabajador;
    private javax.swing.JLabel jLabelNombreUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelGuardar;
    private javax.swing.JPanel jPanelP;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldCodigoTrabajador;
    private javax.swing.JTable tablaConsulta;
    // End of variables declaration//GEN-END:variables

    private void busqueda() {
        if (!jTextFieldCodigoTrabajador.getText().equals("")) {

            buscarTrabajador();
            muestraValores();
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
            this.modelo.setNumRows(0);
            trabajador = null;
            jTextFieldCodigoTrabajador.setText("");
            desactivarPanel();
            JOptionPane.showMessageDialog(rootPane,
                    gestionIdiomas.getProperty("mensaje_codT_noEncontrado"),
                    gestionIdiomas.getProperty("titulo_error"),
                    JOptionPane.ERROR_MESSAGE);

        }

    }

    private void muestraValores() {

        if (trabajador != null) {

            for (int i = 0; i < trabajador.getActividad().size(); i++) {
                String info[]= new String[5];
                info[0]=trabajador.getActividad().get(i).getTipo();
                info[1]=trabajador.getActividad().get(i).getDescripcion();
                info[2]=""+trabajador.getActividad().get(i).getHoras();
                info[3]=trabajador.getActividad().get(i).getEstado();
                info[4]=""+trabajador.getActividad().get(i).getPrioridad();
                modelo.addRow(info);
                
            }
        }
    }

}