package eva3_2_exception_propagation;

/**
 *
 * @author invitado
 */
public class EVA3_2_EXCEPTION_PROPAGATION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inicia main");
        a();
        System.out.println("termina main");
    }
    public static void a() {
        System.out.println("Inicia a");
        b();
        System.out.println("termina a");
    }
    public static void b() {
        System.out.println("Inicia b");
        c();
        System.out.println("termina b");
    }
    public static void c() {
        System.out.println("Inicia c");
        int x = 5, y = 0;
        int resu = x / y;
        System.out.println("Rsultado: " + resu);
        System.out.println("termina c");
    }
}
