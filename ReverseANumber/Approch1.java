package ReverseANumber;

public class Approch1 {
    public static void main()
    {
        int num =1234, temp = 1 , sum = 0;

        while(num!= 0)
        {
            temp = num % 10;
            sum = sum*10 + temp;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
