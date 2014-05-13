// Program 2.1.20

public class CardShuffler
{
    public static int[] perm(int M, int N)
    {
        // Return a permutation of length M from a data of length N.
        
        int perm[] = new int[N];
        int ret[] = new int[M];
        
        for (int i = 0; i < N; i++)
            perm[i] = i;
        
        for (int i = 0; i < M; i++)
        {
            // Exchange perm[i] with a random element to its right.
            int r = i + (int) (Math.random() * (N - i));
            int t = perm[r];
            perm[r] = perm[i];
            perm[i] = t;
            ret[i] = perm[i];
        }
        
        return ret;
    }
            
    public static String[] getRandomSample(int M)
    {
        // Return an array of M elements randomly chosen from a deck of cards.
        String[] a = new String[M];
        
        String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] rank = 
        {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };
        
        String[] deck = new String[suit.length * rank.length];
        for (int i = 0; i < suit.length; i++)
            for (int j = 0; j < rank.length; j++)
            deck[rank.length*i + j] = rank[j] + " of " + suit[i];
        
        int[] randomIndices = perm(M, deck.length);
        
        for (int i = 0; i < M; i++)
            a[i] = deck[randomIndices[i]];
        
        return a;
    }
        
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        for (int i = 0; i < N; i++)
        {
            String[] hand = getRandomSample(5);
            
            for (int j = 0; j < hand.length; j++)
                StdOut.println(hand[j]);
            
            StdOut.println();
        }
    }
}
