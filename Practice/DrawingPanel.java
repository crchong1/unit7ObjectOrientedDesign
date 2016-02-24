import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * class DrawingPanel which creates a window
 * 
 * @Connor Chong 
 * @2/23/16
 */
public class DrawingPanel
{
    private Color color;
    
    public DrawingPanel()
    {
        
        class MouseMotionListener extends EventListener
        {
            public void mouseDragged(MouseEvent e)
            {
            }
            
        }
        class MousePressListener implements MouseListener
        {
            public void mousePressed(MouseEvent event)
            {
                DrawingEditor.addPos(event.getX(), event.getY());
                repaint();
            }

            public void mouseReleased(MouseEvent event) {}
            public void mouseClicked(MouseEvent event) {}
            public void mouseEntered(MouseEvent event) {}
            public void mouseExited(MouseEvent event) {}
        }       
    }
    
    public Color getColor()
    {
        return this.color;
    }
    //public Dimension getPreferredSize()
    {
        
    }
    public void pickColor()
    {
        
    }
    public void addCircle()
    {
        
    }
    
    public void addSquare()
    {
        
    }
    public void paintComponent(Graphics g)
    {
        
    }
}
