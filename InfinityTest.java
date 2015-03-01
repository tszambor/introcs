// Exercise 2.1.7
// Explanation for question in the exercise: the while() condition is always false, so the
// value returned is the same value that has been passed to the static method, namely
// Double.POSITIVE_INFINITY

public class InfinityTest {
    
    // copied from NewtonModular.java
    public static double sqrt(double c)
    {
        // Compute the square root of c.
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > err * t)
            t = (c/t + t) / 2.0;
        return t;
    }
    
    public static void main(String[] args) {
        StdOut.println(Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY);
        
        StdOut.println(Math.abs(Double.POSITIVE_INFINITY - Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY));
        
        StdOut.println(Math.abs(Double.POSITIVE_INFINITY - Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY) > 1);
        
        StdOut.println(sqrt(Double.POSITIVE_INFINITY));
    }
}