//Question 2
//Write a program to read user input until user writes XDONE and then 
//show the entered text by the user on commandline
import java.util.*;
class Question2
{
    public static void main(String[] args)
    {
        List<String> arr= new ArrayList<>();
        while(true)
        {
            Scanner s= new Scanner(System.in);
            String str= s.nextLine();
            if(str.equals("XDONE"))
            {
                System.out.println(arr);
                break;
            }
            else arr.add(str);
        }
    }
}