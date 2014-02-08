// Exercise 1.4.34

public class BridgeHands
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        // define the suit and rank of cards (copy from Cards.java)
        int[] suit = { 1, 2, 3, 4 };
        
        int[][] result = new int[N][suit.length];
        
        for (int n = 0; n < N; n++)
        {
            // create a deck (copy from Cards.java)
            int[] deck = new int[suit.length * 13];
        
            for (int i = 0; i < suit.length; i++)
                for (int j = 0; j < 13; j++)
                deck[13*i + j] = suit[i];
        
            // shuffle the deck (copy from Cards.java)
            int len = deck.length;
        
            for (int i = 0; i < len; i++)
            {
                int r = i + (int) (Math.random() * (len-i));
            
                int t = deck[i];
                deck[i] = deck[r];
                deck[r] = t;
            }
            
            // now count every 4th cards suit
            for (int i = 0; i < 13; i++)
                result[n][deck[i*4]-1]++;
        }
        
        // sort each row
        for (int i = 0; i < N; i++)
        {
            for (int j = result[i].length-1; j > 0; j--)
            {
                for (int k = j - 1; k >= 0; k--)
                    if (result[i][j] > result[i][k])
                {
                    int temp = result[i][k];
                    result[i][k] = result[i][j];
                    result[i][j] = temp;
                }
            }
        }
        
        /* for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < suit.length; j++)
                System.out.print(result[i][j] + " ");
            
            System.out.println();
        }
        */
        
        // calculate the occurence of common patterns
        int[][] patterns = { { 5, 3, 3, 2, 0 },
            { 4, 4, 3, 2, 0 },
            { 4, 3, 3, 3, 0 } };
        
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < patterns.length; j++)
            {
                int matchingDigits = 0;
                
                for (int k = 0; k < result[i].length; k++)
                {
                    if (patterns[j][k] == result[i][k])
                        matchingDigits++;
                }
                
                if (matchingDigits == result[i].length)
                    patterns[j][result[i].length]++;
            }
        }
        
        // print the patterns array
        for (int i = 0; i < patterns.length; i++)
        {
            for (int j = 0; j < patterns[i].length; j++)
                System.out.print(patterns[i][j] + " ");
            
            System.out.print(patterns[i][patterns[i].length-1] * 100.0 / N + "%");
            
            System.out.println();
        }
        
        // Theoretical data (from Wikipedia):
        
        // 5-3-3-2: 15.52%
        // 4-4-3-2: 21.55%
        // 4-3-3-3: 10.54%
    }
}