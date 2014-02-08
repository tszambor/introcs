// Exercise 1.4.35

public class BirthdayProblem
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        int sumPop = 0;
        
        for (int i = 0; i < N; i++)
        {
            boolean[] roomBirthdays = new boolean[365];
            
            int roomPop = 0;
            
            boolean finish = false;
            
            while (!finish)
            {
                int birthday = (int) (Math.random() * 365);
                
                roomPop++;
                
                if (!roomBirthdays[birthday])
                    roomBirthdays[birthday] = true;
                else
                    finish = true;
            }
            
            sumPop += roomPop;
        }
        
        System.out.println(sumPop / N);
    }
}