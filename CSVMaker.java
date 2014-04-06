public class CSVMaker
{
    public static void main(String[] args)
    {
        // read whitespace-separated real values
        // convert them to semicolon separated values
        
        while (!StdIn.isEmpty())
        {
            String value = StdIn.readString();
            
            StdOut.print(value.replace('.', ',') + ";");
        }
        StdOut.println();
    }
}