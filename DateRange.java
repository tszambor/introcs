// Exercise 1.2.23

public class DateRange
{
    public static void main(String[] args)
    {
        int d = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        
        System.out.println(((m > 3 && m < 6) || (m == 3 && d >= 20) || (m == 6 && d <= 20)));
    }
}