import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Polygon;

public class Castle
{
    private int xLeft;
    private int yTop;
    
    
    public Castle(int x, int y)
    {


    }
//public abstract void drawPolygon(int [63,46,95,63],int [23,67,246,23],int 3)
//Triangle time

    
//public void Polygon (arrayx, arrayy, 3)
//{
    
  //  int[] arrayx;
  //  int[] arrayy;
    
  //  arrayx = new int[3];
  // arrayy = new int[3];
  //  arrayx[0] = 34;
  //  arrayx[1] = 66;
  //  arrayx[2] = 46;
   // arrayy[0] = 26;
   // arrayy[1] = 73;
   // arrayy[2] = 23;
    
//}


    

public void draw(Graphics2D g2)
    {
    
    g2.setPaint(Color.black);
    
    
    int shiftx = 0;
    int yay = 5;
    int shifty = 0;
    int say = 60;
    
    
    
    
    
    
    Rectangle tower = new Rectangle (xLeft + 200 + shiftx, yTop + 200 + shifty ,100 ,600);
    g2.draw (tower);
    g2.setPaint(Color.GRAY);
    g2.fill(tower);
    g2.setPaint(Color.WHITE);
    while (say > 0)
    {    
        
        
        while (yay > 0)
        {
        
            shiftx = shiftx + 20;
            yay = yay - 1;
            Rectangle brick = new Rectangle (xLeft + 175 + shiftx, yTop + 200 + shifty ,20 ,10);
            g2.draw (brick);
            
        }
        
        shifty = shifty + 10;
        say = say - 1;
        yay = 5;
        if ( (say & 1) == 0 )
        {
            shiftx = 0;
        }
        else
        {
            shiftx = 10;
        }
    }
    
    
    Rectangle tower2 = new Rectangle (xLeft + 300, yTop + 400, 500, 400);
    g2.setPaint(Color.BLACK);
    g2.draw (tower2);
    g2.setPaint(Color.GRAY);
    g2.fill(tower2);
    
    Rectangle tower3 = new Rectangle (xLeft + 500, yTop + 600, 100, 200);
    g2.setPaint(Color.BLACK);
    g2.draw (tower3);
    g2.setPaint(Color.WHITE);
    g2.fill(tower3);
    
    Rectangle tower4 = new Rectangle (xLeft + 800 + shiftx, yTop + 200 ,100 ,600);
    g2.draw (tower4);
    g2.setPaint(Color.GRAY);
    g2.fill(tower4);
    g2.setPaint(Color.WHITE);
    
    
    shiftx = 0;
    yay = 5;
    shifty = 0;
    say = 60;
    
    while (say > 0)
    {    
        
        
        while (yay > 0)
        {
        
            shiftx = shiftx + 20;
            yay = yay - 1;
            Rectangle brick2 = new Rectangle (xLeft + 775 + shiftx, yTop + 200 + shifty ,20 ,10);
            g2.draw (brick2);
            
        }
        
        shifty = shifty + 10;
        say = say - 1;
        yay = 5;
        if ( (say & 1) == 0 )
        {
            shiftx = 0;
        }
        else
        {
            shiftx = 10;
        }
    }
    
    
    
    Ellipse2D.Double Sun
    = new Ellipse2D.Double(xLeft + 50, yTop + 50, 30, 30);
    
    
    g2.draw (Sun);
    g2.setPaint(Color.YELLOW);
    g2.fill(Sun);
    
    
        
        
   }
}

