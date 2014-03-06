// Exercise 1.5.19

public class Circumference
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        
        double[][] points = new double[2][N];
        
        StdDraw.setPenRadius(0.005);
        
        for (int i = 0; i < N; i++)
        {
            double x = Math.sin(2.0*i*Math.PI / N);
            double y = Math.cos(2.0*i*Math.PI / N);
            
            points[0][i] = x;
            points[1][i] = y;
            
            StdDraw.point(x, y);
        }
        
        StdDraw.setPenRadius(0.002);
        StdDraw.setPenColor(StdDraw.GRAY);
        
        for (int i = 0; i < N; i++)
        {
            for (int j = i; j < N; j++)
            {
                if (Math.random() < p)
                    StdDraw.line(points[0][i], points[1][i], points[0][j], points[1][j]);
            }
        }
    }
}