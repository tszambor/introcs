public class PlotGraph
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        double[] x = new double[N+1];
        double[] y = new double[N+1];
        
        for (int i = 0; i <= N; i++)
            x[i] = Math.PI * i / N;
        
        for (int i = 0; i <= N; i++)
            y[i] = Math.sin(4*x[i]) + Math.sin(20*x[i]);
        
        StdDraw.setXscale(0, Math.PI);
        StdDraw.setYscale(-2.0, 2.0);
        
        for (int i = 1; i <= N; i++)
            StdDraw.line(x[i-1], y[i-1], x[i], y[i]);
    }
}