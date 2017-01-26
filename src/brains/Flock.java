package brains;

import java.awt.Graphics2D;
import java.util.ArrayList;



public class Flock {

    ArrayList<Bird> birds = new ArrayList<>();
    
    public Flock(int n){
        
        int spread = 500;
        for(int i = 0; i < n; i++){
            birds.add(new Bird(Math.random() * spread, Math.random() * spread, 0, 0, Math.random() * 6));
        }
    }
    
    public void draw(Graphics2D g){
        for(Bird b: birds)
            b.draw(g);
    }
}
