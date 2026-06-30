package ArmstrongNumInAGivenRange;

import java.util.Scanner;

public class Approch1 {

    static int FindLen(int num)
    {
        int len = 0;

        if(num == 0)
        return 0;

        while(num > 0)
        {
            len ++;
            num = num / 10;
        }
        return len;
        
    }
    static int FindArm(int num, int len)
    {
        int rem = 1 , isArm = 0;
        while(num > 0)
        {
            rem = num % 10;
            isArm = (int)Math.pow(rem,len) + isArm;
            num = num / 10;
        }
        return isArm;
    }

    public static void main(String[] Args)
    {
        int num1 , num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first number");
        num1 = sc.nextInt();

        System.out.println("Enter a second number");
        num2 = sc.nextInt();

        for(int i = num1 ; i<= num2 ; i++)
        {
            int len = FindLen(i);
            int isArm = FindArm(i, len);
            if(isArm == i)
            {
                System.out.println(isArm);
            }
        }   
    }

}
