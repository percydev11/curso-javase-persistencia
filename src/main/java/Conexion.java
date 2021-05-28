import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    //Método para conectar a la BD
    public Connection get_connection() {

        //Objeto de conexión
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "");
            if(conection != null) {
                System.out.println("Conexión exitosa");
            }
        } catch(SQLException e) {
            System.out.println(e);

        }
        return conection;
    }
}
