package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    private static final String JDBC_URL = "jdbc:mysql://almacenitla-db-itla-3837.e.aivencloud.com:25037/almacenitlafinal";
    private static final String USERNAME = "avnadmin";
    private static final String PASSWORD = "AVNS_pPa2xcIg1UbjOzcsoMg";
    /** Conexión reutilizable a la base de datos. */
    private Connection conexion;
    /** Instancia única del Singleton. */
    private static DataBase instancia;

    private DataBase() {
        conectar();
    }

    private void conectar() {
        try {
            if (conexion == null || conexion.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexion = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Error al conectar con la base de datos", e);
        }
    }

    // Método estático → devuelve la única instancia
    public static synchronized DataBase getInstancia() {
        if (instancia == null) {
            instancia = new DataBase();
        }
        return instancia;
    }

    // Obtiene la conexión activa, reabriéndola en caso de que se haya cerrado.
    private Connection getConexionInterna() {
        try {
            if (conexion == null || conexion.isClosed()) {
                conectar();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error verificando el estado de la conexión", e);
        }
        return conexion;
    }

    // Devuelve la conexión

    /**
     * Punto de acceso estático utilizado por el resto de la aplicación.
     * Internamente delega en la instancia Singleton.
     */

    public static Connection getConexion() {
        try {
            return getInstancia().getConexionInterna();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}