package FibonacciSeries;

public class Approch2 {
    
    static int a = 0, b = 1;

    static void fibbonaci(int len)
    {
        if(len > 0)
        {
        int sum = a + b;
        a = b;
        b = sum;
        System.out.println(sum);
        fibbonaci(len - 1);
        }   
    }
    public static void main(String[] args)
    {
        int length = 10;
        System.out.println(a);
        System.out.println(b);
        fibbonaci(length-2);
    }


}
