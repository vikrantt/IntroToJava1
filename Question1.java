// Write a class with FirstName, LastName & age field. 
// Print Firstname, LastName & age using static block, 
// static method & static variable respectively.

class Person
{
    public static String FirstName;
    public static String LastName;
    public static int age;

    public static void showDetails()
    {
        System.out.println("First Name:"+FirstName);
        System.out.println("Last Name:"+LastName);
        System.out.println("Age:"+age);
    }
}
public class Question1
{
    public static void main(String [] args)
    {
        
        Person.FirstName="Vikram";
        Person.LastName= "Vikrant";
        Person.age= 22;
        Person.showDetails();
    }
}