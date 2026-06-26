package PalindromeNum;

public class Approch3 {

    static int checkPalindrome(int num)
    {
        int rev = 0, rem = 1;
        if(num == 0 )
            return rev;

        rem = num %10;
        rev = rem*10 + rev;
        return (num/10);
        
    }
    public static void main(String[] args)
    {
        int num = 1221;

        int isPal = checkPalindrome(num);
        if(isPal == num)
        {
            System.out.println(num+ " is a palindrome Number");
        }
        else
        {
            System.out.println(num+ "is not a palindrome Number");
        }
    }
}
