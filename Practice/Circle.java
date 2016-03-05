import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.awt.geom.Point2D;
/**
 * class Circle which describes a circle
 * 
 * @Connor Chong 
 * @2/23/16
 */
public class Circle extends Shape
{
    private Ellipse2D.Double circle;
    
    public Circle(Point2D.Double center, double radius, Color color)
    {
       super(center, radius, color);     
       circle = new Ellipse2D.Double(center.getX(), center.getY(), radius, radius);
    }


    public boolean isInside(Point2D.Double point)
    {
        circle = new Ellipse2D.Double(super.getCenter().getX(), super.getCenter().getY(), super.getRadius(), super.getRadius());
        return circle.contains(point);
    }
    
    public boolean isOnBorder(Point2D.Double point)
    {
        circle = new Ellipse2D.Double(super.getCenter().getX(), super.getCenter().getY(), super.getRadius(), super.getRadius());
        double compare = super.getRadius() * .95;
        Ellipse2D.Double compareEllipse = new Ellipse2D.Double(super.getCenter().getX(), super.getCenter().getY(), compare, compare);
        return circle.contains(point) && !compareEllipse.contains(point);
    }
    public void draw(Graphics2D g2, boolean filled)
    {
        circle = new Ellipse2D.Double(super.getCenter().getX(), super.getCenter().getY(), super.getRadius(), super.getRadius());
        g2.setColor(super.getColor());
        g2.draw(circle);
        if(filled)
        {
            g2.fill(circle);
        }
    }
    
    

}
