//using bitwise and &
package EvenorOdd;

public class Approch3 {
    public static void main(String[] args)
    {
        int num = 6463;

        if((num & 1)==0)
        {
            System.out.println("Number i a even number");
        }
        else
        {
            System.out.println("Number is a odd number");
        }
    }
}
/*
if(num & 1) > wrong
In C/C++, any non-zero number is automatically treated as true, so if(num & 1) works fine there.
But Java is strict — it will never auto-convert a number to boolean. You must always explicitly compare:
 */