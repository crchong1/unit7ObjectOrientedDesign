import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
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
public abstract class Shape
{
    private Point2D.Double point;
    private double radius;
    private Color color;
    public Shape(Point2D.Double point, double radius, Color color)
    {
       this.point = point;
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
        point = new Point2D.Double(x,y);
    }
    public void setRadius(double r)
    {
        this.radius = r;
    }
    public Color getColor()
    {
        return color;
    }
    public abstract boolean isInside(Point2D.Double point);
    public abstract boolean isOnBorder(Point2D.Double point);
    public abstract void draw(Graphics2D g2, boolean filled);
    
    

}
