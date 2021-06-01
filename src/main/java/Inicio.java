import java.sql.Connection;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {

        //Menu
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("-----------------------");
            System.out.println("Aplicación de mensajes");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Listar mensaje");
            System.out.println("3. Eliminar mensaje");
            System.out.println("4. Edtar mensaje");
            System.out.println("5. Salir de la aplicación");

            //Leer opción ingresada por el usuario
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ServicioMensaje.crearMensaje();
                    break;
                case 2:
                    ServicioMensaje.listarMensaje();
                    break;
                case 3:
                    ServicioMensaje.borrarMensaje();

                    break;
                case 4:
                    ServicioMensaje.editarMensaje();
                    break;
                default:
                    break;
            }

        } while (opcion != 5);

        sc.close();
    }
}
