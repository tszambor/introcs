// Exercise 2.1.25
// based on
// Exercise 1.4.35
// result checked against the book Monty Hall Problem, and it matches! :)

public class BirthdayProblemDeluxe
{
    public static int uniformBirthday()
    {
        return (int) (Math.random() * 365);
    }
    
    public static int birthdayProblem(int N, int noPeople)
    {
        int sum = 0;
        
        for (int i = 0; i < N; i++)
        {
            int[] birthdays = new int[365];
            int people = 0;
            boolean finish = false;
            
            while (!finish)
            {
                int birthday = uniformBirthday();
                people++;
                
                birthdays[birthday]++;
                
                if (birthdays[birthday] == noPeople)
                    finish = true;
            }
            
            sum += people;
        }
        
        return sum / N;
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]); // number of people with the same birthday
        
        int M = Integer.parseInt(args[1]); // number of experiments to be performed
        
        System.out.println(birthdayProblem(M, N));
    }
}