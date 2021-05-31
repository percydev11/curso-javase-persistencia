import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajeDAO {

    public static void crearMensajeDb(Mensaje mensaje) {

        Conexion objConexion = new Conexion();

        try (Connection conexion = objConexion.obtenerConexion()) {

            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutorMensaje());
                //Para que la BD ejecute la sentencia
                ps.executeUpdate();
                System.out.println("El mensaje fue creado correctamente");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }


    public static void leerMensajeDb() {
        Conexion objConexion = new Conexion();
        PreparedStatement ps = null;
        //Objeto ResulSet para traer los datos en filas y poderlos procesar para mostrarlos
        ResultSet rs = null;
        try (Connection conexion = objConexion.obtenerConexion()) {
            String query = "SELECT * FROM mensajes";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            //Leer datos
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_mensaje"));
                System.out.println("Mensaje: " + rs.getString("mensaje"));
                System.out.println("Autor: " + rs.getString("autor_mensaje"));
                System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
                System.out.println("");
            }
        } catch (SQLException e) {
            System.out.println("No se han podido recuperar los mensajes");
            System.out.println(e);
        }
    }


    public static void borrarMensajeDb(int id_mensaje) {

    }

    public static void actualizarMensajeDb(Mensaje mensaje) {

    }
}
