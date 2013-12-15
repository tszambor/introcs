// Exercise 1.2.35

public class DragonCurves
{
    public static void main(String[] args)
    {
        String dc0 = "F";
        
        String dc1 = dc0 + "L" + dc0;
        
        String dc1rev = dc0 + "R" + dc0; // build reverse string
        
        String dc2 = dc1 + "L" + dc1rev;
        
        String dc2rev = dc1 + "R" + dc1rev;
        
        String dc3 = dc2 + "L" + dc2rev;
        
        String dc3rev = dc2 + "R" + dc2rev;
        
        String dc4 = dc3 + "L" + dc3rev;
        
        String dc4rev = dc3 + "R" + dc3rev;
        
        String dc5 = dc4 + "L" + dc4rev;
        
        System.out.println(dc0);
        System.out.println(dc1);
        System.out.println(dc2);
        System.out.println(dc3);
        System.out.println(dc4);
        System.out.println(dc5);
        
    }
}