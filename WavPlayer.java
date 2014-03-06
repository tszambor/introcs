// Exercise 1.5.24

public class WavPlayer
{
    public static void main(String[] args)
    {
        String s = args[0];
        double r = Double.parseDouble(args[1]);
        
        double a[] = StdAudio.read(s);
        
        if (r == 1.0)
        {
            StdAudio.play(a);
        }
        else if (r < 1.0)
        {
            double b[] = new double[(int) (r * a.length)];
            
            for (int i = 0; i < b.length; i++)
                b[i] = a[(int) (1.0 * i / r)];
            
            StdAudio.play(b);
        }
        else
        {
            double b[] = new double[(int) r * a.length];
            
            for (int i = 0; i < b.length; i++)
            {
                if (1.0 * i / r > i && 1.0 * i+1 / r < i+1)
                    b[i] =  a[i+1] + a[i] / 2.0;
                else
                    b[i] = a[(int)(1.0 * i / r)];
            }
            
            StdAudio.play(b);
        }
    }
}