// Program 1.5.5

public class PlotFilter
{
    public static void main(String[] args)
    {
        // Plot points in standard input.
        
        // Scale as per first four values.
        double x0 = StdIn.readDouble();
        double y0 = StdIn.readDouble();
        double x1 = StdIn.readDouble();
        double y1 = StdIn.readDouble();
        StdDraw.setXscale(x0, x1);
        StdDraw.setYscale(y0, y1);
        
        // Read and plot the rest of the points.
        while (!StdIn.isEmpty())
        {
            // Read and plot a point.
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            StdDraw.point(x, y);
        }
    }
}