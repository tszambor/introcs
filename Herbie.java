public class Herbie
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]); // amount of children in the queue.
        int T = Integer.parseInt(args[1]); // number of steps in the experiment.
        
        double avSpeed = 0.001; // average speed of a child.
        double distribution = 0.1;
        double[] pos = new double[N]; // positions of each scout.
        double[] speed = new double[N];
        
        double curPos = 0.0;
        
        for (int i = 0; i < N; i++)
        {
            speed[i] = avSpeed;
            curPos += distribution;
            pos[i] = curPos;
        }
        
        // Draw the current kids.
        StdDraw.setXscale(pos[0], pos[N-1]);
        
        StdDraw.clear();
        
        for (int t = 0; t < T; t++)
        {
            pos[0] += speed[0];
            
            for (int i = 1; i < N; i++)
                if (pos[i] + speed[i] < pos[i-1])
                    pos[i] += speed[i];
                
            for (int i = 0; i < N; i++)
                speed[i] += (Math.random() - 0.5) * .0001;
                
            StdDraw.clear();
            StdDraw.setXscale(pos[0], pos[N-1]);

            for (int i = 0; i < N; i++)
                StdDraw.filledCircle(pos[i], 0.5, 0.005);
            
            StdDraw.show(30);
        }
    }
}