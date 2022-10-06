/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palavras;

import arquivos.FileExtractor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hugor
 */
public class Palavras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("teste");
        
        FileExtractor extractor = new FileExtractor();
        Map<String, List<String>> grafo = null;
        
        try {
            extractor.open("Texto01");
            grafo = extractor.extract();
        } catch ( FileNotFoundException fileException ) {
            System.err.println(fileException.getMessage());
        } catch ( IOException ioException) {
            System.err.println(ioException.getMessage());
        }
        
        try {
            extractor.close();
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
        
        for ( String key : grafo.keySet()) {
            System.out.println("key = " + key);
            System.out.print("values = { ");
            
            for(String value : grafo.get(key)) {
                System.out.print(value + ", ");
            }
            
            System.out.println("}");
        }
        
    } 
    
}
