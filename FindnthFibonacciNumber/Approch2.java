package FindnthFibonacciNumber;

public class Approch2 {

    static int Fibbonacci(int n)
    {
        if (n <= 0) 
            return 0;
        if (n == 1 || n == 2) 
            return n - 1;
        
        return Fibbonacci(n - 1) + Fibbonacci(n - 2);
    }
    public static void main(String[] args)
    {
        int num = 4;
       int nth =  Fibbonacci(num);
       System.out.println(nth);
    }

}
