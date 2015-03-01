// Exercise 2.1.17
// September 2014 edition

public class StaticBooleanMatrix {
    
    public static boolean[][] readBoolean2D() {
        int M = StdIn.readInt();
        int N = StdIn.readInt();
        
        boolean[][] a = new boolean[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
            a[i][j] = StdIn.readBoolean();
        
        return a;
    }
    
    public static void main(String[] args) {
        boolean[][] table = readBoolean2D();
        
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                StdOut.print(table[i][j] + " ");
            }
            StdOut.println();
        }
    }
}