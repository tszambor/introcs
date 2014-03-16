// Program 1.5.7
// Exercise 1.5.27

public class PlayThatTuneVis
{
    public static void main(String[] args)
    {
        // Read a tune from StdIn and play it.
        int sps = 44100;
        
        StdDraw.setXscale(0.0, 2 * Math.PI);
        StdDraw.setYscale(-1.0, 1.0);
        
        StdDraw.clear();
        StdDraw.show(20);
        
        while (!StdIn.isEmpty())
        {
            // Read and play one note.
            int pitch = StdIn.readInt();
            double duration = StdIn.readDouble();
            double hz = 440 * Math.pow(2, pitch / 12.0);
            int N = (int) (sps * duration);
            double[] a = new double[N+1];
            for (int i = 0; i <= N; i++)
                a[i] = Math.sin(2*Math.PI * i * hz / sps);
            
            // visualize the sine wave on the screen
            StdDraw.clear();
            
            StdDraw.setPenRadius(.005);
            
            double x1 = 0.0;
            double y1 = Math.sin(2*Math.PI * x1 * hz);
            
            double x2 = 0.0, y2 = 0.0;
            
            while (x2 < 2 * Math.PI)
            {
                x2 += 0.05;
                
                y2 = Math.sin(2*Math.PI * x2 * hz);
                
                StdDraw.line(x1, y1, x2, y2);
                
                x1 = x2;
                y1 = y2;
                
                StdDraw.text(0.5, 1.0, Double.toString(Math.round(hz)));
            }
            
            StdDraw.show(20);
            
            StdAudio.play(a);
        }
    }
}