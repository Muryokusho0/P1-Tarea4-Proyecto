# Sistema de Gestión de Usuarios - Almacén ITLA

Aplicación de escritorio desarrollada en **Java Swing** que permite gestionar usuarios de un almacén:
inicio de sesión, registro de nuevos usuarios y administración (listado, actualización y eliminación).

## Estructura del proyecto

src/
└── 
main/

		└── java/
        ├── App.java
        │
        ├── Conexion/
        │   └── DataBase.java
        │
        ├── Factory/
        │   └── RepositoryFactory.java
        │
        ├── CargaDeUsuarios/
        │   ├── UsuarioRepository.java
        │   └── repository.java
        │
        ├── Formularios/
        │   ├── BaseForm.java
        │   ├── Login.java
        │   ├── Register.java
        │   └── Panel.java
        │
        └── README.md

- `App.java`  
  Punto de entrada de la aplicación. Inicializa y muestra la ventana de login.

- Paquete `Formularios`
  - `BaseForm.java`  
    Clase base abstracta que extiende `JFrame` y concentra la configuración común de las ventanas
    (centrado, tamaño fijo y utilidades para mostrar mensajes).
  - `Login.java`  
    Formulario de inicio de sesión. Valida las credenciales del usuario contra la base de datos
    y, en caso de éxito, abre el panel principal.
  - `Register.java`  
    Formulario de registro de usuarios. Recoge los datos del formulario y los inserta en la
    tabla `usuarios`.
  - `Panel.java`  
    Ventana principal para la gestión de usuarios: muestra el listado en una tabla y permite
    operaciones CRUD (actualizar y eliminar).

- Paquete `Conexion`
  - `DataBase.java`  
    Singleton responsable de gestionar la conexión JDBC con la base de datos MySQL.

- Paquete `CargaDeUsuarios`
  - `UsuarioRepository.java`  
    Interfaz (abstracción) que define el contrato de acceso a datos para la entidad usuario.
  - `repository.java`  
    Implementación concreta de `UsuarioRepository` que utiliza JDBC para ejecutar las consultas SQL
    sobre la tabla `usuarios`.

- Paquete `Factory`
  - `RepositoryFactory.java`  
    Fábrica encargada de construir instancias de `UsuarioRepository`. El código cliente (por ejemplo,
    `Panel`) solo conoce la interfaz y delega la creación en la factoría.

## Patrones y principios aplicados

### Abstracción

- La interfaz `UsuarioRepository` expone únicamente las operaciones necesarias para trabajar con
  usuarios (`obtenerUsuarios`, `eliminarPorEmail`, `verificarPassword`) ocultando los detalles de
  implementación (SQL, conexión, etc.).
- `BaseForm` abstrae la configuración común de las ventanas y expone métodos de utilidad
  (`mostrarInformacion`, `mostrarError`).

### Encapsulamiento

- Los atributos de las clases se han declarado como `private` siempre que es posible y el acceso se
  realiza mediante métodos públicos controlados.
- La conexión a la base de datos está encapsulada dentro del Singleton `DataBase`, evitando que el
  resto de la aplicación conozca detalles de `DriverManager` o de la URL de conexión.

### Herencia

- `Login`, `Register` y `Panel` heredan de `BaseForm`, que a su vez hereda de `JFrame`.  
  De esta forma comparten comportamiento común (centrado, tamaño fijo y utilidades de mensajes).

### Polimorfismo

- El panel principal declara el repositorio como tipo `UsuarioRepository`:
    private UsuarioRepository repo;
