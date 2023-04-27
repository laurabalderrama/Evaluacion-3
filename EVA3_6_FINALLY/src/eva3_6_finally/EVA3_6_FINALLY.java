/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_6_finally;

/**
 *
 * @author Usuario
 */
public class EVA3_6_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5, y = 1;
        try{
            int resu = x/y;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Siempre me ejecuto ");
        }
        System.out.println("Fin del programa");
    }
    
}
