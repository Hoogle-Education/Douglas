/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author hugor
 */
public class FileExtractor {
    
    private BufferedReader reader;
    
    public void open(String filename) throws FileNotFoundException {
        File file = new File("");
        // C:\Aulas\alunos\Java\Douglas\Palavras
        String basepath = file.getAbsolutePath() + "\\" + filename + ".txt";
        System.out.println(basepath);
        reader = new BufferedReader(new FileReader(basepath));
    }
    
    public Map<String, List<String>> extract () throws IOException {
        // ['coisa'] : { 'muito', 'de', 'algo' }
        Map< String, List<String> > grafo = new HashMap<>();
        boolean titulo = false;
        String origin, destination = null;
       
        while( reader.ready() ) {
            String line = reader.readLine();
            System.out.println(line);
            if(titulo == false && line.equals("")) titulo = true;
            
            if(titulo != true) continue;
            
            String[] words = line.split(" ");
            int size = words.length - 1; 
            
            for(int i = 0; i < size; i++) {
                origin = words[i].toLowerCase();
                
                if(destination != null) 
                    createConnection(grafo, destination, origin);
                
                destination = words[i+1].toLowerCase();
                
                System.out.println("destination = " + destination + " || origin = " + origin);
                
                createConnection(grafo, origin, destination);
            }
            
        }
        
        return grafo;
    }
    
    public void close() throws IOException {
        reader.close();
    }
    
    public void createConnection(Map< String, List<String> > grafo, String origin, String destination) {
        System.out.println("Criando conexão chave = " + origin + " valor = " + destination);
        if(grafo.containsKey(origin)) {
            List<String> values = grafo.get(origin);
            if(!values.contains(destination)) values.add(destination);
        } else {
            List<String> values = new ArrayList<>();
            values.add(destination);
            grafo.put(origin, values);
        }
    }
}
