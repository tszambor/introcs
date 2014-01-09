// Exercise 1.3.43

public class Chaos
{
    public static void main(String[] args)
    {
        double r = Double.parseDouble(args[0]);
        
        double population = 0.01;
        
        double populationStep = population;
        
        long t = 0;
        
        do
        {
            population = populationStep;
            
            populationStep = r * population * (1 - population);
            
            for(int i=0; i<(int)(populationStep*10);i++)
                System.out.print("*");
            
            System.out.println();
                        
            t++;
        }
        while (populationStep > 0 && population < 1 && population != populationStep);
        
        System.out.println("Algorithm finished at time " + t + " with population " + population);
    }
}