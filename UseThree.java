public class UseThree
{
    public static void main(String[] args)
    {
        if (args.length >= 3) {
            System.out.print("Hi ");
            System.out.print(args[2] + ", " + args[1] + ", and " + args[0]);
            System.out.println(". How are you?");
        } else {
            System.out.println("Not enough arguments for the program to continue.");
        }
    }
}