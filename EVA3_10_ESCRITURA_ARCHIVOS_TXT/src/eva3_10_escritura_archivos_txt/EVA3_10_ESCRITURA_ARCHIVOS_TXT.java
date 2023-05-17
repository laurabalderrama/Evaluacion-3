package eva3_10_escritura_archivos_txt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Usuario
 */
public class EVA3_10_ESCRITURA_ARCHIVOS_TXT {

    public static void main(String[] args) {
        String ruta = "c:\\archivos\\";
        try {
            writeUsingFiles(ruta, "Prueba de datos de escritura usando CLASE FILES");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRITURA_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            writeUsingFileWriter(ruta, "Prueba de archivo con clase File writer");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRITURA_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            writeUsingBufferedWriter(ruta, "Un hombre no puede entrar dos veces al mismo rio, porque ni el ni el rio serán el mismo.");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRITURA_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void writeUsingFiles(String ruta, String datos) throws IOException{
        //Si el archivo no existe, lo crea
        //Si el archivo existe, lo sobreescribe
        Path path = Paths.get(ruta + "archivoFiles.txt");
        Files.write(path, datos.getBytes());
    }
    
    public static void writeUsingFileWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta + "ARCHIVALDO.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(datos);
        fileWriter.close();
    }
    
    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
        Path path = Paths.get(ruta + "archivoBufferedWriter.txt");
        OutputStream out = Files.newOutputStream(path);
        OutputStreamWriter osWriter = new OutputStreamWriter(out);
        BufferedWriter bufWriter = new BufferedWriter(osWriter);
        for (int i = 0; i < 2; i++) {
            bufWriter.write((i+1) + ". " + datos);
            bufWriter.write("\n\n");
        }
        bufWriter.close();
        osWriter.close();
    }
}