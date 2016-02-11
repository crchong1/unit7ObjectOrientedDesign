

public class Person implements Comparable
{
    private String name = "";
    public Person(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public int compareTo(Object name)
    {
        Person otherPerson = (Person) name;
        return this.name.compareTo(otherPerson.getName());
    }
   
    
}
