// Exercise 1.5.25

public class Designs1
{
    public static void main(String[] args)
    {
        // Design 1
        StdDraw.setXscale(1.0/22.0, 21.0/22.0);
        StdDraw.setYscale(1.0/22.0, 21.0/22.0);
        
        StdDraw.clear(StdDraw.BLACK);
        
        double[] bigDiamondX = { 0.0, 0.5, 1.0, 0.5 };
        double[] bigDiamondY = { 0.5, 1.0, 0.5, 0.0 };
        
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.filledPolygon(bigDiamondX, bigDiamondY);
        
        StdDraw.setPenColor(StdDraw.WHITE);
        
        double[] smallTriangleXLow = { 0.0, 0.25, 0.25 };
        double[] smallTriangleYLow = { 0.25, 0.25, 0.0 };
        
        double[] smallTriangleXHigh = new double[smallTriangleXLow.length];
        double[] smallTriangleYHigh = new double[smallTriangleYLow.length];
        
        for (int i = 0; i < smallTriangleXLow.length; i++)
        {
            smallTriangleXHigh[i] = 1.0 - smallTriangleXLow[i];
            smallTriangleYHigh[i] = 1.0 - smallTriangleYLow[i];
        }
        
        StdDraw.filledPolygon(smallTriangleXLow, smallTriangleYLow);
        StdDraw.filledPolygon(smallTriangleXLow, smallTriangleYHigh);
        StdDraw.filledPolygon(smallTriangleXHigh, smallTriangleYLow);
        StdDraw.filledPolygon(smallTriangleXHigh, smallTriangleYHigh);
    }
}
        
            