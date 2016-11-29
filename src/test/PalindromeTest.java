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
    public void trueTest(){
        assertEquals(true,pali.isPalindrome("mannam"));
    }

    @Test
    public void trueTest2(){
        assertEquals(true,pali.isPalindrome("manam"));
    }

    @Test
    public void trueTest3(){
        assertEquals(true,pali.isPalindrome("JeSuimanammanamiuSeJ"));
    }

    @Test
    public void emptyTest(){
        assertEquals(true,pali.isPalindrome(""));
    }

    @Test
    public void wrongTest(){
        assertEquals(false,pali.isPalindrome("mnam"));
    }

    @Test
    public void nullTest(){
        assertEquals(false,pali.isPalindrome(null));
    }


}
