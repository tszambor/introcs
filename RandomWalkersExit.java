// Exercise 1.4.33

public class RandomWalkersExit
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        int[][] positions = new int[2][N]; // table of initial walker positions
        boolean[] exitCriteria = new boolean[N];

        boolean[][] touched = new boolean[N][N];
        
        int sumTouched = 0;
        
        // initialize the random walkers positions
        for (int i = 0; i < N; i++)
        {
            positions[0][i] = N/2;
            positions[1][i] = N/2;
            
            if (!touched[positions[1][i]][positions[0][i]])
            {
                touched[positions[1][i]][positions[0][i]] = true;
                sumTouched++;
            }
        }
        
        int sumRounds = 0;
        
        int exitCriteriaSum = 0;
        
        while (exitCriteriaSum < N && sumTouched < N*N)
        {
            for (int i = 0; i < N; i++)
            {
                double move = Math.random();
            
                if (move < 0.25)
                {
                    if (positions[0][i] < N-1)
                        positions[0][i]++; // x++
                }
                else
                    if (move < 0.5)
                {
                    if (positions[0][i] > 0)
                        positions[0][i]--; // x--
                }
                else if (move < 0.75)
                {
                    if (positions[1][i] < N-1)
                        positions[1][i]++; // y++
                }
                else
                {
                    if (positions[1][i] > 0)
                        positions[1][i]--; // y--
                }

                    
                if (!touched[positions[1][i]][positions[0][i]])
                {
                    touched[positions[1][i]][positions[0][i]] = true;
                    sumTouched++;
                }
            }
            
            sumRounds++;
        }
        
        // System.out.println(exitCriteriaSum);
        // System.out.println(sumTouched);
        System.out.println(sumRounds);
    }
}
        