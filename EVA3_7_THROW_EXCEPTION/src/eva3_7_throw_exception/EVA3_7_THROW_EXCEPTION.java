package eva3_7_throw_exception;

import java.util.Scanner;

/**
 * @author Usuario
 */
public class EVA3_7_THROW_EXCEPTION {

    public static void main(String[] args){
        
        
        do{
            try {
                Prueba obj = new Prueba();
                Scanner scan = new Scanner(System.in);

                System.out.print("Ingresa un numero entero positivo: ");
                int valor = scan.nextInt();
                obj.setValor(valor);
                
                System.out.println("\nGRACIAS :)");
                break;

            } catch (Exception e) {//Exception captura tooodas las excepciones, entonces
                //al usarlo sera muy dificil detectar que tipo de excepcion esta sucediendo
                System.out.println(e.getMessage());
            }
        }while(true);
    }
    
}
class Prueba{
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) throws Exception {
        if(valor < 0)
                //EXCEPTION ES DEL TIPO "CHECKED EXCEPTION"
            //TIENE QUE SER ATENDIDA EN EL MOMENTO
            throw new Exception("El valor " + valor +" es invalido. Debe ser mayor a cero.");
        this.valor = valor;
    }
    
    
}