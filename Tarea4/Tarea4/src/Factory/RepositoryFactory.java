package Factory;

import Repo.UsuarioRepository;
import Repo.repository;

public final class RepositoryFactory {

    private RepositoryFactory() {
        // Evitar instanciación
    }

    // Crea un repositorio de usuarios.
    public static UsuarioRepository createUsuarioRepository() {
        return new repository();
    }
}
