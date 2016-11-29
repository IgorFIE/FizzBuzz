package main;

/**
 * Created by pacifist on 24-11-2016.
 */
public class Palindrome {
    public boolean isPalindrome(String str) {

        if(str == null) return false;

        String reverse = "";

        for(int i = 1; i <= str.length(); i++){
            reverse += str.charAt(str.length()-i);
        }

        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) != reverse.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
