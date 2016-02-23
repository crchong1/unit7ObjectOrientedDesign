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
    public DrawingEditor()
    {
        this.label = new JLabel("Drawing Editor");
        this.panel.add(this.label);
        
        DrawingPanel canvas  = new DrawingPanel();
        ControlPanel controls = new ControlPanel(canvas);
        
    }

    public static void main(String[] args)
    {
        DrawingEditor editor = new DrawingEditor();
    }
    

}
