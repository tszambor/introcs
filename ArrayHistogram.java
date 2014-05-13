// Exercise 2.1.19

public class ArrayHistogram
{
    public static int[] histogram(int[] a, int M)
    {
        int[] hist = new int[M];
        
        for (int i = 0; i < a.length; i++)
            if (a[i] < M && a[i] >= 0)
            hist[a[i]]++;
        
        return hist;
    }
    
    public static void main(String[] args)
    {
        int[] arg = { 0, 1, 1, 2, 5, 2, 2, 2, 2, 1, 1, 0, 5 };
        
        int[] res = histogram(arg, 6);
        
        for (int i = 0; i < res.length; i++)
            StdOut.print(res[i] + " ");
        StdOut.println();
    }
}