// Exercise 2.1.16
// September 2014 edition
// Calculate the angle two stars subtend
// using Haversine formula
// http://en.wikipedia.org/wiki/Haversine_formula

public class Haversine {
    
    public static void main(String[] args) {
        int d1 = Integer.parseInt(args[0]);
        int a1 = Integer.parseInt(args[1]);
        int d2 = Integer.parseInt(args[2]);
        int a2 = Integer.parseInt(args[3]);
        
        int a = a2 - a1;
        int d = d2 - d1;
        
        double aR = Math.toRadians(a);
        double dR = Math.toRadians(d);
        double d1R = Math.toRadians(d1);
        double d2R = Math.toRadians(d2);
        
        double subtend = 2.0 * Math.asin(Math.pow(Math.sin(dR/2.0)*Math.sin(dR/2.0) + Math.cos(d1R)*Math.cos(d2R)*
                                            Math.sin(aR/2.0)*Math.sin(aR/2.0), 0.5));
        
        StdOut.println(subtend);
        StdOut.println(Math.toDegrees(subtend));
    }
}