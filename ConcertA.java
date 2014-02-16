public class ConcertA
{
    public static void main(String[] args)
    {
        int sps = 44100; // samples per second
        int hz = 440; // concert A
        double duration = 10.0; // ten seconds
        int N = (int) (sps * duration); // total number of samples
        
        double[] a = new double[N+1];
        for (int i = 0; i <= N; i++)
            a[i] = Math.sin(2*Math.PI * i * hz / sps);
        StdAudio.play(a);
    }
}