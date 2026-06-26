//Check in the interval [2, number/2].
package PrimeNumberOrNot;

public class Approch3 {
    public static void main(String[] args)
    {
        int num = 47;
        boolean isPrime = true;

        if(num<2)
        {
            isPrime = false;
        }
        else
        {
             // running loop till n is wasteful because for any number n the numbers in the range(n/2 + 1, n) won't be divisible anyways.
            for(int i=2;i<=num/2;i++)
            {
                if(num%i==0)
                {
                    isPrime = false;
                    break;
                }
            }
        }
        String result = (isPrime)? " Prime Number" : "Not a Prime Number";
        System.out.println(num+ " is a " +result);
    }
}
