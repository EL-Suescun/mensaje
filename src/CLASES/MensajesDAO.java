package CLASES;
//En esta clase se crean los metodos para hacer un CRUD, crear leer actualizar y borrar

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MensajesDAO {

    //Metodo para guardar un mensaje en la base de datos
    public static void crearMensaje(Mensajes mensaje) {
        Conexion con = new Conexion();

        try (Connection conexion = con.getConexion();) {            
            try {
                //Escribimos el query para insertar a la tabla habitaciones 
                String SQL = "INSERT INTO Mensaje VALUES(?,?)";
                //Crear la sentencia
                //Statement stmt=con.createStatement();
                PreparedStatement ps = conexion.prepareStatement(SQL);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());

                //Ejecutar la instruccion SQL
                ps.executeUpdate();
                System.out.println("Mensaje creado");
                ps.close();
            } catch (SQLException e) {
                System.out.println(e);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }//Cierre del metodo 

    //Metodo para ver las tuplas de la base de datos
    public static void leerMensajes() {

    }//Cierre del metodo

    //Metodo para eliminar los mensajes
    public static void borrarMensaje(int id_mensaje) {

    }//Cierre del metodo

    //Metodo para actualizar la base de datos
    public static void actualizarMensaje(int id_mensaje) {

    }//Cierre del metodo

}
