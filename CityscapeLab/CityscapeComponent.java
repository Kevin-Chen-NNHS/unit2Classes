import java.awt.Graphics;

import javax.swing.JComponent;
import java.awt.Color;
import java.awt.GradientPaint;

import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    
    
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        

            Color aqua = new Color(30,241,255);
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            
            int w = getWidth();
            int h = getHeight();
            Color color1 = Color.WHITE ;
            Color color2 = aqua ;
            GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, w, h);
            
            
        
        
        
        
        Graphics2D g2 = (Graphics2D) g;
        
        Castle cas1 = new Castle(0,0);
        
        
        int x = getWidth() - 100;
        int y = getWidth() - 100;
        // invoke the draw method on each object in your Cityscape
        // ...
        Castle cas2 = new Castle (x,y);
        
        
        
        cas1.draw(g2);
        cas2.draw(g2);
        
        Color color3 = Color.BLACK;
            GradientPaint shadow = new GradientPaint(0, 0, color3, 0, h, color1);
            g2d.setPaint(shadow);
            g2d.fillRect(500, 600, 100 ,200);
    

    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
