import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
/**
 * class ControlPanel which creates a window
 * 
 * @Connor Chong 
 * @2/23/16
 */
public class ControlPanel extends JPanel
{
    private JButton colorButton;
    private JButton circleButton;
    private JButton squareButton;
    private Color newColor;
    private JPanel squareColor;
    private DrawingPanel canvas;
    public ControlPanel(DrawingPanel canvas)
    {   

        
        this.colorButton = new JButton("Pick Color");
        this.add(this.colorButton);
        
        newColor = canvas.getColor();
        
        this.circleButton = new JButton("Add Circle");
        this.add(this.circleButton);
        
        this.squareButton = new JButton("Add Square");
        this.add(this.squareButton);
        
        squareColor = new JPanel();
        newColor = canvas.getColor();
        squareColor.setBackground(newColor);
        squareColor.setPreferredSize(new Dimension(10, 10));
        this.add(squareColor);
        
        ClickListener listener = new ClickListener();
        this.colorButton.addActionListener(listener); 
        this.circleButton.addActionListener(listener); //you need this to register the listener
        this.squareButton.addActionListener(listener); 
        this.canvas = canvas;
    }
    

    public class ClickListener implements ActionListener
    {
    
        public void actionPerformed(ActionEvent event)
        {
            if(event.getActionCommand().equals("Pick Color"))
            {
                canvas.pickColor();
                System.out.println("Select Color");
                newColor = canvas.getColor();
                squareColor.setBackground(newColor);
                
            }
            else if (event.getActionCommand().equals("Add Circle"))
            {
                canvas.addCircle();
            }
            else if (event.getActionCommand().equals("Add Square"))
            {
                canvas.addSquare();
            }
            else
            {
            }
            canvas.repaint();
            
        }
    }

}
