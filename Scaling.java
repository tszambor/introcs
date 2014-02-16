public class Scaling
{
    public static void main(String[] args)
    {
        int N = 50;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N);
        for (int i = 0; i <= N; i++)
            StdDraw.line(0, N-i, i, 0);
    }
}