package ArmstrongNumber;

public class Approch2 {

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
    static int ArmNum(int num, int len)
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
    public static void main(String[] args)
    {
        int num = 371;

        int len = FindLen(num);
        int isArm = ArmNum(num, len);

        if (isArm == num)
        {
            System.out.println(num + " is a Armstrong Number");
        }
        else{
            System.out.println(num+ " is not a Armstrong Number");
        }
    }
}
