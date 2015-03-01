// Exercise 2.1.20
// September 2014 edition

public class StaticDrawCards {
    
    public static int uniform(int N)
    {
        return (int) (Math.random() * N);
    }
    
    public static void exch(String[] a, int i, int j)
    {
        String t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    
    public static void shuffle(String[] a)
    {
        int N = a.length;
        for (int i = 0; i < N; i++)
            exch(a, i, i + uniform(N-i));
    }
    
    public static String[] initDeck()
    {
        String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
        
        String[] rank = 
        {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };
        
        String[] deck = new String[suit.length * rank.length];
        
        for (int i = 0; i < suit.length; i++)
            for (int j = 0; j < rank.length; j++)
            deck[rank.length * i + j] = rank[j] + " of " + suit[i];
        
        return deck;
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        for (int i = 0; i < N; i++)
        {
            String[] deck = initDeck();
            
            shuffle(deck);
            
            for (int j = 0; j < 5; j++)
                StdOut.println(deck[j]);
            
            StdOut.println();
        }
    }
}