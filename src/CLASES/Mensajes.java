
package CLASES;


public class Mensajes {
    //Creamos los atributos que vamos a manejar
    int id_mensaje;
    String mensaje;
    String autor_mensaje;
    
    //Constructor que nos va a servir por defecto
    public Mensajes() {
    }
    //Constructor para mandar los mensajes a la base de datos

    public Mensajes(String mensaje, String autor_mensaje, String fecha_mensaje) {
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
    }
    
    
    
    //Creamos los metodos setters and getters de los atributos    
    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor_mensaje() {
        return autor_mensaje;
    }

    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }
    //Fin de los metodos setters and getters
    
    
}
