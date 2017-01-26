package brains;

import java.awt.Graphics2D;
import java.util.ArrayList;



public class Flock {

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
