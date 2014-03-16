// Exercise 1.5.30

public class Histogram
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        double l = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        
        int[] hist = new int[N];
        
        double step = (r - l) / N;
        
        while (!StdIn.isEmpty())
        {
            double val = StdIn.readDouble();
            
            int pos = (int) ((val - l) / step);
            
            if (pos < N)
                hist[pos]++;
        }
        
        // find the maximum value of hist
        int max = 0;
        
        for (int i = 0; i < N; i++)
            if (max < hist[i])
            max = hist[i];
        
        double[] x = new double[4];
        double[] y = new double[4];
        
        for (int i = 0; i < N; i++)
        {
            x[0] = i * (1.0 / N);
            y[0] = 0.0;
            
            x[1] = (i + 1) * (1.0 / N);
            y[1] = 0.0;
            
            x[2] = x[1];
            y[2] = hist[i] * (1.0 / max);
            
            x[3] = x[0];
            y[3] = y[2];
            
            if (i % 2 == 0)
                StdDraw.setPenColor(StdDraw.RED);
            else
                StdDraw.setPenColor(StdDraw.GREEN);
            
            StdDraw.filledPolygon(x, y);
        }
    }
}