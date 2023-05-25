/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_12_append_text;

import java.io.BufferedWriter;
import java.io.File;
import static java.io.FileDescriptor.out;
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
 *
 * @author Usuario
 */
public class EVA3_12_APPEND_TEXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic
            String ruta = "c:\\archivos\\"; 
            writeUsingBufferedWriter(ruta, "prueba de APPEND");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_12_APPEND_TEXT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
       File file = new File (ruta + "archivoBufferedWriter.txt");
       FileWriter fileWiter = new FileWriter (file, true);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < 6; i++) {
            bufWriter.write((i+1) + ". " + datos);
            bufWriter.write("\n");
        }
        bufWriter.close();
        fileWriter.close();
    }
    
}
