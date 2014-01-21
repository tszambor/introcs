// Exercise 1.4.8

public class FibonacciArray
{
    public static void main(String[] args)
    {
        int N = 10;
        int[] a = new int[N];
        
        a[0] = 1;
        a[1] = 1;
        
        for (int i = 2; i < N; i++)
            a[i] = a[i-1] + a[i-2];
        
        for (int i = 0; i < N; i++)
            System.out.println(a[i]);
    }
}