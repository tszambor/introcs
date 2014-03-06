// Exercise 1.5.20

public class DrawCards
{
    public static void main(String[] args)
    {
        
        StdDraw.setXscale(0.0, 3.0);
        StdDraw.setYscale(0.0, 3.0);
        
        // diamond
        double[] x = { 0.0, 0.5, 1.0, 0.5 };
        double[] y = { 0.5, 1.0, 0.5, 0.0 };
        
        StdDraw.filledPolygon(x, y);
        
        // heart
        for (int i = 0; i < x.length; i++)
        {
            x[i] += 1.75;
            y[i] += 1.75;
        }
        
        StdDraw.filledPolygon(x, y);
        StdDraw.filledCircle(2.50, 2.50, Math.sqrt(0.5) / 2.0);
        StdDraw.filledCircle(2.00, 2.50, Math.sqrt(0.5) / 2.0);
        
        // spade?
        for (int i = 0; i < x.length; i++)
        {
            x[i] -= 1.75;
            y[i] += 0.25;
        }
        
        double[] xTriangle = { 0.25, 0.5, 0.75 };
        double[] yTriangle = { 1.625, 2.125, 1.625 };
        
        StdDraw.filledPolygon(xTriangle, yTriangle);
        
        StdDraw.setPenColor(StdDraw.WHITE);
        
        StdDraw.filledCircle(0.225, 1.9, 0.25);
        StdDraw.filledCircle(0.775, 1.9, 0.25);
        
        StdDraw.setPenColor(StdDraw.BLACK);
        
        StdDraw.filledPolygon(x, y);
        
        StdDraw.filledCircle(0.75, 2.25, Math.sqrt(0.5) / 2.0);
        StdDraw.filledCircle(0.25, 2.25, Math.sqrt(0.5) / 2.0);
        
        // club?
        for (int i = 0; i < xTriangle.length; i++)
        {
            xTriangle[i] += 1.75;
            yTriangle[i] -= 1.625;
        }
        
        StdDraw.filledPolygon(xTriangle, yTriangle);

        StdDraw.setPenColor(StdDraw.WHITE);
        
        StdDraw.filledCircle(1.975, 0.275, 0.25);
        StdDraw.filledCircle(2.525, 0.275, 0.25);
        
        StdDraw.setPenColor(StdDraw.BLACK);

        StdDraw.filledCircle(2.25, 0.875, 0.2775);
        StdDraw.filledCircle(2.5, 0.475, 0.2775);
        StdDraw.filledCircle(2.0, 0.475, 0.2775);
    }
}