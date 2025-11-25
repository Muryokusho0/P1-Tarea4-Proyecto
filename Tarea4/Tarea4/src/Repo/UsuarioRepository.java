package Repo;

import java.util.ArrayList;

/**
 * Clase que define las operaciones de acceso a datos
 * relacionadas con la entidad Usuario.
 */
public interface UsuarioRepository {

    ArrayList<Object[]> obtenerUsuarios();

    boolean eliminarPorID(String idUser);

    boolean verificarPassword(int idUser, String password);
}
