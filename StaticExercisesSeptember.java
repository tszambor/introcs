public class StaticExercisesSeptember {
    public static int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    
    public static double max3(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }
    
    public static boolean odd(boolean a, boolean b, boolean c) {
        int sum = 0;
        
        if (a) sum++;
        if (b) sum++;
        if (c) sum++;
        
        if ((sum % 2) == 0)
            return false;
        else
            return true;
    }
    
    public static boolean majority(boolean a, boolean b, boolean c) {
        return (a && b) || (a && c) || (b && c);
    }
    
    public static void main(String[] args) {
        // test the integer max3() static method
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        StdOut.println(max3(a, b, c));
        
        double d = Double.parseDouble(args[3]);
        double e = Double.parseDouble(args[4]);
        double f = Double.parseDouble(args[5]);
        
        StdOut.println(max3(d, e, f));
        
        // now let us test the boolean checking
        StdOut.println("Testing majority()");
        
        StdOut.println(majority(true, false, false)); // should be false
        StdOut.println(majority(false, false, true)); // should be false
        StdOut.println(majority(true, false, true)); // should be true
        StdOut.println(majority(false, true, true)); // should be true
        StdOut.println(majority(true, true, true)); // should be true
        
        // let us test odd
        StdOut.println("Testing odd()");
        
        StdOut.println(odd(true, true, true)); // should be true
        StdOut.println(odd(false, true, true)); // should be false
        StdOut.println(odd(false, true, false)); // should be true
        StdOut.println(odd(false, false, false)); // should be false
        StdOut.println(odd(true, false, true)); // should be false
    }
}
