//Using the Formula
// sum = b*(b+1)/2 – a*(a+1)/2 + a
package SumofNumbersInRange;

public class Approch2 {
    public static void main(String[] args)
    {
        int num1 = 11 , num2 = 20 , sum = 0;

        sum = num2*(num2+1)/2 - num1*(num1+1)/2 + num1;
        System.out.println("Sum of given numbers is:"+sum);
    }

}
