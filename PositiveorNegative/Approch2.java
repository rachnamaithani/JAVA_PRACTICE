//Using Nested if-else Statements
package PositiveorNegative;

public class Approch2 {
    public static void main(String[] args)
    {
        int num = 30;

        if(num >= 0)
        {
            if(num == 0 )
            {
                System.out.println("Number is Zero");
            }
            else
            {
                System.out.println("Number is positive");
            }
        }
        else
        {
            System.out.println("Number is negative");
        }
    }
}
