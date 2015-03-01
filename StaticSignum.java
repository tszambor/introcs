// Exercise 2.1.12
// September 2014 edition

public class StaticSignum {
    public static int signum(int N) {
        if (N > 0)
            return 1;
        else if (N == 0)
            return 0;
        else return -1;
    }
    
    public static void main(String[] args) {
        StdOut.println(signum(82));
        StdOut.println(signum(1));
        StdOut.println(signum(0));
        StdOut.println(signum(-1024));
    }
}