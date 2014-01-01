public class RulerLoop
{
    public static void main(String[] args)
    {
        // Print the ruler function.
        int N = Integer.parseInt(args[0]);
        
        String ruler = " ";
        for (int i = 1; i <= N; i++)
        {
            ruler = ruler + i + ruler;
            
            // Print the length of the string, needed for ex. 1.3.10
            // out of memory exception when N is big
            System.out.println(ruler.length());
        }
        
        System.out.println(ruler);
    }
}