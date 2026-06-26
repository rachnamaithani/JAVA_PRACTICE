//ternary operator
package GreatestOfTwoNums;

public class Approch2 {
    public static void main(String[] args)
    {
        int num1 = 50, num2 = 50;

        if(num1 == num2)
        {   
            System.out.println("Both are equal");
        }
        else
        {
            int greatest = (num1 > num2)? num1 : num2;
            System.out.println(greatest + " is the largest number");
        }
    }
}
