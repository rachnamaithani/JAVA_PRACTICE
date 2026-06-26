package SumOfDigitOfANumber;

public class Approch3 {

    static int sumofdigits(int n)
    {
        if(n<1)
            return 0;

        return (n %10) + sumofdigits(n/10);
    }
    public static void main(String[] args)
    {
        int num = 3598345;

        int s = sumofdigits(num);
        System.out.println(s);
    }
}   
