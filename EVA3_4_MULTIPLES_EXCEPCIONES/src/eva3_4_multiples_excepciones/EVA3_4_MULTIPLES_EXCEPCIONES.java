package eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_4_MULTIPLES_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y;
        try{
            Scanner input = new Scanner (System.in);
            System.out.println("Introduce el valor de x (numero entero): ");
            x = input.nextInt();
            System.out.println("Introduce el valor de y (numero entero): ");
            y = input.nextInt();
            int resu = x/y;
            System.out.println("Resultado de " + x + "/" + y + " : " + resu);
        }catch(InputMismatchException e){
            System.out.println("Captura en formato incorrecto, no se puede convertir a número ");
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre cero ");
        }
        System.out.println("Programa terminado exitosamente ");
    }
    
}
