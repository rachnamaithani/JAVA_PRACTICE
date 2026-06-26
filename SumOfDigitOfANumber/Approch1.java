//Using Brute Force
package SumOfDigitOfANumber;

public class Approch1 {
    public static void main(String[] args)
    {
        int num = 12493275 , temp = 1, sum = 0;

        while(num!=0)
        {
            temp = num % 10;
            sum = sum + temp;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
