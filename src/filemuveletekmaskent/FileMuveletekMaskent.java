/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemuveletekmaskent;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 *
 * @author Thomas
 */
public class FileMuveletekMaskent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> sorok = null;
        try{
            sorok = Files.readAllLines(Paths.get("textfile.txt"), Charset.forName("utf-8"));
        }catch(IOException exc){
            System.out.println(exc.getMessage());
        }
        
        System.out.println(sorok);
        
        sorok.add("Jóízû félárú sütõtök");
        try {
            Files.write(Paths.get("textutf8.txt"), sorok, Charset.forName("utf-8"));
            Files.write(Paths.get("textw1250.txt"), sorok, Charset.defaultCharset(),StandardOpenOption.APPEND);
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
        
    }
    
}
