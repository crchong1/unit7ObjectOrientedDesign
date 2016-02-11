import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Polygon;


public class TriangleComponent extends JComponent
{
    private Polygon triangle;
    public TriangleComponent()
    {
        this.triangle = new Polygon();
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(triangle);
    }
    public void drawTriangle()
    {
        
        
    }
}