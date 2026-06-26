//Using Formula for the Sum of Nth Term
//Sum = ( Num * ( Num + 1 ) ) / 2
package SumOfFirstnNaturalNumbers;

import java.util.Scanner;

public class Approch2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        sum = (num * (num+1))/2;

        System.out.println("Sum of "+num+" Natural Numbers is:"+sum);

    }
}
