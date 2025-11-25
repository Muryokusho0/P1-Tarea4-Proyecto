package Formularios;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Clase base abstracta para los formularios Swing de la aplicación.
 * Centraliza configuraciones comunes y utilidades de presentación.
 */
public abstract class BaseForm extends JFrame {

    protected BaseForm() {
        // Configuración común a todas las ventanas
        setLocationRelativeTo(null);
        setResizable(false);
    }

    // Muestra un cuadro de diálogo de información estándar.
    protected void mostrarInformacion(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    // Muestra un cuadro de diálogo de error estándar.
    protected void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
