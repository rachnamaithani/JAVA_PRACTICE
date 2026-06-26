//ternary operator
package GreatestOfThreeNums;

public class Approch3 {
    public static void main(String[] args)
    {
        int num1 = 65, num2 = 53, num3= 63;

        int temp = (num1 > num2) ? num1 : num2;

        int greatest = (temp > num3) ? temp : num3;

        System.out.println(greatest+"  is the largest of all three");
    }
}
