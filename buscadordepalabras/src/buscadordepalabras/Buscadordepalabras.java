/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadordepalabras;

import ioDatos.Archivo;
import ioDatos.Buscador;

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
        b.palabras();
    }
    
}
