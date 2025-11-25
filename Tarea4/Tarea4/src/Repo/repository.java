package Repo;

import Conexion.DataBase;
import java.sql.*;
import java.util.ArrayList;

/**
 * Implementación del repositorio de usuarios.
 * Encapsula todo el acceso a datos relacionado con la tabla usuarios.
 */

public class repository implements UsuarioRepository {

    private Connection conn;

    public repository() {
        this.conn = DataBase.getConexion();
    }

    // Leer todos los usuarios
    // Recupera todos los usuarios registrados en la base de datos.
    public ArrayList<Object[]> obtenerUsuarios() {
        ArrayList<Object[]> lista = new ArrayList<>();

        String sql = "SELECT idUser, Nombre, Apellido, UserName, Telefono, email, Password FROM usuarios";

        try (PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new Object[] {
                        rs.getInt("idUser"),
                        rs.getString("Nombre"),
                        rs.getString("Apellido"),
                        rs.getString("UserName"),
                        rs.getString("Telefono"),
                        rs.getString("email"),
                        rs.getString("Password")
                });
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // Elimina un usuario identificado por su ID.
    public boolean eliminarPorID(String idUser) {
        String sql = "DELETE FROM usuarios WHERE idUser=?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, idUser);
            int affectedRows = ps.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Verifica si la contraseña proporcionada coincide con la del usuario
    // especificado por su ID.
    public boolean verificarPassword(int idUser, String password) {
        try {
            String sql = "SELECT 1 FROM usuarios WHERE idUser = ? AND Password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idUser);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            boolean valido = rs.next();

            rs.close();
            ps.close();

            return valido; // true si coincide
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
