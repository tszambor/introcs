public class DivisorPattern
{
    public static void main(String[] args)
    {
        // Print a square that visualizes divisors.
        int N = Integer.parseInt(args[0]);
        for (int i = 1; i <= N; i++)
        {
            // Print the ith line.
            for (int j = 1; j <= N; j++)
            {
                // Print the jth entry in the ith line.
                if ((i % j == 0) || (j % i == 0))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(i);
        }
    }
}