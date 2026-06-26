package PalindromeNum;

public class Approch1 {

    public static void main(String[] args)
    {
        int num = 121, rev = 0, rem = 1;
        int temp = num;

       while(num>=1)
        {
        rem = num % 10;
        rev = rev*10 + rem;
        num = num / 10;
        }
        if(rev == temp)
        {
            System.out.println(temp+ " is a Palindrome number");
        }
        else
        {
            System.out.println(temp+ " is not a Palindrome number");
        }
    }
}
