public class RGBtoCMYK
{
    public static void main(String[] args)
    {
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        
        double C, M, Y, K;
        
        if (r == 0 && g == 0 && b == 0)
        {
            K = 1.0;
            C = 0.0;
            M = 0.0;
            Y = 0.0;
        }
        else
        {
            double rd = (double) r / 255.0;
            double gd = (double) g / 255.0;
            double bd = (double) b / 255.0;
            
            double w = Math.max(rd, Math.max(gd, bd));
            
            C = (w - rd) / w;
            M = (w - gd) / w;
            Y = (w - bd) / w;
            K = 1 - w;
        }
        
        System.out.println("C: " + C + " M: " + M + " Y: " + Y + " K: " + K);        
    }
}