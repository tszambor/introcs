// Exercise 1.5.26

public class Circles
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]); // number of circles.
        double p = Double.parseDouble(args[1]); // probability, that the circle is black
        double min = Double.parseDouble(args[2]); // minimum radius
        double max = Double.parseDouble(args[3]); // maximum radius
        
        for (int i = 0; i < N; i++)
        {
            if (Math.random() < p)
                StdDraw.setPenColor(StdDraw.BLACK);
            else
                StdDraw.setPenColor(StdDraw.WHITE);
            
            double radius = min + (max - min) * Math.random();
            
            StdDraw.filledCircle(Math.random(), Math.random(), radius);
        }
    }
}