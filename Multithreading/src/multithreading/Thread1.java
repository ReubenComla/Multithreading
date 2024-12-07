/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;


public class Thread1 extends Thread {
    @Override
    public void run(){
          FilePlayer do_ = new FilePlayer();
          FilePlayer mi_ = new FilePlayer();
          FilePlayer sols = new FilePlayer();
          FilePlayer sis = new FilePlayer();
          FilePlayer do_octave = new FilePlayer();
          
        
        
        for(int i =0; i <=500; i++)
        {
            do_.play("C:\\Sounds\\do.wav");
            mi_.play("C:\\Sounds\\mi.wav");
            sols.play("C:\\Sounds\\sol.wav");
            sis.play("C:\\Sounds\\si.wav");
            do_octave.play("C:\\Sounds\\do-octave.wav");
            System.out.println("first play: " + i );
        }
    }
    
}
