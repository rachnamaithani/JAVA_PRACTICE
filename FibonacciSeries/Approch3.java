package FibonacciSeries;

public class Approch3 {
    
    static void Fibbo(int len)
    {
        int arr[] = new int[len];

        arr[0] = 0;
        arr[1] = 1;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        for(int i= 2 ; i<len ; i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        int num = 5;
        Fibbo(num);
    }
}
