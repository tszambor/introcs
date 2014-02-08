// Exercise 1.4.25

public class InversePermutation
{
    public static void main(String[] args)
    {
        int N = args.length;
        
        int[] permutation = new int[N];
        
        for (int i = 0; i < N; i++)
            permutation[i] = Integer.parseInt(args[i]);
        
        // check if this is a valid permutation (each element is there only once)
        int[] check = new int[N];
        
        for (int i = 0; i < N; i++)
            if (permutation[i] < N)
            check[permutation[i]]++;
        
        boolean valid = true;
        
        for (int i = 0; i < N; i++)
            if (check[i] != 1)
            valid = false;
        
        if (valid)
        {
            int[] inverse = new int[N];
            
            for (int i = 0; i < N; i++)
            {
                inverse[permutation[i]] = i;
            }
            
            for (int i = 0; i < N; i++)
                System.out.print(inverse[i] + " ");
            
            System.out.println();
        }
        else
            System.out.println("Invalid permutation.");
    }
}