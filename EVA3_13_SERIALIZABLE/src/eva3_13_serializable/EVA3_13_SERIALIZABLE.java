
package eva3_13_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class EVA3_13_SERIALIZABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String ruta = "C:\\Archivos\\archivosObjetos.per";
            Persona perso = new Persona("Pedro", "De las Nieves", 67);
            //Guardar el objeto en un archivo
            guardarObj(perso, ruta);
            //Leer objeto desde un archivo
            Persona resu = LeerObj(ruta);
            System.out.println("Nombre: " + resu.getNombre());
            System.out.println("Apellido: " + resu.getApellido());
            System.out.println("Edad: " + resu.getEdad());
        } catch (IOException ex) {
            Logger.getLogger(EVA3_13_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_13_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void guardarObj(Persona perso, String ruta) throws IOException{
        FileOutputStream fiOuSt = new FileOutputStream(ruta);
        ObjectOutputStream objOutSt = new ObjectOutputStream(fiOuSt);
        objOutSt.writeObject(perso);
        objOutSt.close();
    }
    public static Persona LeerObj(String ruta) throws IOException, ClassNotFoundException{
        Persona perso = null;
        FileInputStream fiInSt = new FileInputStream(ruta);
        ObjectInputStream ObjIStream = new ObjectInputStream(fiInSt);
        perso = (Persona)ObjIStream.readObject();
        return perso;
    }
}
class Persona implements Serializable{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = -1;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}