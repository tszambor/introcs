// Exercise 2.1.11

public class StaticLgN {
        
    public static int lgN(int N) {
        if (N > 0) {
            int ret = 0;
            
            while (N > 1) {
                N /= 2;
                ret++;
            }
            
            return ret;
        } else {
            return -1;
        }
    }
    
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        
        StdOut.println(lgN(N));
    }
}