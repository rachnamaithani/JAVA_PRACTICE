package FactorialOfANumber;

public class Approch1 {
    public static void main(String[] args)
    {
        int num = 4, fact = 1;
        for(int i = num ; i>=1; i--)
        {
            fact = fact*i;
        }
        System.out.println(fact);
    }

}
