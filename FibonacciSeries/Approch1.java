package FibonacciSeries;
public class Approch1 {


    public static void main(String[] args)
    {
        int length = 4;
        int a = 0, b = 1 , sum = 0;
        System.out.println(a);
        System.out.println(b);

        for(int i = 2 ; i< length ; i++)
        {   
            sum = a+ b;
            a = b;
            b = sum;
            System.out.println(sum);

        }
    }

   /* public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length : ");
        int length = sc.nextInt();

        int prev2 = 0 , prev1 = 1 , sum = 0;

        if(length ==1)
        {
            System.out.println(prev2);
        }
        else if(length == 2)
        {
            System.out.println(prev2);
            System.out.println(prev1);
        }
        else if(length > 2)
        {
             System.out.println(prev2);
             System.out.println(prev1);
             length = length - 2;

             while(length > 0)
             {
                sum = prev1 + prev2;
                System.out.println(sum);
                prev2 = prev1;
                prev1 = sum;
                length--;
             }
        }
    }
        */


}
