// Exercise 1.3.6

public class Loops
{
    public static void main(String[] args)
    {
        int i, j;
        
        // a
        for (i = 0, j = 0; i < 10; i++) j += i;
        
        // I expect it to be the sum of 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9
        // so: 45
        
        System.out.println(j);
        
        // b
        for (i = 0, j = 1; i < 10; i++)  j += j;
        
        // Every loop doubles j, so actually the value should be 2^i, so 2^10 (1024?)
        
        System.out.println(j);
        
        // c
        for (j = 0; j < 10; j++) j += j;
        
        // Actually this is 2^n + 1 for each loop iteration except for 0, so
        // Iteration    Result
        // 0            1
        // 1            3
        // 3            7
        // 7            15 <-- End result, because it is bigger than 10
        
        System.out.println(j);
        
        // d
        for (i = 0, j = 0; i < 10; i++) j += j++;
        
        // Each iteration doubles j and adds one to the doubled result
        // 0: 1
        // 1: 3
        // 2: 7
        // 3: 15
        // 4: 31
        // 5: 63 (what we can see here is 2^(n+1) - 1
        // 1023?
        
        // Wrong!!! It is actually 0, the operation does not take ++ into account
        // At all!!!
                
        System.out.println(j);
    }
}