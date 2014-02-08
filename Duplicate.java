// Exercise 1.4.28

public class Duplicate
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
        
        for (int i = 0; i < N;)
        {
            int sum = 0;
            int currentVal = data[i];
            
            for (int j = i; j < N; j++)
            {
                
                if (data[j] == currentVal)
                {
                    sum++;
                    data[j] = 0;
                }
                else
                    break;
            }
            
            if (sum > 1)
                System.out.println(currentVal + " duplicated " + sum + " times.");
            
            i += sum;
        }
    }
}