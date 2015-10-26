import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Graphics;

import java.awt.Graphics;

import javax.swing.JComponent;
import java.awt.Color;
import java.awt.GradientPaint;

import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
public class Moon
{
    private int xLeft;
    private int yTop;
    
    
    
    public void draw(Graphics2D g2)
    {
    Ellipse2D.Double Moon = new Ellipse2D.Double(xLeft + 950, yTop + 50, 30, 30);
    
    g2.setPaint(Color.BLUE);
    g2.draw (Moon);
    g2.setPaint(Color.WHITE);
    g2.fill(Moon);
    //creates the sun
    }
}