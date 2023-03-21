/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import javax.swing.JProgressBar;

/**
 *
 * @author Bruce
 */
public class Progreso extends Thread {
    JProgressBar progreso;
    public  Progreso(JProgressBar progreso){
        super();
        this.progreso=progreso;
    }
    @Override
            public void run(){
                for(int i=1;i<=100;i++){
                    progreso.setValue(i);
                    pause(30);
                }}
                public void pause(int mlseg){
                    try{
                        Thread.sleep(mlseg);
                    }
                
                   catch (Exception e){
                   }
}
            }

