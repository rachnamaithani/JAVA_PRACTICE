//brute force - Using for Loop
package SumOfFirstnNaturalNumbers;

import java.util.Scanner;

public class Approch1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = sc.nextInt();

        int sum = 0;

        for(int i=1;i<=num;i++)
        {
            sum = sum + i;
            System.out.println(sum);
        }
        System.out.println("Sum of "+num+" Natural Numbers is: "+sum);
    }
}
