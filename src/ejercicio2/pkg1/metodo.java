/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.pkg1;

/**
 *
 * @author dam2
 */
public class metodo implements Runnable{
    
    private String nombre;

    public metodo(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void calculo(){
    
        for (int i = 0; i < 100; i++) {
            
            for (float j = 0; j < 10; j+=0.04) {
                Math.sqrt(j);
                System.out.println(Thread.currentThread().getName());
            }

        }
        
    }

    @Override
    public void run() {
        calculo();
    }
    
}
