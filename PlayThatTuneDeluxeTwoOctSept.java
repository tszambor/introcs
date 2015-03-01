// Program 2.1.4
// Exercise 2.1.24
// September 2014 version

public class PlayThatTuneDeluxeTwoOctSept
{
    public static double[] sum(double[] a, double[] b, double awt, double bwt)
    {
        // Superpose a and b, weighted.
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++)
            c[i] = a[i]*awt + b[i]*bwt;
        return c;
    }
    
    public static double[] tone(double hz, double t)
    {
        int sps = 44100;
        int N = (int) (sps * t);
        double[] a = new double[N+1];
        for (int i = 0; i <= N; i++)
            a[i] = Math.sin(2 * Math.PI * i * hz / sps);
        return a;
    }
    
    public static double[] note(int pitch, double t)
    {
        // Play note of given pitch, with harmonics.
        double hz = 440.0 * Math.pow(2, pitch / 12.0);
        double[] a = tone(hz, t);
        double[] hi1 = tone(2*hz, t);
        double[] lo1 = tone(hz/2, t);
        double[] h1 = sum(hi1, lo1, .5, .5);
        
        // addition for the two octave sound.
        double[] hi2 = tone(4*hz, t);
        double[] lo2 = tone(hz/4, t);
        double[] h2 = sum(hi2, lo2, .25, .25);
        
        double[]h = sum(h1, h2, .5, .5);
        
        return sum(a, h, .5, .5);
    }
    
    public static void main(String[] args)
    {
        // Read and play a tune, with harmonics.
        while (!StdIn.isEmpty())
        {
            // Read and play a note, with harmonics.
            int pitch = StdIn.readInt();
            double duration = StdIn.readDouble();
            double[] a = note(pitch, duration);
            StdAudio.play(a);
        }
    }
}