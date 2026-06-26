//Brute Force
package SumofNumbersInRange;

public class Approch1 {
    public static void main(String[] args)
    {
        int start_num = 30, end_num = 100, sum = 0;

        for(int i=start_num;i<=end_num ; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum of numbers from " +start_num+ " to " + end_num + " is: "+sum);
    }
}
