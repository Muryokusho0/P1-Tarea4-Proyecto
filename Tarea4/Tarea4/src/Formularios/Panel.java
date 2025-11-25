package Formularios;

import Conexion.*;
import Repo.UsuarioRepository;
import Factory.RepositoryFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Panel extends BaseForm {

    private UsuarioRepository repo;

    public Panel() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.repaint();

        // Inicializar repositorio de usuarios a través de Facotory
        repo = RepositoryFactory.createUsuarioRepository();

        cargarTabla(); // carga inicial
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();

        JPanel jPanel2 = new javax.swing.JPanel(); // Panel header

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 550));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        // Panel header
        jPanel2.setBackground(new java.awt.Color(41, 128, 185));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuarios Registrados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE)));

        // Configuración de la tabla
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTable1.setRowHeight(35);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(new java.awt.Color(230, 230, 230));
        jTable1.setSelectionBackground(new java.awt.Color(52, 152, 219));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.getTableHeader().setFont(new java.awt.Font("Segoe UI", 1, 15));
        jTable1.getTableHeader().setBackground(new java.awt.Color(52, 73, 94));
        jTable1.getTableHeader().setForeground(new java.awt.Color(255, 255, 255));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null },
                        { null, null, null },
                        { null, null, null },
                        { null, null, null },
                        { null, null, null },
                        { null, null, null },
                        { null, null, null },
                        { null, null, null }
                },
                new String[] {
                        "ID", "Nombre", "Apellido", "UserName", "Teléfono", "Email"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        jScrollPane1.setViewportView(jTable1);
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200), 1));
        jScrollPane1.getViewport().setBackground(java.awt.Color.WHITE);

        // Botón Actualizar
        jButton1.setBackground(new java.awt.Color(46, 204, 113));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(140, 42));
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1.setBackground(new java.awt.Color(39, 174, 96));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1.setBackground(new java.awt.Color(46, 204, 113));
            }
        });

        // Botón Eliminar
        jButton2.setBackground(new java.awt.Color(231, 76, 60));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 15));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Eliminar");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setPreferredSize(new java.awt.Dimension(140, 42));
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2.setBackground(new java.awt.Color(192, 57, 43));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2.setBackground(new java.awt.Color(231, 76, 60));
            }
        });

        // Botón Cerrar Sesión
        jButton3.setBackground(new java.awt.Color(149, 165, 166));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 15));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cerrar Sesión");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setPreferredSize(new java.awt.Dimension(140, 42));
        jButton3.addActionListener(this::jButton3ActionPerformed);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3.setBackground(new java.awt.Color(127, 140, 141));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3.setBackground(new java.awt.Color(149, 165, 166));
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(50, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(30, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null); // Centrar la ventana
    }

    /**
     * Carga en la tabla gráfica todos los usuarios obtenidos desde el repositorio.
     */
    private void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);

        ArrayList<Object[]> datos = repo.obtenerUsuarios();
        for (Object[] fila : datos) {
            modelo.addRow(fila);
        }
    }

    private boolean verificarPassword() {
        int fila = jTable1.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un usuario para modificar.");
            return false;
        }

        // Pedir la contraseña
        String passIngresada = JOptionPane.showInputDialog(this, "Introduce la contraseña del usuario:");

        if (passIngresada == null) {
            JOptionPane.showMessageDialog(this, "No ingresaste ninguna contraseña. Acceso denegado.");
            return false;
        }

        // Obtener la contraseña real del usuario desde el repositorio
        ArrayList<Object[]> datos = repo.obtenerUsuarios();
        String passReal = datos.get(fila)[6].toString();

        if (passIngresada.equals(passReal)) {
            JOptionPane.showMessageDialog(this, "Acceso concedido. Ahora puedes modificar este registro.");
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Contraseña incorrecta. Acceso denegado.");
            return false;
        }
    }

    // BOTÓN ACTUALIZAR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (!verificarPassword()) {
            return;
        }

        String Nombre = JOptionPane.showInputDialog(this, "Modificar nombre: ").trim();
        String Apellido = JOptionPane.showInputDialog(this, "Modificar apellido: ").trim();
        String UserName = JOptionPane.showInputDialog(this, "Modificar nombre de usuario: ").trim();
        String Telefono = JOptionPane.showInputDialog(this, "Modificar teléfono: ").trim();
        String Email = JOptionPane.showInputDialog(this, "Modificar email: ").trim();

        if (Nombre.isEmpty())
            Nombre = repo.obtenerUsuarios().get(jTable1.getSelectedRow())[1].toString();
        if (Apellido.isEmpty())
            Apellido = repo.obtenerUsuarios().get(jTable1.getSelectedRow())[2].toString();
        if (UserName.isEmpty())
            UserName = repo.obtenerUsuarios().get(jTable1.getSelectedRow())[3].toString();
        if (Telefono.isEmpty())
            Telefono = repo.obtenerUsuarios().get(jTable1.getSelectedRow())[4].toString();
        if (Email.isEmpty())
            Email = repo.obtenerUsuarios().get(jTable1.getSelectedRow())[5].toString();

        int idUser = Integer.parseInt(repo.obtenerUsuarios().get(jTable1.getSelectedRow())[0].toString());

        try {
            String query = "UPDATE usuarios SET nombre = ?, apellido = ?, username = ?, telefono = ?, email = ? WHERE idUser = ?";
            Connection con = DataBase.getConexion();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, Nombre);
            ps.setString(2, Apellido);
            ps.setString(3, UserName);
            ps.setString(4, Telefono);
            ps.setString(5, Email);
            ps.setInt(6, idUser);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Usuario actualizado correctamente.");
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al actualizar el usuario.");
        }

        cargarTabla();
    }

    // BOTÓN ELIMINAR
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int row = jTable1.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro para eliminar");
            return;
        }

        String idUser = jTable1.getValueAt(row, 0).toString();

        if (repo.eliminarPorID(idUser)) {
            JOptionPane.showMessageDialog(this, "Usuario eliminado");
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar");
        }
    }

    // Cerrar sesión
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        JOptionPane.showMessageDialog(null, "Sesión cerrada");
        new Login().setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Panel().setVisible(true));
    }

    // Variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jButton1; // Actualizar
    private javax.swing.JButton jButton2; // Eliminar
    private javax.swing.JButton jButton3;
}
