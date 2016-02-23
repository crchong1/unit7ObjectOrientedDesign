import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.awt.geom.Point2D;
/**
 * class Shape which describes a Shape
 * 
 * @Connor Chong 
 * @2/23/16
 */
public class Shape
{
    private Point2D.Double point;
    private double radius;
    private Color color;
    
    public Shape(Point2D.Double center, double radius, Color color)
    {
       this.point = center;
       this.radius = radius;
       this.color = color;
    }

    public Point2D.Double getCenter()
    {
        return this.point;
    }
    public double getRadius()
    {
        return this.radius;
    }
    
    public void move(double x, double y)
    {
    }
    public void setRadius(double r)
    {
        this.radius = r;
    }
    public boolean isInside(Point2D.Double point)
    {
        return false;
    }
    public boolean isOnBorder(Point2D.Double point)
    {
        return false;
    }
    public void draw(Graphics2D g2, boolean filled)
    {
        
    }
    
    

}
