//Using inbuilt max Function
package GreatestOfTwoNums;

public class Approch3 {
    public static void main(String[] args)
    {
        int num1 = 44, num2= 65;

         if(num1 == num2)
        {   
            System.out.println("Both are equal");
        }
        else
        {
            int largest = Math.max(num1, num2);
            System.out.println("Largest number is:"+largest);
        }

    }
}
