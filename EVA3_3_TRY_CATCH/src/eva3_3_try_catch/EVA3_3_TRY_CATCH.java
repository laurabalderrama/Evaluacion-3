
package eva3_3_try_catch;

/**
 *
 * @author invitado
 */
public class EVA3_3_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5, y = 0;
        try{ 
            // seccion de codigo que potencialmente genera una excepcion
        int resu = x/y;
        System.out.println("resultado = " + resu);
        }catch(ArithmeticException e){ // se genera un objeto exception llamado "e" de tipo ArithmeticException
            System.out.println("Se produjo un error " + e.getMessage());
        }
        System.out.println("Programa terminado");
    }
    
}
