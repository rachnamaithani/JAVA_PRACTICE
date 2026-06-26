//using recursion
package SumOfFirstnNaturalNumbers;

public class Approch3 {

    int sumofnums(int num)
    {
        if(num ==0)
            return num;

        return num + sumofnums(num-1);
    }
    public static void main(String[] args)
    {
        int num = 0;
        Approch3 obj = new Approch3();
        int sum = obj.sumofnums(num);
        System.out.println("SUM of "+num+ " Natural Numbers: "+sum);
    }
}
