// Exercise 1.3.41

public class MedianFive
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        
        // order the first three
        
        int min = 0, med = 0, max = 0;
        int t = 0;
        
        // Can be replaced by min, max and no if needed?
        
        if (a < b)
        {
            min = a; max = b;
        }
        else
        {
            min = b; max = a;
        }
        
        if (c < min)
        {
            t = min; min = c; med = t;
        }
        else if (c > max)
        {
            t = max; max = c; med = t;
        }
        else
            med = c;
        
        // now we know min, med, max, let's place the two remaining values
        if (d > max && e > max)
        {
            med = max;
        } 
        else if (d < min && e < min)
        {
            med = min;
        }
        else if (d > med && e > med)
        {
            med = Math.min(d, e);
        }
        else if (d < med && e < med)
        {
            med = Math.max(d, e);
        }
        
        System.out.println(med);
            
    }
}