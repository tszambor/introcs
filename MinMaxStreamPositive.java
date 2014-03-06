// Exercise 1.5.2

public class MinMaxStreamPositive
{
    public static void main(String[] args)
    {        
        int min = 0, max = 0;
        boolean init = false;
        
        if (!StdIn.isEmpty())
        {
            int a = -1;
            
            do
            {
                a = StdIn.readInt();
                
                if (a < 0)
                    StdOut.println("The program processes only positive values.");
                else
                {
                    min = a;
                    max = a;
                }
            } while (a < 0 && !StdIn.isEmpty());
            
            if (a >= 0)
                init = true;
        }
        
        while (!StdIn.isEmpty())
        {
            int a = StdIn.readInt();
            
            if (a < 0)
                StdOut.println("The program processes only positive values.");
            else
            {
                if (min > a)
                    min = a;
            
                if (max < a)
                    max = a;
            }
        }
        
        if (init)
        {
            StdOut.println("Min " + min);
            StdOut.println("Max " + max);
        }
        else
            StdOut.println("No positive values entered.");
    }
}