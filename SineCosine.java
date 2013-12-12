public class SineCosine
{
    public static void main(String[] args)
    {
        double theta = Double.parseDouble(args[0]);
        
        System.out.println(Math.sin(theta)*Math.sin(theta) + Math.cos(theta)*Math.cos(theta));
    }
}