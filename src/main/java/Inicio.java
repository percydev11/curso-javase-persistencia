import java.sql.Connection;

public class Inicio {

    public static void main(String[] args) {

        //Prueba de conexión a la BD
        Conexion conexion = new Conexion();

        try (Connection cnx = conexion.get_connection()) {

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
