// Exercise 1.5.25

public class Designs3
{
    public static void main(String[] args)
    {
        // Design 3
        StdDraw.setXscale(1.0/22.0, 21.0/22.0);
        StdDraw.setYscale(1.0/22.0, 21.0/22.0);
        
        StdDraw.clear(StdDraw.BLACK);
        
        double[] bigDiamondX = { 0.0, 0.5, 1.0, 0.5 };
        double[] bigDiamondY = { 0.5, 1.0, 0.5, 0.0 };
        
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.filledPolygon(bigDiamondX, bigDiamondY);
        
        StdDraw.setPenColor(StdDraw.WHITE);
        
        StdDraw.filledSquare(.125, .125, .125);
        StdDraw.filledSquare(1.0 - .125, .125, .125);
        StdDraw.filledSquare(.125, 1.0 - .125, .125);
        StdDraw.filledSquare(1.0 - .125, 1.0 - .125, .125);
        
    }
}
        
            