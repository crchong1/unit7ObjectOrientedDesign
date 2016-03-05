import javax.swing.JFrame;
import  java.awt.BorderLayout;


/**
 * class DrawingEditor which creates a window
 * 
 * @Connor Chong 
 * @2/23/16
 */
public class DrawingEditor extends JFrame
{
    private ControlPanel controls;
    private DrawingPanel canvas;
    
    private int WINDOW_HEIGHT = 800;
    private int WINDOW_LENGTH = 600;
    
    public DrawingEditor()
    {    
        this.setTitle("Drawing Editor");
        DrawingPanel canvas  = new DrawingPanel();
        ControlPanel controls = new ControlPanel(canvas);

        this.setLayout(new BorderLayout());
        this.add(controls, (BorderLayout.SOUTH));
        this.add(canvas, BorderLayout.CENTER);
        
        this.setSize(WINDOW_LENGTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        DrawingEditor editor = new DrawingEditor();
    }
    

}
