/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

//En esta clase se crea el menu que se conecta con la clase MensajesDAO
import java.util.Scanner;

public class mensajesService {

    //Metodo para ingresar el mensaje
    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe tu mensaje: ");
        String Mensaje = sc.nextLine();

        System.out.println("Tu nombre: ");
        String Nombre = sc.nextLine();
        Conexion con = new Conexion();
        con.getConexion();
        con.crearMensaje(Mensaje, Nombre);
    }//Cierre del metodo 

    //Metodo para listar los mensajes que esten en la base de datos
    public static void listarMensajes() {

    }//Cierre del metodo

    //Metodo para borrar un mensaje de la base de datos
    public static void borrarMensajes() {

    }//Cierre del metodo

    //Metodo para actualizar un mensaje
    public static void editarMensaje() {

    }//Cierre del metodo

}
