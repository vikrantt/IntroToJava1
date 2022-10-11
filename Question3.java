//Question 3
//Write a java program to show following menu to the user:

//*******Menu*******
//1. Calculate Area of Circle
// 2. Calculate Circumference of a Circle
// 3. Exit.
// Choose an option (1-3): 

// Take radius as user input.

// Hint: Use Switch statement to act on the menu. Also area and circumference methods 
import java.util.*;
class Question3
{
    public static double pi= 3.14;
    public static void circumference(double r)
    {
        double ans= 2*pi*r;
        System.out.println("Circumference of circle:"+ans);
        System.out.println();
    }

    public static void area(double r)
    {
        double ar= pi*r*r;
        System.out.println("Area of circle:"+ar);
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int ch;
        while(true)
        {
            System.out.println("*******Menu*******");
            System.out.println("1. Calculate Area of Circle");
            System.out.println("2. Calculate Circumference of a Circle");
            System.out.println("3. Exit.");
            ch= s.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the radius:");
                    double r= s.nextDouble();
                    area(r);
                    break;
                case 2:
                        System.out.println("Enter the radius:");
                        double rad= s.nextDouble();
                        circumference(rad);
                        break;
                case 3: System.exit(0);
                default: System.out.println("Wrong entry....");
            }

        }
    }
}