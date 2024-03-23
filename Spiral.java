public class Spiral
{
    public static boolean isPrime(long number)
    {
        boolean prime = true;
        
        for (long i = 2; i <= number / i; i++)
        {
            if (number % i == 0)
            {
                prime = false;
                break;
            }
        }
        
        return prime;
    }
    
    public static void main(String[] args)
    {
        
        // Draw a spiral on the screen
        final int SCALE = 200;
        
        StdDraw.setXscale(0, SCALE);
        StdDraw.setYscale(0, SCALE);
        StdDraw.setPenRadius(0.005);
        
        int x = 0, y = 0;
        
        int step = 1;
        int dirX = 1, dirY = 1;
        
        // StdDraw.clear();
        
        long count = 1;
        int loops = 0;
        
        while (count <= SCALE * SCALE)
        {            
            if (loops % 2 == 0)
            {
                for (int j = 0; j < step; j++)
                {
                    if (isPrime(count))
                        StdDraw.setPenColor(StdDraw.BLACK);
                    else
                        StdDraw.setPenColor(StdDraw.WHITE);

                    StdDraw.point(x + SCALE / 2, y + SCALE / 2);
                    // StdDraw.show(5);
                    x += dirX;
                    count++;
                }
                
                dirX *= -1;
            }
            else
            {
                for (int j = 0; j < step; j++)
                {
                    if (isPrime(count))
                        StdDraw.setPenColor(StdDraw.BLACK);
                    else
                        StdDraw.setPenColor(StdDraw.WHITE);

                    StdDraw.point(x + SCALE / 2, y + SCALE / 2);
                    //StdDraw.show(5);
                    y += dirY;
                    count++;
                }
                
                dirY *= -1;
                step++;
            }
            
            loops++;
        }        
    }
}