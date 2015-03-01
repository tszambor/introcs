public class StaticExercisesEqSeptember {
    public static boolean eq(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        else
        {
            for(int i = 0; i < a.length; i++) {
                if (a[i] != b[i])
                return false;
            }
            return true;
        }
    }
    
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 4, 3, 5, 6 };
        int[] c = { 1, 2, 3, 4, 5, 6 };
        int[] d = { 1, 2, 3, 4, 5, 6 };
        
        StdOut.println(eq(a, b)); // false
        StdOut.println(eq(b, c)); // false
        StdOut.println(eq(c, d)); // true
        StdOut.println(eq(d, c)); // true
        StdOut.println(eq(b, d)); // false
    }
}