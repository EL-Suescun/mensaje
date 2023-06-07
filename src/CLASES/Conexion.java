package CLASES;

import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
   //crear la variable de conexion
    static Connection con=null;
    
    //Crear las variables para la cadena de conexion    
    private String url="jdbc:sqlserver://localhost:1433;database=MensajesApp;integratedSecurity=true;";   
    private static String SQL = "";
    
    //Método para establecer la conexion
    public Connection getConexion(){
        try{
            con=DriverManager.getConnection(url);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: "+ex.getMessage());
        }
        return con;
    }//Cierre del método 

    //Metodo para guardar un mensaje en la base de datos
    public  void crearMensaje(String Mensaje, String Nombre) {
       try{
            SQL="INSERT INTO Mensaje VALUES(?,?)";
            //Crear la sentencia
            PreparedStatement ps=con.prepareStatement(SQL);
            ps.setString(1, Mensaje);
            ps.setString( 2,Nombre);
            
            //Ejecutar la instruccion SQL
            ps.executeUpdate();
            System.out.println("Mensaje guardado");
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

        
    }//Cierre del metodo 

    //Metodo para ver las tuplas de la base de datos
    public  void leerMensajes() {
        int id = 0;
        String Mensaje = "";
        String Nombre = "";
        try{
            SQL="SELECT * FROM Mensaje";
            //Crear la sentencia
            PreparedStatement ps = con.prepareCall(SQL);
            //Crear el resultset
            ResultSet rs = ps.executeQuery();
            //Traer los datos de la bd  alas cajas de texto
            while(rs.next()) {
             id=rs.getInt("id_mensaje");
             Mensaje=rs.getString("mensaje");
             Nombre=rs.getString("autor");
             
                System.out.println("--------------\nEl Id del Mensaje: "+id+"\n"+
                        "Mensaje: "+Mensaje+"\nAutor: "+Nombre);
         }
            rs.close();
            ps.close();//Cerrar la sentencia
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: "+ex.getMessage());
        }
    }//Cierre del metodo

    //Metodo para eliminar los mensajes
    public  void borrarMensaje(int id_mensaje) {

    }//Cierre del metodo

    //Metodo para actualizar la base de datos
    public  void actualizarMensaje(int id_mensaje) {

    }//Cierre del metodo

   
}
