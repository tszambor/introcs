public class Play
{
    public static void main(String[] args)
    {
        System.out.println(Math.round(6.022e23));
        System.out.println(Math.pow(2.0, 64)/2.0);
        
        double testValue;
        
        testValue = 1.0/0.0;
        
        System.out.println(testValue);
        
        testValue += 100;
        
        System.out.println(testValue);
        
        testValue = testValue / 20.0;
        
        System.out.println(testValue);

        System.out.println(2 + "bc");
        System.out.println(2 + 3 + "bc");
        System.out.println((2 + 3) + "bc");
        System.out.println("bc" + (2 + 3));
        System.out.println("bc" + 2 + 3);
        
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));
        
        int a = Integer.MAX_VALUE;
        
        System.out.println(a);
        System.out.println(a+1);
        System.out.println(2-a);
        System.out.println(-2-a);
        System.out.println(2*a);
        System.out.println(4*a);
        System.out.println(8*a);
        
        double b = 3.14159;
        
        System.out.println(b);
        System.out.println(b+1);
        System.out.println(8 / (int) b);
        System.out.println(8 / b);
        System.out.println((int) (8/b));
        
        System.out.println(Math.sqrt(2) * Math.sqrt(2) == 2);
    }
}
