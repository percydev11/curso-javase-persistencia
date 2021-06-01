import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    //Método para conectar a la BD
    public Connection obtenerConexion() {

        //Objeto de conexión
        Connection objConexion = null;
        try {
            objConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "");

        } catch (SQLException e) {
            System.out.println(e);

        }
        return objConexion;
    }
}
