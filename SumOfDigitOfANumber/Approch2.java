package SumOfDigitOfANumber;

public class Approch2 {

    int sumofalldigits(int sum, int num)
    {
        if(num<1)
            return sum;

        sum = sum + num % 10;
        return sumofalldigits(sum,num/10);
        }
    public static void main(String[] args)
    {
        Approch2 obj = new Approch2();
        int sum = 0, num = 3957345;
        int s = obj.sumofalldigits(sum,num);
        System.out.println(s);
    }
}
