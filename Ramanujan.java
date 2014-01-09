// Exercise 1.3.32

public class Ramanujan
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        for (int i = 1; i*i*i <= N; i++)
        {
            for (int j = i; j*j*j <= N; j++)
            {
                for (int k = i; k*k*k <= N; k++)
                {
                    for (int l = k; l*l*l <= N; l++)
                    {
                        if (!((i == k && j == l) || (i == l && j == k)))
                            if (i*i*i + j*j*j == k*k*k + l*l*l && Math.abs(i*i*i + j*j*j) <= N)
                                System.out.println((i*i*i + j*j*j) + " is a sum of " + i + "^3 + " + j + "^3, and " + k + "^3 + " + l + "^3");
                    }
                }
            }
        }
    }
}