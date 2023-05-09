
package eva3_8_custom_exceptions;

/**
 *
 * @author Usuario
 */
public class EVA3_8_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona perso =new Persona();
        try{
        perso.setEdad(-1);
        }catch(DatoIncorrectoCheckedEx e){
            System.out.println(e.getMessage());
        }
        perso.setApellido("Kenia");
        perso.setNombre("OS");
        
    }
    
}
class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) throws DatoIncorrectoCheckedEx {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
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

    public void setEdad(int edad) throws DatoIncorrectoCheckedEx {
        if(edad < 0)
            throw new DatoIncorrectoCheckedEx();
        this.edad = edad;
    }
    
}

class DatoIncorrectoException extends RuntimeException{

    public DatoIncorrectoException() {
        super("Dato incorrecto! El valor introducido no puede ser la edad");
    }
    
}

class DatoIncorrectoCheckedEx extends Exception{
public DatoIncorrectoCheckedEx() {
        super("Dato incorrecto! El valor introducido no puede ser la edad");
    }
}