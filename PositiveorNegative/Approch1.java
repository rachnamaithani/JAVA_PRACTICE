//brute force approch
package PositiveorNegative;

public class Approch1
{
    public static void main(String[] args)
    {
       
        int num = 6466;
        if(num>0)
        {
            System.out.println(num+ " is a positive number");
        }
        else if(num<0)
        {
            System.out.println(num+" is a negative number");
        }
        else 
        {
            System.out.println(num+ " is Zero");
        }
    }
}