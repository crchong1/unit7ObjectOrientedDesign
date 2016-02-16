import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class TriangleComponent extends JComponent
{
    private Polygon triangle;
    private int[] xArray = new int [3];
    private int[] yArray = new int [3];
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
    public void drawPoint(int x, int y , Graphics2D g2)
    {
        g2.draw(new Ellipse2D.Double(x, y, 3,3));
    }
    public void drawLine (int x1, int x2, int y1, int y2, Graphics2D g2)
    {
        g2.draw(new Line2D.Double(x1, x2, y1, y2));
    }
    public void addPos(int x, int y)
    {
        int[][] posArray = new int[4][2];
        for(int i = 0; i< posArray.length; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                posArray[i][j] = posArray[x][y];
            }
        }
        
    }
 
}