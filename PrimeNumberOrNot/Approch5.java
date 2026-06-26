//check  in the range of [3, sqrt(number)].
package PrimeNumberOrNot;

public class Approch5 {
    public static void main(String[] args)
    {
        int num = 97;
        boolean isPrime = true;

        // 0 and 1 are not prime numbers
        // negative numbers are not prime
        if(num<=1)
        {
            isPrime = false;
        }

        // Check if n is a multiple of 2 thus all these won't be prime
        else if(num % 2 == 0)
        {
            isPrime = false;
        }
        // If not, then just check the odds
        else
        {
            for (int i = 3; i<Math.sqrt(num); i=i+2)
            {
                if(num%i ==0)
                {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Not a Prime number");
        }

    }
}
