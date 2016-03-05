import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Graphics2D;
/**
 * class Circle which describes a circle
 * 
 * @Connor Chong 
 * @2/23/16
 */
public class Square extends Shape
{
    private Rectangle2D.Double square;
    
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
        square = new Rectangle2D.Double(center.getX(), center.getY(), radius, radius);
    }

    public boolean isInside(Point2D.Double point)
    {
        square = new Rectangle2D.Double(super.getCenter().getX(), super.getCenter().getY(), super.getRadius(), super.getRadius());
        return square.contains(point);
    }
    
    public boolean isOnBorder(Point2D.Double point)
    {
        square = new Rectangle2D.Double(super.getCenter().getX(), super.getCenter().getY(), super.getRadius(), super.getRadius());
        double compRadius = super.getRadius() * .95;
        Rectangle2D.Double comparator = new Rectangle2D.Double(super.getCenter().getX(), super.getCenter().getY(), compRadius, compRadius);
        return square.contains(point) && !comparator.contains(point);
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        square = new Rectangle2D.Double(super.getCenter().getX(), super.getCenter().getY(), super.getRadius(), super.getRadius());
        g2.draw(square);
        g2.setColor(super.getColor());
        if (filled)
        {
            g2.fill(square);
        }
    }
}

