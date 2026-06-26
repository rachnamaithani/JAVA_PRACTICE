//recursion - > print value in called func()
package ReverseANumber;


public class Approch4 {

    void numrev(int num)
    {
        int rem = 1 ;
        if(num == 0)
            return;
        
        rem = num%10;
       System.out.print(rem);
       numrev(num/10);
        
    }
    public static void main(String[] args)
    {
        Approch4 obj = new Approch4();
        int num = 12345;
        obj.numrev(num);

    }
}
