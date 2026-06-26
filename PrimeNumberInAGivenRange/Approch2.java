//Using inner loop Range as [2, number/2]
package PrimeNumberInAGivenRange;

public class Approch2 {
    public static void main(String[] args)
    {
        int num1 = 1, num2  = 90;
        
        for(int i= num1;i<=num2;i++)
        {
            int counter = 0;
             if(i < 2)
                continue;
            for (int j = 2 ; j <= i / 2 ; j++)
            {
                if( i % j == 0 )
                {
                    counter++;
                }
            }
            if(counter <= 0)
            {
                System.out.println(i);
            }
        }
    }
}
