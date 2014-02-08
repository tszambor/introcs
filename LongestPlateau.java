// Exercise 1.4.21

public class LongestPlateau
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        int[] data = new int[N];
        
        for (int i = 0; i < N; i++)
            data[i] = (int) (Math.random() * 10);
        
        int currentPos = 0, currentLength = 0;
        int maxPos = 0, maxLength = 0;
        
        int lastVal = data[0];
        
        for (int i = 1; i < N; i++)
        {
            if (data[i] > lastVal)
            {
                currentPos = i;
                currentLength = 1;
            } else if (data[i] == lastVal && currentLength > 0)
                currentLength++;
            else if (data[i] < lastVal && currentLength > 0)
            {
                if (currentLength > maxLength)
                {
                    maxLength = currentLength;
                    maxPos = currentPos;                   
                }

                currentLength = 0;
                currentPos = 0;
            }
            
            lastVal = data[i];
        }
        
        if (maxLength > 1)
        {
            System.out.println("Max plateau length " + maxLength);
            
            for (int i = maxPos - 1; i <= maxPos + maxLength; i++)
                System.out.println(data[i]);
        }
    }
}