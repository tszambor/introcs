// Exercise 1.3.2

public class QuadraticProp
{
    public static void main(String[] args)
    {
        double a = Double.parseDouble(args[0]); // quadratic coefficient
        double b = Double.parseDouble(args[1]); // linear coefficient
        double c = Double.parseDouble(args[2]); // constant / free term
        
        if (a != 0)
        {
            double discriminant = b*b - 4.0*a*c;
            
            System.out.println(discriminant);
            
            if (discriminant >= 0)
            {
                double d = Math.sqrt(discriminant);
                
                System.out.println((-b + d) / (2.0*a));
                System.out.println((-b - d) / (2.0*a));
            }
            else
            {
                System.out.println("There is no solution for provided equation.");
            }
        }
        else
        {
            System.out.println("This is a linear equation.");
        }
    }
}