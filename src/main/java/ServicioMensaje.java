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


    }

    public static void listarMensaje() {
        System.out.println("Lista de mensajes");
        MensajeDAO.leerMensajeDb();

    }

    public static void borrarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor escoger el ID del mensaje a borrar");
        MensajeDAO.leerMensajeDb();
        System.out.println("Ingresar  el ID del mensaje a borrar");
        int idMensaje = sc.nextInt();
        MensajeDAO.borrarMensajeDb(idMensaje);
    }

    public static void editarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nuevo mensaje");
        String nuevoMensaje = sc.nextLine();
        System.out.println("Indica el ID del mensaje a editar");
        MensajeDAO.leerMensajeDb();
        System.out.println("Ingresar  el ID del mensaje a borrar");
        int idMensaje = sc.nextInt();

        Mensaje actualizacion = new Mensaje();
        actualizacion.setIdMensaje(idMensaje);
        actualizacion.setMensaje(nuevoMensaje);
        MensajeDAO.actualizarMensajeDb(actualizacion);
    }

}
