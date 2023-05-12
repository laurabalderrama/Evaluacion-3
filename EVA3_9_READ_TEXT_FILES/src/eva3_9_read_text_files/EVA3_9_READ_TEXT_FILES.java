
package eva3_9_read_text_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.stream.FileImageInputStream;

/**
 *
 * @author Usuario
 */
public class EVA3_9_READ_TEXT_FILES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "c:\\archivos\\prueba.txt";
        try {
            readUsingFiles(ruta);//lee el archivo completo ineficiente para archivos grandes
            readUsingBufferedReader(ruta);// opcion para archivos de texto
            readUsingFileReader(ruta);//combinacion de archivos y buffered rader, ineficiente
            readUsingScanner(ruta);//es una herramienta general para entadas (inputs)
        } catch (IOException ex) {
            Logger.getLogger(EVA3_9_READ_TEXT_FILES.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();//imprimir la excepción 
        }
    }
    public static void readUsingFiles(String ruta) throws IOException{
        System.out.println("lectura de archivos usando files");
        Path path = Paths.get(ruta);
        /*List<String> contenidoArch = Files.readAllLines(path);
        //System.out.println(contenidoArch.toString());
        for (int i = 0; i < contenidoArch.size(); i++) {
            System.out.println(contenidoArch.get(i));
        }*/
        byte [ ] arregloBytes = Files.readAllBytes(path);
        System.out.println(new String(arregloBytes));
    }
    // es la mejor opcion para leer archivos 
    public static void readUsingBufferedReader(String ruta) throws IOException{
        System.out.println("");
        System.out.println("Lectura de archivos uusando Buffered Reader");
        File file = new File(ruta);// la ruta del archivo
        FileInputStream is = new FileInputStream(file);// abre el archivo 
        InputStreamReader isReader = new InputStreamReader(is);// lee el archivo como bytes
        BufferedReader breader = new BufferedReader(isReader);//interpreta los bytes como caracteres 
        String linea;
        while((linea = breader.readLine()) != null){// leer el archivo mientras no llegemos al final del archivo
            System.out.println(linea);   
        }
        breader.close();//cerrara el archivo
    }
    public static void readUsingFileReader(String ruta) throws FileNotFoundException, IOException{
        System.out.println("");
        System.out.println("lectura de archivos usando el File reader");
        File file = new File(ruta);
        FileReader fileReader = new FileReader(file);
        BufferedReader breader = new BufferedReader(fileReader);//interpreta los bytes como caracteres 
        String linea;
        while((linea = breader.readLine()) != null){// leer el archivo mientras no llegemos al final del archivo
            System.out.println(linea);   
        }
        breader.close();//cerrara el archivo
    }
     public static void readUsingScanner(String ruta) throws IOException{
         System.out.println("");
        System.out.println("lectura de archivos usando Scanner");
         Path source = Paths.get(ruta);
         Scanner scanner = new Scanner(source);
         while(scanner.hasNextLine()){
             System.out.println(scanner.nextLine());
         }
         scanner.close();
     }
     
}
