import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Polygon;

public class Sun
{
    private int xLeft;
    private int yTop;
    public void draw(Graphics2D g2)
    {
    Ellipse2D.Double Sun = new Ellipse2D.Double(xLeft + 50, yTop + 50, 30, 30);
    
    
    g2.draw (Sun);
    g2.setPaint(Color.YELLOW);
    g2.fill(Sun);
    //creates the sun
    }
}