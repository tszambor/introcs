// Exercise 1.5.36

public class RandomTunes
{
    public static void main(String[] args)
    {
        double vol = Double.parseDouble(args[0]);
        double speed = Double.parseDouble(args[1]);

        int sps = 44100;
        
        while (true)
        {
            int pitch = (int) (Math.random() * 12);
            double duration = Math.random();

            double hz = 440 * Math.pow(2, pitch / 12.0);
            int N = (int) (sps * duration * speed);
            
            double[] a = new double[N+1];
            for (int i = 0; i <= N; i++)
                a[i] = vol * Math.sin(2*Math.PI * i * hz / sps);
            StdAudio.play(a);
        }
    }
}