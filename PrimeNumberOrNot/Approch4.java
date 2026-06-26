package PrimeNumberOrNot;

public class Approch4 {
    public static void main(String[] args)
    {
         int num = 34;
        boolean isPrime = true;

        if(num<2)
        {
            isPrime = false;
        }
        else
        {
             //  iterate from 2  to square root of the number as it’s known that all the factors of the number lay in the interval [2, sqrt(number)].
            for(int i=2;i<=Math.sqrt(num);i++)
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
