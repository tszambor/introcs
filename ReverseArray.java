// Exercise 1.4.4

public class ReverseArray
{
    public static void main(String[] args)
    {
        String[] a = { "a", "b", "c", "d", "e", "f", "g" };
        
        int N = a.length;
        
        for (int i = 0; i < N/2; i++)
        {
            String temp = a[i];
            a[i] = a[N-i-1];
            a[N-i-1] = temp;
        }
        
        for (int i = 0; i < N; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}