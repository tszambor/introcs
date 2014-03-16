// Exercise 1.5.28

public class StatisticalPolling
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        
        String[] voters = new String[N];
        
        int ind = 0;
        
        while (!StdIn.isEmpty())
        {
            voters[ind] = StdIn.readLine();
            ind++;
        }
        
        for (int i = 0; i < M; i++)
        {
            int r = i + (int) (Math.random() * (N-i));
            String t = voters[r];
            voters[r] = voters[i];
            voters[i] = t;
        }
        
        for (int i = 0; i < M; i++)
            StdOut.println(voters[i]);
    }
}
            
            