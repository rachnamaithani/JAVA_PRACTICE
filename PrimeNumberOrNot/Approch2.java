//if else and counter var
package PrimeNumberOrNot;

public class Approch2 {
    public static void main(String[] args)
    {
        int num = 97, counter = 0;

        if(num <2)
        {
            System.out.println(num+ " is not a prime number");
        }
        else
        {
            for (int i= 1; i<=num ; i++)
            {
                if(num % i ==0)
                    counter++;
            }
            if(counter > 2)
            {
                System.out.println(num+"is not a prime number");
            }
            else
            {
                System.out.println(num+ " is a prime number");
            }
        }
    }
}
