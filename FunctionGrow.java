// Exercise 1.3.11

public class FunctionGrow
{
    public static void main(String[] args)
    {
        System.out.println("log N\t\t\tN\tNlog N\t\t\tN^2\tN^3\t2^N");
        System.out.println();
        
        for (int N = 16; N <= 2048; N *= 2)
        {
            double logN = Math.log(N);
            double NlogN = N * logN;
            double N2 = N * N;
            double N3 = N2 * N;
            double Npow2 = Math.pow(2, N);
            
            System.out.println(logN + "\t" + N + "\t" + NlogN + "\t" + N2 + "\t" +
                               N3 + "\t" + Npow2);
            
        }
    }
}