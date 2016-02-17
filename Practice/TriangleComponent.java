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
    private int[] xArray = new int [5];
    private int[] yArray = new int [5];
    private int counter = 0;
    public TriangleComponent()
    {
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        if(this.counter == 1)
        {
            this.drawPoint(this.xArray[this.counter], this.yArray[this.counter], g2);
        }
        if(this.counter == 2)
        {
            this.drawPoint(this.xArray[this.counter], this.yArray[this.counter], g2);
            this.drawPoint(this.xArray[this.counter-1], this.yArray[this.counter-1], g2);
            this.drawLine(this.xArray[this.counter], this.yArray[this.counter], this.xArray[this.counter-1], this.yArray[this.counter-1], g2);
        }
        if(this.counter == 3)
        {
            this.drawPoint(this.xArray[this.counter], this.yArray[this.counter], g2);
            this.drawPoint(this.xArray[this.counter-1], this.yArray[this.counter-1], g2);
            this.drawPoint(this.xArray[this.counter-2], this.yArray[this.counter-2], g2);
            this.drawLine(this.xArray[this.counter], this.yArray[this.counter], this.xArray[this.counter-1], this.yArray[this.counter-1], g2);
            this.drawLine(this.xArray[this.counter], this.yArray[this.counter], this.xArray[this.counter-2], this.yArray[this.counter-2], g2);
            this.drawLine(this.xArray[this.counter-1], this.yArray[this.counter-1], this.xArray[this.counter-2], this.yArray[this.counter-2], g2);
        }
        if(this.counter == 4)
        {
            repaint();
            this.counter = 0;
            for(int i = 0; i < xArray.length; i++)
            {
                xArray[i] = 0;
            }
            for(int i = 0; i < yArray.length; i++)
            {
                yArray[i] = 0;
            }
        }
        
    }
    public void drawPoint(int x, int y , Graphics2D g2)
    {
        g2.draw(new Ellipse2D.Double(x, y, 3,3));
    }
    public void drawLine (int x1, int y1, int x2, int y2, Graphics2D g2)
    {
        g2.draw(new Line2D.Double(x1, y1, x2, y2));
    }
    public void addPos(int x, int y)
    {
        this.counter++;
        this.xArray[this.counter] = x;
        this.yArray[this.counter] = y;
        
    }
 
}