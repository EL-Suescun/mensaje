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
        System.out.println("--------------");
        System.out.println("LISTA DE MENSAJES");
        Conexion con = new Conexion();
        con.getConexion();
        con.leerMensajes();
    }//Cierre del metodo

    //Metodo para borrar un mensaje de la base de datos
    public static void borrarMensajes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el codigo del mensaje: ");
        int codigo = sc.nextInt();
        Conexion con = new Conexion();
        con.getConexion();
        con.borrarMensaje(codigo);
    }//Cierre del metodo

    //Metodo para actualizar un mensaje
    public static void editarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el codigo del mensaje: ");
        int codigo = sc.nextInt();
        System.out.println("Ingrese el nuevo mensaje: ");
        String Mensaje = sc.nextLine();
        System.out.println("Ingrese el nuevo autor: ");
        String Autor = sc.nextLine();
        Conexion con = new Conexion();
        con.getConexion();
        con.actualizarMensaje(codigo, Mensaje, Autor);
    }//Cierre del metodo

}
