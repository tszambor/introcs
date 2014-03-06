// Exercise 1.5.25

public class Designs2
{
    public static void main(String[] args)
    {
        // Design 2
        StdDraw.setXscale(1.0/22.0, 21.0/22.0);
        StdDraw.setYscale(1.0/22.0, 21.0/22.0);
        
        StdDraw.clear(StdDraw.BLACK);
        
        double[] bigDiamondX = { 0.0, 0.5, 1.0, 0.5 };
        double[] bigDiamondY = { 0.5, 1.0, 0.5, 0.0 };
        
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.filledPolygon(bigDiamondX, bigDiamondY);
        
        StdDraw.setPenColor(StdDraw.WHITE);
        
        double[] rectangleXlow = { 0.125, 0.375, 0.25, 0.0 };
        double[] rectangleYlow = { 0.375, 0.125, 0.0, 0.25 };
        
        double[] rectangleXhigh = new double[rectangleXlow.length];
        double[] rectangleYhigh = new double[rectangleYlow.length];
        
        for (int i = 0; i < rectangleXlow.length; i++)
        {
            rectangleXhigh[i] = 1.0 - rectangleXlow[i];
            rectangleYhigh[i] = 1.0 - rectangleYlow[i];
        }
        
        StdDraw.filledPolygon(rectangleXlow, rectangleYlow);
        StdDraw.filledPolygon(rectangleXlow, rectangleYhigh);
        StdDraw.filledPolygon(rectangleXhigh, rectangleYlow);
        StdDraw.filledPolygon(rectangleXhigh, rectangleYhigh);
    }
}
        
            