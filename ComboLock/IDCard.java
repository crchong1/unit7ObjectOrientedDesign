
public class IDCard
{
    private String idNumber;
    
    public boolean equals( Object other)
    {
        if(this.getClass() == other.getClass())//makes sure both are of the same class
        {
            //if so, cast the other object to an IDCard
            IDCard otherIDCard = (IDCard) other;
            
            //second, check if the superclass (Card) determines that this object and the other object are equal
            boolean isEqual = super.equals(otherIDCard);
            
            //third, check if the instance variables of this object and the other object are equal
            return isEqual && this.idNumber.equals(otherIDCard.idNumber);
        
        }
       
        
        
    }

}
