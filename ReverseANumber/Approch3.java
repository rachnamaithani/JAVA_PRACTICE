package ReverseANumber;

public class Approch3 {

    static int revOfNum(int num , int rev)
    {
        int rem = 1;
        if (num == 0)
            return rev;

        rem = num % 10;
        rev = rev * 10 + rem;

        return revOfNum(num/10, rev);
    }
    public static void main(String[] args)
    {
        int num = 4958345, rev = 0;

        int revv = revOfNum(num , rev);
        System.out.println(revv);
    }
}
