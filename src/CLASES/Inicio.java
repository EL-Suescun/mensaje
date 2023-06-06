package CLASES;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Inicio {

    //Metodo principal del programa
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Se crea el objeto de la clase mensajesService
        mensajesService ms = new mensajesService();

        //Valor para guardar la opcion de usuario
        int opcion = 0;

        do {
            //Menu de nuestro programa
            System.out.println("-----------------------");
            System.out.println(" Aplicacion de Mensajes: ");
            System.out.println(" 1. Crear un mensaje ");
            System.out.println(" 2. Listar mensaje ");
            System.out.println(" 3. Editar mensaje ");
            System.out.println(" 4. Eliminar mensaje ");
            System.out.println(" 5. Salir ");
            //Fin del menu

            //Leemos la opcion del usuario
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ms.crearMensaje();
                    break;
                case 2:
                    ms.listarMensajes();
                    break;
                case 3:
                    ms.editarMensaje();
                    break;
                case 4:
                    ms.borrarMensajes();
                    break;
                default:
                    break;
            }

        } while (opcion != 5);

    }//Cierre del metodo
}
