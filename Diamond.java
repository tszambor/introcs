public class Diamond
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        
        double[] xd = { x-r, x, x+r, x };
        double[] yd = { y, y+r, y, y-r };
        
        StdDraw.polygon(xd, yd);
    }
}