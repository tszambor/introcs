// Exercise 1.3.8

public class PrintIntegers
{
    public static void main(String[] args)
    {
        for(int i = 1000; i <= 2000; i += 5)
            if (i % 2000 == 0)
                System.out.println(i);
            else System.out.println(i + "\t" + (i+1) + "\t" + (i+2) + "\t" +
                               (i+3) + "\t" + (i+4));
    }
}