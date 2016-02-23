import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * class ControlPanel which creates a window
 * 
 * @Connor Chong 
 * @2/23/16
 */
public class ControlPanel extends JPanel
{
    private JFrame frame;
    private Button button;
    private Button button2;
    private Button button3;
    private JPanel panel;
    private JLabel label;
    
    public ControlPanel()
    {
        this.frame = new JFrame();
        
        this.button = new Button("Pick Color");
        this.panel.add(this.button);
        
        this.panel = new JPanel();
        //canvas.getColor()
        
        this.button2 = new Button("Add Circle");
        this.panel.add(this.button2);
        
        this.button3 = new Button("Add Square");
        this.panel.add(this.button3);
    }

    

}
