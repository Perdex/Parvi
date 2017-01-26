package brains;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;



public class Bird {

    private static final double size = 10;
    double x, y, vx, vy, dir;//dir as radians CCW from (1, 0)
    
    public Bird(double x, double y, double vx, double vy, double dir){
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.dir = dir;
    }
    
    public void draw(Graphics2D g){
        g.setStroke(new BasicStroke(5));
        g.setColor(Color.GREEN);
        g.drawLine((int)(x - Math.cos(dir) * size), (int)(y - Math.sin(dir) * size),
                (int)(x + Math.cos(dir) * size), (int)(y + Math.sin(dir) * size));
    }
    
    
}
