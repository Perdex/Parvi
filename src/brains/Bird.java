package brains;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;



public class Bird {

    private static final double size = 10;
    private double x, y, v, dir;//dir as radians CCW from (1, 0)
    
    public Bird(double x, double y, double v, double dir){
        this.x = x;
        this.y = y;
        this.v = v;
        this.dir = dir;
    }
    
    public void move(double dt){
        x += v * Math.cos(dir) * dt;
        y += v * Math.sin(dir) * dt;
    }
    
    public void draw(Graphics2D g){
        g.setStroke(new BasicStroke(6));
        g.setColor(Color.green);
        g.drawLine((int)(x - Math.cos(dir) * size), (int)(y - Math.sin(dir) * size),
                (int)(x + Math.cos(dir) * size), (int)(y + Math.sin(dir) * size));
        
        g.setStroke(new BasicStroke(1));
        g.fillOval((int)(x - Math.cos(dir) * (size + 3)) - 3, (int)(y - Math.sin(dir) * (size + 3)) - 3, 6, 6);
        
        g.setColor(Color.white);
        
        g.fillOval((int)(x + Math.cos(dir) * (size + 3)) - 3, (int)(y + Math.sin(dir) * (size + 3)) - 3, 6, 6);
    }
    
    
}
