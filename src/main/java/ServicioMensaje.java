import java.util.Scanner;

public class ServicioMensaje {

    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensajeUsuario = sc.nextLine();
        System.out.println("Escribe tu nombre");
        String nombreUsuario = sc.nextLine();

        Mensaje registro = new Mensaje();
        registro.setMensaje(mensajeUsuario);
        registro.setAutorMensaje(nombreUsuario);
        MensajeDAO.crearMensajeDb(registro);
        sc.close();

    }

    public static void listarMensaje() {
        MensajeDAO.leerMensajeDb();

    }

    public static void borrarMensaje() {

    }

    public static void editarMensaje() {

    }

}
