package ReverseANumber;


public class Approch4 {

    int numrev(int num)
    {
        int rem = 1 , r =0;
        if(num == 0)
            return r;
        
        rem = num%10;
       System.out.print(rem);
        return numrev(num/10);
        
    }
    public static void main(String[] args)
    {
        Approch4 obj = new Approch4();
        int num = 12345;
        obj.numrev(num);

    }
}
