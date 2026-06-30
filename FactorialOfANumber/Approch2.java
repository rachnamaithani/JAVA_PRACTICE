package FactorialOfANumber;

public class Approch2 {
    
    static int Factorial(int num)
    {

        if(num ==0 || num ==1)
        {
            return 1;
        }
        return num * Factorial(num-1);
    }
    public static void main(String[] args)
    {
        int num = 3;
        int f = Factorial(num);
        System.out.println("Factorial of "+num + " is " +f);
    }

}
