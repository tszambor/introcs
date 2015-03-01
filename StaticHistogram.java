// Exercise 2.1.19
// September 2014 edition

public class StaticHistogram {
    
    public static int[] histogram(int[] a, int M)
    {
        int[] hist = new int[M];
        
        for (int i = 0; i < a.length; i++)
            hist[a[i]]++;
        
        return hist;
    }
    
    public static void main(String[] args)
    {
        int[] test = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6 };
        
        int[] h = histogram(test, 7); // 7 elements, because value 0 is not in the table it is counted though
        
        for (int i = 0; i < h.length; i++)
            StdOut.print(h[i]);
        StdOut.println();
    }
}