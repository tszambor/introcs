// Exercise 1.3.7

public class Hellos
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        for (int i = 1; i <= N; i++)
        {
            String numeral;
            
            if (i % 10 == 0)
                numeral = "th";
            else if (i % 10 == 1)
                numeral = "st";
            else if (i % 10 == 2)
                numeral = "nd";
            else if (i % 10 == 3)
                numeral = "rd";
            else
                numeral = "th";
            
            System.out.println(i + numeral + " Hello");
        }
    }
}