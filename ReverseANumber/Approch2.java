package ReverseANumber;

public class Approch2 {
    public static void main()
    {
        int num =1234567, rem = 1, rev = 0;

        for(;num!=0;num = num/10)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
    }
}
