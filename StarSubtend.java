// Exercise 2.1.16

public class StarSubtend
{
    public static void main(String[] args)
    {
        double d1 = Double.parseDouble(args[0]);
        double a1 = Double.parseDouble(args[1]);
        double d2 = Double.parseDouble(args[2]);
        double a2 = Double.parseDouble(args[3]);
        
        double a = a2 - a1;
        double d = d2 - d1;
        
        double dRad = Math.toRadians(d);
        double d1Rad = Math.toRadians(d1);
        double d2Rad = Math.toRadians(d2);
        double aRad = Math.toRadians(a);
        
        double angle = 2.0 * Math.asin(Math.sqrt(Math.sin(dRad / 2.0)*Math.sin(dRad / 2.0) + Math.cos(d1Rad) * Math.cos(d2Rad) *
                                      Math.sin(aRad / 2.0)*Math.sin(aRad / 2.0)));
        
        double angleDeg = Math.toDegrees(angle);
        
        StdOut.println(angle);
        StdOut.println(angleDeg);
    }
}