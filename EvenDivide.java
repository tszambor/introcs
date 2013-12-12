// Exercise 1.2.14

public class EvenDivide
{
    public static void main(String[] args)
    {
        if (args.length > 1)
        {
            
            int i1 = Integer.parseInt(args[0]);
            int i2 = Integer.parseInt(args[1]);
        
            System.out.println("Itegers divide by each other: " + (i1 % i2 == 0 || i2 % i1 == 0));
        }
        else
        {
            System.out.println("Please enter two positive integer parameters for the program.");
        }
    }
}