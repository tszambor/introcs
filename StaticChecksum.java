// Exercise 2.1.15
// September 2014 edition

// Initially my assumption for this program was to check the checksum, get the rest of it mod 10 and add this value
// as the last digit, but then I realized that what was expected was rather to calculate the last digit so, that
// the checksum will be 0.

public class StaticChecksum {
    
    public static int f(int d) {
        
        d *= 2;
        
        return (d / 10) + (d % 10);
    }
    
    public static void main(String[] args) {
        int account = Integer.parseInt(args[0]);
        
        int[] digits = new int[11];
        
        for (int i = 9; i >= 0; i--) {
            int pow = (int) Math.pow(10, i);
            
            digits[9-i] = account / pow;
            
            account -= digits[9-i] * pow;
        }
        
        for (int i = 0; i < 10; i++)
            StdOut.print(digits[i]);
        StdOut.println();
        
        int checksum = 0;
        
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                checksum += digits[i];
            else
                checksum += f(digits[i]);
        }
        
        StdOut.println("Checksum is: " + checksum);
        
        digits[10] = 10 - checksum % 10;
        
        for (int i = 0; i < 11; i++)
            StdOut.print(digits[i]);
        StdOut.println();
        
    }
}