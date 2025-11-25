package Formularios;

import Conexion.DataBase;
import java.sql.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Ventana de inicio de sesión del sistema.
 * Valida las credenciales del usuario contra la base de datos.
 */
public class Login extends BaseForm {

        public Login() {
                initComponents();
                setResizable(false);
                setTitle("INGRESAR AL SISTEMA");
                setLocationRelativeTo(null);
                this.repaint();

        }

        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                jPanel3 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jPasswordField1 = new javax.swing.JPasswordField();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                JPanel jPanel4 = new javax.swing.JPanel();
                JLabel jLabel4 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setPreferredSize(new java.awt.Dimension(450, 550));
                setResizable(false);
                getContentPane().setBackground(new java.awt.Color(245, 245, 245));

                jPanel3.setBackground(new java.awt.Color(255, 255, 255));
                jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 1));

                // Panel decorativo superior
                jPanel4.setBackground(new java.awt.Color(41, 128, 185));
                jPanel4.setPreferredSize(new java.awt.Dimension(400, 120));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32));
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("INICIO DE SESIÓN");

                jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14));
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap()));
                jPanel4Layout.setVerticalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGap(30, 30, 30)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                45,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel4)
                                                                .addContainerGap(25, Short.MAX_VALUE)));

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14));
                jLabel2.setForeground(new java.awt.Color(60, 60, 60));
                jLabel2.setText("Usuario");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14));
                jLabel3.setForeground(new java.awt.Color(60, 60, 60));
                jLabel3.setText("Contraseña");

                jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14));
                jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                                new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true),
                                javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10)));
                jTextField1.setPreferredSize(new java.awt.Dimension(300, 40));

                // JPasswordField - LA CONTRASEÑA ESTARÁ OCULTA
                jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 14));
                jPasswordField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                                new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true),
                                javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10)));
                jPasswordField1.setPreferredSize(new java.awt.Dimension(300, 40));
                jPasswordField1.setEchoChar('•'); // Carácter que muestra en lugar de la contraseña

                jButton1.setBackground(new java.awt.Color(41, 128, 185));
                jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15));
                jButton1.setForeground(new java.awt.Color(255, 255, 255));
                jButton1.setText("INGRESAR");
                jButton1.setBorder(null);
                jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jButton1.setFocusPainted(false);
                jButton1.setPreferredSize(new java.awt.Dimension(140, 45));
                jButton1.addActionListener(this::jButton1ActionPerformed);
                jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                jButton1.setBackground(new java.awt.Color(52, 152, 219));
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                jButton1.setBackground(new java.awt.Color(41, 128, 185));
                        }
                });

                jButton2.setBackground(new java.awt.Color(255, 255, 255));
                jButton2.setFont(new java.awt.Font("Segoe UI", 1, 15));
                jButton2.setForeground(new java.awt.Color(41, 128, 185));
                jButton2.setText("REGISTRARSE");
                jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(41, 128, 185), 2, true));
                jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jButton2.setFocusPainted(false);
                jButton2.setPreferredSize(new java.awt.Dimension(140, 45));
                jButton2.addActionListener(this::jButton2ActionPerformed);
                jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                jButton2.setBackground(new java.awt.Color(240, 248, 255));
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                jButton2.setBackground(new java.awt.Color(255, 255, 255));
                        }
                });

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 400,
                                                                Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(50, 50, 50)
                                                                .addGroup(jPanel3Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jTextField1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                300,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jPasswordField1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                300,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jButton1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                140,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(20, 20, 20)
                                                                                                .addComponent(jButton2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                140,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(50, Short.MAX_VALUE)));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jPanel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(25, 25, 25)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPasswordField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(40, 40, 40)
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jButton1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                45,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                45,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(60, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(25, Short.MAX_VALUE)
                                                                .addComponent(jPanel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(25, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap(25, Short.MAX_VALUE)
                                                                .addComponent(jPanel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(25, Short.MAX_VALUE)));

                pack();
                setLocationRelativeTo(null);
        }

        /**
         * Maneja el evento de clic sobre el botón de inicio de sesión.
         * Realiza la validación del usuario y, si es correcta, abre el panel principal.
         */
        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                String user = jTextField1.getText();
                String password = new String(jPasswordField1.getPassword());

                String query = "SELECT * FROM usuarios WHERE UserName = ? AND Password = ?";

                try {
                        Connection con = DataBase.getConexion();
                        PreparedStatement ps = con.prepareStatement(query);
                        ps.setString(1, user);
                        ps.setString(2, password);
                        ResultSet rs = ps.executeQuery();

                        if (rs.next()) {
                                // Login successful
                                JOptionPane.showMessageDialog(this,
                                                "¡Bienvenido al sistema " + user + "!", "Login Exitoso",
                                                JOptionPane.INFORMATION_MESSAGE);
                                Panel panel = new Panel();
                                panel.setVisible(true);
                                this.dispose();

                        } else {
                                // Login failed
                                JOptionPane.showMessageDialog(this,
                                                "Debe ingresar su usuario y contraseña, si no está registrado debe registrarse",
                                                "Login Error",
                                                JOptionPane.ERROR_MESSAGE);
                        }
                        ps.close();
                        rs.close();
                } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(this,
                                        "Error de conexión con la base de datos",
                                        "Error",
                                        JOptionPane.ERROR_MESSAGE);
                }
        }

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
                this.dispose();
                Register registerForm = new Register();
                registerForm.setVisible(true);
        }

        public static void main(String args[]) {

                java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
        }

        // Variables declaration - do not modify
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPasswordField jPasswordField1;
        private javax.swing.JTextField jTextField1;
        // End of variables declaration
}
