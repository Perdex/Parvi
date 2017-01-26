package parvi;

import brains.Flock;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Parvi extends JPanel{

    private static Flock flock;
    public static void main(String[] args){
        JFrame f = new JFrame("They fly (soon)!");
        
        JPanel p = new Parvi();
        p.setPreferredSize(new Dimension(800, 600));
        
        f.add(p);
        f.pack();
        f.setVisible(true);
        
        flock = new Flock(20);
    }
    
    @Override
    public void paint(Graphics g2){
        Graphics2D g = (Graphics2D)g2;
        
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        flock.draw(g);
        
    }
    
    
}
