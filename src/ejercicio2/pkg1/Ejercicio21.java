/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.pkg1;

/**
 *
 * @author dam2
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
        for (int i = 0; i < 500; i++) {
           
            metodo objeto = new metodo("proceso " + i);
            Thread hilo = new Thread(objeto);
            hilo.start();
            
            
        }
        
        
    }
    
}
