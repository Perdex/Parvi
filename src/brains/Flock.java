package brains;

import java.awt.Graphics2D;
import java.util.ArrayList;



public class Flock {

    //Onko fiksumpi vetää vaan matriisiin eikä olioihin tiedot, olis helpompi käsitellä matemaattisesti
    //Rinnakkaisuutta ei oikeen kuitenkaan saada et se ei varsinaisesti nopeuta prosessointia
    ArrayList<Bird> birds = new ArrayList<>();
    
    public Flock(int n){
        
        int spread = 600;
        for(int i = 0; i < n; i++){
            birds.add(new Bird(Math.random() * spread, Math.random() * spread, 100 * Math.random(), Math.random() * 6));
        }
    }
    
    public void runStep(double dt){
        for(Bird b: birds)
            b.move(dt);
    }
    
    public void draw(Graphics2D g){
        for(Bird b: birds)
            b.draw(g);
    }
    
}
