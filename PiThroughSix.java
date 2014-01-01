// Exercise 1.3.16

public class PiThroughSix
{
    public static void main(String[] args)
    {
        int N = 1000000;
        double sum = 0.0;
        
        // I did select the option d, because:
        // a. 1 / (i*i): i*i will be bigger than int and will distort the result, which would also remain int anyway
        // b. 1.0 / i*i: the sequence of operations is wrong
        // c. 1.0 / (i*i): almost okay, the (i*i) is still cut as an int
        // d. 1 / (1.0*i*i): should be fine
        
        for (int i = 1; i <=N; i++)
            sum += 1 / (1.0*i*i);
        
        System.out.println(sum);
        System.out.println(sum*6.0); // this would be pi squared
        System.out.println(Math.sqrt(sum*6.0)); // this would be our pi
        System.out.println(Math.PI);
    }
}