// Using Ternary Operator

package PositiveorNegative;

public class Approch3 {
    public static void main(String[] args)
    {
        int num =459845;
        if(num ==0)
        {
            System.out.println("Number is a zero");
        }
        else
        {
        String s = (num>0)? "Number is Positive" : "Number is negative";
        System.out.println(s);
        }
    }
}
