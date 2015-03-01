// Exercise 2.1.27
// Harmonic numbers

public class HarmonicStatic {
    
    public static double Hsmall(int N)
    {
        double sum = 0.0;
        
        for (int i = 1; i <= N; i++)
            sum += 1.0/i;
        
        return sum;
    }
    
    public static double Hlarge(int N)
    {
        double EulerConst = .577215664901532;
        
        return Math.log(N) + EulerConst + 1.0/(2.0*N) - 1.0/(12.0*N*N) + 1.0/(120.0*N*N*N*N);
    }
    
    public static double H(int N)
    {
        if (N < 100)
            return Hsmall(N);
        else
            return Hlarge(N);
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        StdOut.println(H(N));
    }
}