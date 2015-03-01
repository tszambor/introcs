// Exercise 2.1.6
// September 2014 version

public class StaticSigmoid {
    public static double sigmoid(double x) {
        return 1.0 / (1.0 + Math.exp(-x));
    }
    
    public static void main(String[] args) {
        StdOut.println(sigmoid(0.0));
        StdOut.println(sigmoid(2.0));
        StdOut.println(sigmoid(-10.0));
        
        StdDraw.setXscale(-10.0, 10.0);
        StdDraw.setYscale(0.0, 1.0);
        
        double x = -10.0;
        double step = 0.01;
        
        while (x <= 10.0)
        {
            StdDraw.point(x, sigmoid(x));
            x += step;
        }
        
    }
}