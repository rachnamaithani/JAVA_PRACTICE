//using ternary operator
package LeapYearOrNot;

public class Approch3 {

    public static void main(String[] args)
    {
        int year= 2028;

        boolean leap = (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)? true: false;
        if (leap)
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
    }
}
