
package main;

import media.Radio;
import media.Television;


public class Main {

   
    public static void main(String[] args) {
       
     Television lg = new Television();
    
     lg.setTurnOn(true);
     lg.setCurentProgram(4);
     lg.setVolume(50);
        
        System.out.println("Trenutni program je : "+ lg.getCurrentProgram());
        System.out.println("Jacina zvuka je : " + lg.getVolume());
       
     Radio myRadio = new Radio();
     
     myRadio.setFmFrequency(703);
     myRadio.setAmFrequency(109);
     myRadio.setBand('F');
     
     myRadio.info();
     
     Radio newRadio = new Radio (100.3, 700, 'A');
     newRadio.info();
     }   
        
    
    
}
