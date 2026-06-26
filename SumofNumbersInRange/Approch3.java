//using recursion
package SumofNumbersInRange;

public class Approch3 {

    int sumofnumbers(int sum, int num1,int num2)
    {
        if(num1>num2)
        return sum;

        return num1 + sumofnumbers(sum, num1+1, num2);
    }
    public static void main(String[] args)
    {
        Approch3 obj = new Approch3();
        int num1 = 11, num2 = 20;
        int sum = obj.sumofnumbers(0,num1,num2);
        System.out.println("Sum of numbers in given range is:"+sum);
    }
}
