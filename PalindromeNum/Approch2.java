package PalindromeNum;

public class Approch2 {
    
    public static void main(String[] args)
{
    int num = 1254343541;
    String str = String.valueOf(num);
    String sb = new StringBuilder(str).reverse().toString();
    if(str.equals(sb))
    {
        System.out.println(num+ " is a Palindrome Number");
    }
    else
    {
        System.out.println(num+ " is not a Palindrome Number");
    }
}

}
