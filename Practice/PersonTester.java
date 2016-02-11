import java.util.Scanner;
public class PersonTester
{
    
    public static void main(String[] args)
    {
        System.out.println("Enter in the number of names: ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        Person[] person = new Person[number];
        for(int i = 0; i < person.length; i++)
        {
            person[i] = new Person(s.next());
        }
        
        for(int i = 0; i < person.length; i++)
        {
            for(int j = 0; j < person.length-i-1; j++)
            {
                if(person[j].compareTo(person[j+1]) > 0)
                {
                    Person swap = person[j+1];
                    person[j+1] = person[j];
                    person[j] = swap;
                }
            }
        }
        
        
        for(int i= 0; i < person.length; i++)
        {
            System.out.println(person[i]);
            
        }
    }
   

}
