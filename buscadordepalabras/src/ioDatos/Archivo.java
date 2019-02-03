/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioDatos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MarekLegends
 */
public class Archivo {
    
    public void crear(){
         
       File f = null;
       
       f= new File("texto.txt");
       
       if (!f.exists()) {
           try {
               f.createNewFile();
           } catch (IOException ex) {
               System.out.println("Error al crear el archivo");
           }
       }
          
    }
    
    public void guardar(String textoguardar){
         
       File f = null;
       
       f= new File("textoguardado.txt");
       
       if (!f.exists()) {
           try {
               f.createNewFile();
           } catch (IOException ex) {
               System.out.println("Error al crear el archivo");
           }
       }
       
       FileWriter fichero = null;
       PrintWriter pw =null;
       
         try {
            fichero = new FileWriter(f,true);            
            pw = new PrintWriter(fichero);
            
             for (int i = 0; i < 1; i++)
                pw.println(textoguardar);
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo");
        } finally{
            if (fichero!=null) {
                try {
                    fichero.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el archivo");
                }
            }
               
        }
       
          
    }
    
 
    
    
    
    
}
