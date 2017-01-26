package parvi;

import brains.Flock;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Parvi extends JPanel implements Runnable{

    private static Flock flock;
    public static void main(String[] args){
        
        JPanel p = new Parvi();
        p.setPreferredSize(new Dimension(800, 600));
        
        JFrame f = new JFrame("They fly (soon)!");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(p);
        f.pack();
        
        
        //position frame to center of screen
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        f.setBounds((int)(screen.getWidth() / 2 - f.getWidth() / 2), 
            (int)(screen.getHeight() / 2 - f.getHeight() / 2), f.getWidth(), f.getHeight());
        f.setVisible(true);
        
        f.setVisible(true);
        
        flock = new Flock(20);
    }
    
    @Override
    public void run(){
        double lastTime = getTime();
        while(true){
            
            double newTime = getTime();
            flock.runStep(newTime - lastTime);
            lastTime = newTime;
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace(System.err);
            }
        }
    }
    
    private double getTime(){
        return (double)System.nanoTime() / 1e9;
    }
    
    @Override
    public void paint(Graphics g2){
        Graphics2D g = (Graphics2D)g2;
        
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        flock.draw(g);
        
    }
    
    
}
