// Exercise 1.5.32

public class Clock
{
    public static void main(String[] args)
    {
        int sec = 0, min = 10, hour = 10;
        
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        
        StdDraw.setPenRadius(.005);
        
        while(true)
        {
            StdDraw.clear();
            
            StdDraw.setPenColor(StdDraw.BLACK);
            
            StdDraw.circle(0.0, 0.0, 1.0);
            
            if (sec > 59)
            {
                sec %= 60;
                min++;
            }
            
            if (min > 59)
            {
                min %= 60;
                hour++;
            }
            
            if (hour > 11)
                hour %= 12;
                
            StdDraw.line(0.0, 0.0, .9 * Math.sin(2.0 * Math.PI * min / 60.0), .9 * Math.cos(2.0 * Math.PI * min / 60.0));
            
            StdDraw.setPenColor(StdDraw.GRAY);
            
            StdDraw.line(0.0, 0.0, .6 * Math.sin(2.0 * Math.PI * hour / 12.0), .6 * Math.cos(2.0 * Math.PI * hour / 12.0));
            
            StdDraw.setPenColor(StdDraw.RED);
            
            StdDraw.line(0.0, 0.0, .9 * Math.sin(2.0 * Math.PI * sec / 60.0), .9 * Math.cos(2.0 * Math.PI * sec / 60.0));
            
            sec++;
            
            StdDraw.show(1000);
        }
    }
}