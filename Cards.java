public class Cards
{
    public static void main(String[] args)
    {
        String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] rank =
        {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };
        
        // print random card name
        int x = (int) (Math.random() * rank.length);
        int y = (int) (Math.random() * suit.length);
        
        System.out.println(rank[x] + " of " + suit[y]);
        
        String[] deck = new String[suit.length * rank.length];
        for (int i = 0; i < suit.length; i++)
            for (int j = 0; j < rank.length; j++)
                deck[rank.length*i + j] = rank[j] + " of " + suit[i];
        
        // shuffle the deck
        int N = deck.length;
        
        for (int i = 0; i < N; i++)
        {
            int r = i + (int) (Math.random() * (N-i));
            
            String t = deck[i];
            deck[i] = deck[r];
            deck[r] = t;
        }
    }
}