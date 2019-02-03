/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioDatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MarekLlegends
 */
public class Buscador {
    
   private ArrayList<Archivo> vArchivo; 
   
   public void palabras(String[] vPalabras){      
      
        File f = new File("textoguardado.txt");
        Scanner leer=null;
        
        String linea, resultado;
        String palabra="";
        
        if (f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error al crear el fichero");
            }
        }
        try {
            leer = new Scanner(f);
        } catch (FileNotFoundException ex) {
            System.out.println("Error al intentar leer el fichero");
        }
        int contador=0;
        
        Archivo a = new Archivo();
        
        while(leer.hasNext()){
            linea=leer.nextLine();  
            
            for (int i = 0; i < vPalabras.length; i++) {
                   if (vPalabras[i]!=null) {
                  if (linea.equalsIgnoreCase(vPalabras[i])) {
                        contador++;
                        palabra = vPalabras[i];
                      }
          }
            }
        resultado = ""+palabra+" "+contador+"";    
        a.guardar(resultado);
        contador=0;
        }
       
       
       
     
   
    
   }
  
    
}
