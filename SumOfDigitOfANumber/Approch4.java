package SumOfDigitOfANumber;

public class Approch4 {

   static int getSum(String num)
    {
        int sum = 0;

        for(int i = 0; i< num.length();i++)
        {
            sum = sum + num.charAt(i) - 48;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        String num = "498543958439545345";
        System.out.println("Sum of digits:"+getSum(num));
    }
}
