package test;

import main.Palindrome;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pacifist on 24-11-2016.
 */
public class PalindromeTest {

    private Palindrome pali;

    @Before
    public void before(){
        pali = new Palindrome();
    }

    @Test
    public void nullTest(){
        assertEquals(false,pali.isPalindrome(null));
    }

    @Test
    public void emptyStringTest(){
        assertEquals(true,pali.isPalindrome(""));
    }

    @Test
    public void onlyOneLetterTest(){
        assertEquals(true,pali.isPalindrome("n"));
    }

    @Test
    public void palindromeBigWordTest(){
        assertEquals(true,pali.isPalindrome("JeSuimanammanamiuSeJ"));
    }

    @Test
    public void wrongPalindromeTest(){
        assertEquals(false,pali.isPalindrome("mnam"));
    }


}
