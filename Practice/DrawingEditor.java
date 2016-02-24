import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.applet.Applet;


/**
 * class DrawingEditor which creates a window
 * 
 * @Connor Chong 
 * @2/23/16
 */
public class DrawingEditor extends JFrame
{
    private JLabel label;
    private int WINDOW_HEIGHT = 800;
    private int WINDOW_LENGTH = 600;
    public DrawingEditor()
    {    
        super();
                
        DrawingPanel canvas  = new DrawingPanel();
        ControlPanel controls = new ControlPanel(canvas);
        this.setTitle("DrawingEditor");
        
    }

    public static void main(String[] args)
    {
        DrawingEditor editor = new DrawingEditor();
    }
    

}
