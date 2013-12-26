public class FunctionTable
{
    public static void main(String[] args)
    {
        // Print a table of function values.
        int N = Integer.parseInt(args[0]);
        
        for (int i = 0; i <= N; i++)
            System.out.println(i + " " + 2*Math.PI*i/N);
    }
}