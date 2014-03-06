// Exercise 1.5.16

public class Centroid
{
    public static void main(String[] args)
    {
        double sumM = 0.0;
        double xC = 0.0, yC = 0.0;
        
        while (!StdIn.isEmpty())
        {
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            double m = StdIn.readDouble();
            
            sumM += m;
            
            xC += m * x;
            yC += m * y;
        }
        
        // Print out the centroid data
        StdOut.println("m " + sumM);
        StdOut.println("x " + xC / sumM);
        StdOut.println("y " + yC / sumM);
    }
}