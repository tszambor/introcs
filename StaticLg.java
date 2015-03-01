// Exercise 2.1.10

public class StaticLg {
    
    public static double lg(double x) {
        return Math.log(x) / Math.log(2.0);
    }
    
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        
        StdOut.println(lg(a));
    }
}