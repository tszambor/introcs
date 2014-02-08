// Exercise 1.4.28

public class DuplicateProper
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        int[] data = new int[N];
        
        for (int i = 0; i < N; i++)
            data[i] = 1 + (int) (Math.random() * N);
        
        // Print the source array
        for (int i = 0; i < N; i++)
            System.out.print(data[i] + " ");
        
        System.out.println();

        // order the array first, something of a bubble sort of my kind ;)
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N-i-1; j++)
            {
                if (data[j] > data[j+1])
                {
                    int t = data[j+1];
                    data[j+1] = data[j];
                    data[j] = t;
                }
            }
        }
        
        // Print the source array after the sort
        for (int i = 0; i < N; i++)
            System.out.print(data[i] + " ");
        
        System.out.println();
        
        // I should sweep the entire table as long as there are positive values in it...
        boolean sweep = true;
        
        while (sweep)
        {
            sweep = false;
            
            for (int i = 0; i < N; i++)
            {
                int val = data[i];

                if (val > 0)
                {
                    // debug
                    for (int j = 0; j < N; j++)
                        System.out.print(data[j] + " ");
        
                    System.out.println();
                    
                    sweep = true;
                    
                    int sum = 0;
                
                    for (int j = 0; j < N; j++)
                        if (data[j] == val)
                    {
                        sum++;
                        data[j] = 0;
                    }
                    else
                        break;
                
                    if (data[val-1] == 0)
                        data[val-1] = -1 * sum;
                    else if (data[val-1] < 0)
                        data[val-1] -= sum;
                    else
                    {
                        // start from the right, find first 0
                        int vec = 0;
                    
                        for (vec = N-1; vec >= 0; vec--)
                            if (data[vec] == 0)
                        {
                            data[vec] = data[val-1];
                            data[val-1] = -1 * sum;
                            break;
                        }
                    
                        // we did not find any 0 value in the array
                        if (vec == 0)
                            System.out.println("Algorithm failure.");
                    }
                }
            }
        }
        
        for (int i = 0; i < N; i++)
            System.out.print(data[i] + " ");
        
        System.out.println();
    }
}