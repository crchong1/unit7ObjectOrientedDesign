import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
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
    private JButton button;
    private JButton button2;
    private JButton button3;
    private DrawingPanel canvas;
    public ControlPanel(DrawingPanel canvas)
    {        
        this.canvas = canvas;
        this.button = new JButton("Pick Color");
        this.add(this.button);
        
        this.button2 = new JButton("Add Circle");
        this.add(this.button2);
        
        this.button3 = new JButton("Add Square");
        this.add(this.button3);
        
        
        ClickListener listener = new ClickListener();
        this.button.addActionListener(listener); //you need this to register the listener
        this.button2.addActionListener(listener); //you need this to register the listener
        this.button3.addActionListener(listener); //you need this to register the listener
    }
    

    public class ClickListener implements ActionListener
    {
    
        public void actionPerformed(ActionEvent event)
        {
            if(button == event.getSource())
            {
                canvas.pickColor();
            }
            else if (button2 == event.getSource())
            {
                canvas.addCircle();
            }
            else if (button3 == event.getSource())
            {
                canvas.addSquare();
            }
            
        }
    }

}
