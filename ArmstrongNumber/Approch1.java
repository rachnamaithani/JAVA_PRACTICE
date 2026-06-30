//abcd… = an + bn + cn + dn + …
package ArmstrongNumber;

public class Approch1 {
    public static void main(String[] args)
    {
        int num = 371 , rem = 1, isArm = 0 , len = 0;
        
        //find the length of the num
        int temp1 = num ;        
        while(temp1 != 0){
            len++;
            temp1 = temp1 / 10;
        }

        //create a armstrong num
        int temp2 = num;
        while(temp2 != 0){
            rem = temp2 % 10;
            isArm = (int)Math.pow(rem,len) + isArm;
            temp2 = temp2/10;
        }

        //verify original num is armstrong or not
        if(num == isArm){
            System.out.println(num + " is a armstrong number");
        }
        else{
            System.out.println(num+ " is not a armstrong number");
        }
    }

}
