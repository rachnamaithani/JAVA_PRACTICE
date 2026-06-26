// using if else and && operator
package GreatestOfThreeNums;

public class Approch1 {
    public static void main(String[] args)
    {
        int num1 = 45,num2 = 46, num3 = 98;

        if(num1 > num2 && num1 > num3)
        {
            System.out.println(num1+" is the largest");
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println(num2+" is the largest");
        }
        else if(num3>num1 && num3>num2)
        {
            System.out.println(num3+" is the largest");
        }
    }
}
