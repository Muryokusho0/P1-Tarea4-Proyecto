import Formularios.*;

/**
 * Punto de entrada de la aplicación de gestión de almacén.
 */
public class App {

    /**
     * Método principal: lanza la ventana de inicio de sesión.
     *
     * @param args argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }
}

