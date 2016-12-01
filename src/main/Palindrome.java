package main;

/**
 * Created by pacifist on 24-11-2016.
 */
public class Palindrome {
    public boolean isPalindrome(String str) {

        if(str == null) return false;

        return isEqualsToReverse(str,reverseString(str));
    }

    private String reverseString(String str){
        String reverse = "";

        for(int i = 1; i <= str.length(); i++){
            reverse += str.charAt(str.length()-i);
        }

        return reverse;
    }

    private boolean isEqualsToReverse(String str, String reverse){
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) != reverse.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
