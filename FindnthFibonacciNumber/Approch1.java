package FindnthFibonacciNumber;

import java.util.Scanner;

public class Approch1 {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int a = 0, b = 1, sum = 0;

        if(n == 1)
            System.out.println(n+ "st fibonacci number is : "+a);

        else if(n ==2)
            System.out.println(n +"nd fibonacci number is :"+b);
        else if(n > 2)
        {
            for(int i=3; i<=n; i++)
            {
                sum = a+b;
                a = b;
                b = sum;
            }
            System.out.println(n + "th fibonacci number is: "+sum);
        }
    }

}
