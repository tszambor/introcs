// Program 1.5.2

public class TwentyQuestions
{
    public static void main(String[] args)
    {
        // Generate a number and answer questions
        // while the user tries to guess the value.
        int N = 1 + (int) (Math.random() * 1000000);
        StdOut.print("I'm thinking of a number ");
        StdOut.println("between 1 and 1,000,000");
        int m = 0;
        while (m != N)
        {
            // Solicit one guess and provide one answer
            StdOut.print("What's your guess? ");
            m = StdIn.readInt();
            if (m == N) StdOut.println("You win!");
            if (m < N) StdOut.println("Too low ");
            if (m > N) StdOut.println("Too high");
        }
    }
}