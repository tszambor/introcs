class Palindrome
{
  public static boolean isPalindrome(String s) {
        
        int l = 0, r = s.length() - 1;
        
        while (l <= r)
        {
            while (!Character.isLetterOrDigit(s.charAt(l)) && l < r)
            {
                System.out.println("Removing: '" + Character.toString(s.charAt(l)) + "'");
                l++;
            }
            
            while (!Character.isLetterOrDigit(s.charAt(r)) && l < r)
            {
                System.out.print("Removing: '" + Character.toString(s.charAt(r)) + "'");
                r--;
            }
            
            System.out.println("Position Left : " + l + " [" + Character.toString(s.charAt(l)) + "]");
            System.out.println("Position Right: " + r + " [" + Character.toString(s.charAt(r)) + "]");

            if (!Character.toString(s.charAt(l)).toLowerCase().equals(Character.toString(s.charAt(r)).toLowerCase()))
            {
                System.out.println(Character.toString(s.charAt(l)).toLowerCase());
                System.out.println(Character.toString(s.charAt(r)).toLowerCase());
                return false;
            } else {
                l++;
                r--;
            }
        }
        
        return true;
    }

    public static void main(String[] args)
    {
      System.out.println(isPalindrome("A0 man, a plan, a canal: Panam0a"));
    }
}