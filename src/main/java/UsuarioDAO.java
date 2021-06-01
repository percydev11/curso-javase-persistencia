import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public static void listarUsuario(){

        Conexion objConexion = new Conexion();
        PreparedStatement ps = null;
        //Objeto ResulSet para traer los datos en filas y poderlos procesar para mostrarlos
        ResultSet rs = null;
        try (Connection conexion = objConexion.obtenerConexion()) {
            String query = "SELECT * FROM usuarios";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            //Leer datos
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_usuario"));
                System.out.println("Correo: " + rs.getString("correo"));
                System.out.println("Clave: " + rs.getString("clave"));
                System.out.println("Nombre completo: " + rs.getString("nombre_completo"));
                System.out.println("");
            }
        } catch (SQLException e) {
            System.out.println("No se han podido recuperar los usuarios");
            System.out.println(e);
        }

    }
}
