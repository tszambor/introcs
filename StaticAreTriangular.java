// Exercise 2.1.5
// September 2014 version (repeat)
// each of the sides must be smaller than other two added up

public class StaticAreTriangular {
    public static boolean areTriangular(double a, double b, double c) {
        return a < b + c && b < a + c && c < a + b;
    }
    
    public static void main(String[] args) {
        StdOut.println(areTriangular(1, 1, 1)); // true
        StdOut.println(areTriangular(2, 2, 1)); // true
    }
}