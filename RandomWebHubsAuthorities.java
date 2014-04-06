// Exercise 1.6.14

public class RandomWebHubsAuthorities
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]); // total number of links
        int H = Integer.parseInt(args[2]); // number of hubs
        int A = Integer.parseInt(args[3]); // number of authorities
        
        StdOut.println(N);
        
        // Store table of all links
        boolean[][] links = new boolean[N][N];
        boolean[] hubs = new boolean[N];
        boolean[] auth = new boolean[N];
        
        // Distribute all pages.
        for (int i = 0; i < M; i++)
        {
            int src = (int) (Math.random() * N);
            int dest = (int) (Math.random() * N);
            links[src][dest] = true;
            
            StdOut.printf("%d %d\t", src, dest);
        }
        
        StdOut.println();
        
        // Distribute hubs.
        for (int i = 0; i < H; i++)
        {
            int dest = 0;
            do
                dest = (int) (Math.random() * N); // this is our i-th hub.
            while (hubs[dest]);
            
            hubs[dest] = true;
            
            for (int j = 0; j < (int) (.1 * N); j++)
            {
                int src = 0;
                
                do
                    src = (int) (Math.random() * N);
                while (src == dest);
                
                if (!links[src][dest])
                    StdOut.printf("%d %d\t", src, dest);
            }
            
            StdOut.println();
        }
        
        StdOut.println();
        
        // Distribute authorities.
        for (int i = 0; i < A; i++)
        {
            int src = 0;
            
            do
                src = (int) (Math.random() * N); // this is our i-th authority.
            while(auth[src]);
            
            auth[src] = true;
            
            for (int j = 0; j < (int) (.1 * N); j++)
            {
                int dest = 0;
                do
                    dest = (int) (Math.random() * N);
                while (src == dest);
                
                if (!links[src][dest])
                    StdOut.printf("%d %d\t", src, dest);
            }
            
            StdOut.println();
        }
    }
}