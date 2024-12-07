/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading;

/**
 *
 * @author EF
 */
public class Multithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Creating first thread
        Thread t1 = new Thread1(); 
        t1.start();
        
       
        //Creating second thread
        Thread t2 = new Thread2();
        t2.start();
    }
    
}
