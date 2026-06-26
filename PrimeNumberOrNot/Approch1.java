//using if else
package PrimeNumberOrNot;

public class Approch1 {
    public static void main(String[] args)
    {
        int num = 22;
        boolean isPrime = true;

        // 0 and 1 are not prime numbers also, negative numbers are not prime
        if(num <2)
        {
            isPrime=false;
        }
        else
        {
            for(int i=2; i<num;i++)
            {
                if(num%i==0)
                {
                    isPrime=false;
                    break;
                }
            }

            if(isPrime)
            {
                System.out.println(num+ " is a Prime Number");
            }
            else
            {
                System.out.println(num+ " is not a Prime Number");
            }
        }
    }
}
