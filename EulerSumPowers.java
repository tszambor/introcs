// Exercise 1.3.44

public class EulerSumPowers
{
    public static void main(String[] args)
    {
        long max = 500;
        
        for (long a = 1; a < max; a++)
        {
            for (long b = a; b < max; b++)
            {
                for (long c = b; c < max; c++)
                {
                    for (long d = c; d < max; d++)
                    {
                        for (long e = 1; e < max; e++)
                        {
                            if (e*e*e*e*e == a*a*a*a*a + b*b*b*b*b + c*c*c*c*c + d*d*d*d*d)
                            {
                                System.out.println("Proven! a, b, c, d: " + a + ", " + b + ", " + c + ", " + d + " and e: " + e);
                            }
                        }
                    }
                }
            }
            System.out.println(a); // proven for: a 27 b 84 c 110 d 133 and e 144
        }
    }
}