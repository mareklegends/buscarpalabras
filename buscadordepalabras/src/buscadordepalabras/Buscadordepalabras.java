
package buscadordepalabras;

import ioDatos.Archivo;
import ioDatos.Buscador;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Buscadordepalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Archivo a = new Archivo();
        a.crear();
        
        Buscador b = new Buscador();
        String[] vPalabras = new String[10];
        Scanner leer=null;
        for (int i = 0; i < vPalabras.length; i++) {
            if (vPalabras[i]!=null) {
                vPalabras[i]=leer.nextLine(); 
            }
           
        }
       b.palabras(vPalabras);
       
    }
    
}
