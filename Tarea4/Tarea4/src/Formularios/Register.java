package Formularios;

import Conexion.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 * Ventana de registro de nuevos usuarios.
 * Se encarga de persistir en base de datos la información del formulario.
 */
public class Register extends BaseForm {

        public Register() {
                initComponents();
                setResizable(false);
                setLocationRelativeTo(null);
        }

        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jTextField2 = new javax.swing.JTextField();
                jTextField3 = new javax.swing.JTextField();
                jTextField4 = new javax.swing.JTextField();
                jPasswordField5 = new javax.swing.JPasswordField(); // CAMBIADO A JPasswordField
                jTextField1 = new javax.swing.JTextField();
                jTextField7 = new javax.swing.JTextField();
                jPasswordField6 = new javax.swing.JPasswordField(); // CAMBIADO A JPasswordField
                jButton1 = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setPreferredSize(new java.awt.Dimension(420, 650));
                setResizable(false);

                jPanel1.setBackground(new java.awt.Color(41, 128, 185));
                jPanel1.setBorder(null);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28));
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Crear Cuenta");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(18, Short.MAX_VALUE)));

                jPanel3.setBackground(new java.awt.Color(245, 245, 245));

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));
                jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 1));

                // Labels para los campos
                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12));
                jLabel2.setForeground(new java.awt.Color(60, 60, 60));
                jLabel2.setText("Nombre");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12));
                jLabel3.setForeground(new java.awt.Color(60, 60, 60));
                jLabel3.setText("Apellido");

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12));
                jLabel4.setForeground(new java.awt.Color(60, 60, 60));
                jLabel4.setText("Nombre de Usuario");

                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12));
                jLabel5.setForeground(new java.awt.Color(60, 60, 60));
                jLabel5.setText("Teléfono");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12));
                jLabel6.setForeground(new java.awt.Color(60, 60, 60));
                jLabel6.setText("Correo Electrónico");

                jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12));
                jLabel7.setForeground(new java.awt.Color(60, 60, 60));
                jLabel7.setText("Contraseña");

                jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12));
                jLabel8.setForeground(new java.awt.Color(60, 60, 60));
                jLabel8.setText("Confirmar Contraseña");

                jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 13));
                jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                                new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true),
                                javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8)));

                jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 13));
                jTextField2.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                                new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true),
                                javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8)));

                jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 13));
                jTextField3.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                                new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true),
                                javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8)));

                jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 13));
                jTextField4.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                                new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true),
                                javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8)));

                // jPasswordField5 - CAMPO CONTRASEÑA (OCULTO)
                jPasswordField5.setFont(new java.awt.Font("Segoe UI", 0, 13));
                jPasswordField5.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                                new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true),
                                javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8)));
                jPasswordField5.setEchoChar('•');

                jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 13));
                jTextField7.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                                new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true),
                                javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8)));

                // jPasswordField6 - CONFIRMAR CONTRASEÑA (OCULTO)
                jPasswordField6.setFont(new java.awt.Font("Segoe UI", 0, 13));
                jPasswordField6.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                                new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true),
                                javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8)));
                jPasswordField6.setEchoChar('•');

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addGroup(jPanel2Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jTextField1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                280,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jTextField2)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jTextField3)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jTextField7)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(jTextField4)
                                                                                .addComponent(jLabel7)
                                                                                .addComponent(jPasswordField5)
                                                                                .addComponent(jLabel8)
                                                                                .addComponent(jPasswordField6))
                                                                .addContainerGap(25, Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(8, 8, 8)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(8, 8, 8)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(8, 8, 8)
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(8, 8, 8)
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(8, 8, 8)
                                                                .addComponent(jLabel7)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPasswordField5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(8, 8, 8)
                                                                .addComponent(jLabel8)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPasswordField6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(15, Short.MAX_VALUE)));

                jButton1.setBackground(new java.awt.Color(41, 128, 185));
                jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15));
                jButton1.setForeground(new java.awt.Color(255, 255, 255));
                jButton1.setText("REGISTRAR");
                jButton1.setBorder(null);
                jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jButton1.setFocusPainted(false);
                jButton1.setPreferredSize(new java.awt.Dimension(220, 40));
                jButton1.addActionListener(this::jButton1ActionPerformed);
                jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                jButton1.setBackground(new java.awt.Color(52, 152, 219));
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                jButton1.setBackground(new java.awt.Color(41, 128, 185));
                        }
                });

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(45, 45, 45)
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.CENTER)
                                                                                .addComponent(jPanel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                220,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(45, Short.MAX_VALUE)));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(25, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jPanel3,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                pack();
                setLocationRelativeTo(null);
        }

        // Valida los datos por campo para detectar cuáles faltan y evitar que se envíen
        // vacíos
        private String validarCampos(
                        String nombre,
                        String usuario,
                        String username,
                        String telefono,
                        String email,
                        String password,
                        String passwordConfirm) {

                if (nombre.isEmpty() &&
                                usuario.isEmpty() &&
                                username.isEmpty() &&
                                telefono.isEmpty() &&
                                email.isEmpty() &&
                                password.isEmpty() &&
                                passwordConfirm.isEmpty()) {

                        return "Es obligatorio llenar todos los campos";
                }

                java.util.List<String> faltantes = new java.util.ArrayList<>();

                if (nombre.isEmpty())
                        faltantes.add("Nombre");
                if (usuario.isEmpty())
                        faltantes.add("Apellido");
                if (username.isEmpty())
                        faltantes.add("Nombre de Usuario");
                if (telefono.isEmpty())
                        faltantes.add("Teléfono");
                if (email.isEmpty())
                        faltantes.add("Email");
                if (password.isEmpty())
                        faltantes.add("Contraseña");
                if (passwordConfirm.isEmpty())
                        faltantes.add("Confirmar Contraseña");

                if (!password.isEmpty() && !passwordConfirm.isEmpty()) {
                        if (!password.equals(passwordConfirm)) {
                                return "Las contraseñas no coinciden";
                        }
                }

                if (!faltantes.isEmpty()) {
                        return "Faltan los siguientes campos:\n • " +
                                        String.join("\n • ", faltantes);
                }

                return null;
        }

        // Acción al presionar el botón de registrar, registra los datos ya validados en
        // la base de datos
        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                String nombre = jTextField1.getText().trim();
                String apellido = jTextField2.getText().trim();
                String username = jTextField3.getText().trim();
                String telefono = jTextField7.getText().trim();
                String email = jTextField4.getText().trim();
                String password = new String(jPasswordField5.getPassword()).trim();
                String passwordConfirm = new String(jPasswordField6.getPassword()).trim();

                String mensaje = validarCampos(
                                nombre,
                                apellido,
                                username,
                                telefono,
                                email,
                                password,
                                passwordConfirm);

                if (mensaje != null) {
                        JOptionPane.showMessageDialog(this, mensaje, "Campos incompletos", JOptionPane.WARNING_MESSAGE);
                        return;
                }

                String query = "INSERT INTO usuarios (UserName, Nombre, Apellido, Telefono, Email, Password) VALUES (?, ?, ?, ?, ?, ?)";
                try (Connection conn = DataBase.getConexion();
                                PreparedStatement pstmt = conn.prepareStatement(query)) {
                        pstmt.setString(1, username);
                        pstmt.setString(2, nombre);
                        pstmt.setString(3, apellido);
                        pstmt.setString(4, telefono);
                        pstmt.setString(5, email);
                        pstmt.setString(6, password);

                        int filas = pstmt.executeUpdate();
                        if (filas > 0) {
                                JOptionPane.showMessageDialog(jButton1, "Registro exitoso.");
                                dispose(); // Cierra el formulario de registro
                                Login login = new Login();
                                login.setVisible(true); // Abre el formulario de login
                        } else {
                                JOptionPane.showMessageDialog(jButton1, "Error en el registro.");
                        }
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

        public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(() -> new Register().setVisible(true));
        }

        // Variables declaration - do not modify
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPasswordField jPasswordField5;
        private javax.swing.JPasswordField jPasswordField6;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField4;
        private javax.swing.JTextField jTextField7;
        // End of variables declaration
}
