public class ComboLock
{
    private int combo1=0;
    private int combo2=0;
    private int combo3=0;
    private int currentState = 40;
    private boolean firstLock = false;
    private boolean secondLock = false;
    private boolean thirdLock = false;
    private int turnCounter = 0;
    
    public ComboLock( int secret1, int secret2, int secret3 ) 
    {
        this.combo1 = secret1;
        this.combo2 = secret2;
        this.combo3 = secret3;
    }
    public void reset()
    {
        this.currentState = 40;
        this.turnCounter = 0;
    }
    public void turnLeft( int ticks )
    {
        turnCounter ++;
        currentState = currentState + ticks;
        
        if(currentState >= 40)
        {
            currentState = currentState - 40;
        }
        if(this.turnCounter == 1 && this.currentState == combo1)
        {
            this.firstLock = true;
        }
        if(this.turnCounter == 2 && this.currentState == combo2)
        {
            this.secondLock = true;
        }
        if(this.turnCounter == 3 && this.currentState == combo3)
        {
            this.thirdLock = true;
        }
    }
    public void turnRight( int ticks )
    {
        turnCounter++;
        currentState = currentState - ticks;
        
        if(currentState <= 0)
        {
            currentState = currentState + 39;
        } 
        
        if(this.turnCounter == 1 && this.currentState == combo1)
        {
            this.firstLock = true;
        }
        if(this.turnCounter == 2 && this.currentState == combo2)
        {
            this.secondLock = true;
        }
        if(this.turnCounter == 3 && this.currentState == combo3)
        {
            this.thirdLock = true;
        }
    }
    public boolean open()
    {
        if(this.firstLock == true && this.secondLock == true && this.thirdLock == true)
        {
            return true;
        }
        else
        {   
            return false;
        }
    }
}