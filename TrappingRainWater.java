import java.util.ArrayList;

class Solution {
    public static void main(String[] args)
    {
        int[] TestCase = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1, 0};

        System.out.println("Result = " + trap(TestCase));
    }

    public static int trap(int[] height) {
        int total = 0, current = 0;
        
        int highest = 0, lowest = 0;
        
        // any elements on the list?
        if (height.length > 0)
        {
            highest = height[current];
            lowest = highest;
            
            current++;
        } else {
            return 0;
        }
        
        // prepare the subtotal array for use
        int[] subtotal = new int[100000];
        int top = 0;
        
        while (current < height.length)
        {
            int actual = height[current];
            
            if (actual < highest)
            {
                for(int i=actual; i<highest; i++)
                {
                    subtotal[i] += 1;
                }

                top = highest;
                
                // now totalize those that we can already
                if (actual > lowest)
                {
                    for (int i=lowest; i<actual; i++)
                    {
                        System.out.println("Adding lower level " + subtotal[i] + " at position " + current);
                        total += subtotal[i];
                        subtotal[i] = 0;
                    }
                    
                    lowest = actual;
                } else {
                    lowest = actual;
                }
            } else {
                for (int i=0; i<top;i++)
                {
                    System.out.println("Found bigger level, adding " + subtotal[i] + " at position " + current);
                    total += subtotal[i];
                    subtotal[i] = 0;
                }

                top = 0;
                
                highest = actual;
                lowest = actual;
            }
            
            current++;
        }
        
        return total;
    }
}