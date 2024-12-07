/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;


public class Thread2 extends Thread{
        @Override
    public void run(){
          // sound files
          FilePlayer re_ = new FilePlayer();
          FilePlayer fa_ = new FilePlayer();
          FilePlayer la_ = new FilePlayer();
          FilePlayer do_octave = new FilePlayer();
          
        
        for(int i =1001; i <=2000; i++)
        {
            re_wav.play("C:\\Sounds\\re.wav");
            fa_wav.play("C:\\Sounds\\fa.wav");
            la_wav.play("C:\\Sounds\\la.wav");
            do_octave.play("C:\\do-octave.wav");
            System.out.println("second play... " + i );
        }
    }
    
}
