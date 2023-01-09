package palindrome;

public class Palindrome {

    static boolean isPalindrome(String s){
        if (s.length() == 0)
            return true;
        if (s.length() == 1)
            return true;
        if (s.charAt(0) != s.charAt(s.length()-1))
            return false;
        return Palindrome.isPalindrome(s.substring(1,s.length()-1));
    }

}
