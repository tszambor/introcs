// Program 2.1.17

public class Read2dMatrix
{
    public static boolean[][] readBoolean2D()
    {
        int y = StdIn.readInt();
        int x = StdIn.readInt();
        
        boolean[][] array = new boolean[y][x];
        
        for (int i = 0; i < y; i++)
            for (int j = 0; j < x; j++)
                array[i][j] = StdIn.readBoolean();
        
        return array;
    }
    
    public static void main(String[] args)
    {
        boolean[][] arr = readBoolean2D();
        
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
                StdOut.print(arr[i][j] + "   ");
            StdOut.println();
        }
    }
}
            