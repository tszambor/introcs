// Program 1.5.7
// Exercise 1.5.23

public class PlayThatTuneMod
{
    public static void main(String[] args)
    {
        double vol = Double.parseDouble(args[0]);
        double speed = Double.parseDouble(args[1]);
        
        // Read a tune from StdIn and play it.
        int sps = 44100;
        while (!StdIn.isEmpty())
        {
            // Read and play one note.
            int pitch = StdIn.readInt();
            double duration = StdIn.readDouble();
            double hz = 440 * Math.pow(2, pitch / 12.0);
            int N = (int) (sps * duration * speed);
            double[] a = new double[N+1];
            for (int i = 0; i <= N; i++)
                a[i] = vol * Math.sin(2*Math.PI * i * hz / sps);
            StdAudio.play(a);
        }
    }
}