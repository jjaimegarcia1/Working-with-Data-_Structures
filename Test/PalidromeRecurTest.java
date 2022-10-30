import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class PalidromeRecurTest {
    @Test
    public void testSimple(){
        String s="aba";
        assertTrue(InClass_Palidrome_9_13.isPalinRecur(s));
    }
    @Test
    public void testEvenChar(){
        String s ="abba";
        assertTrue(InClass_Palidrome_9_13.isPalinRecur(s));
    }
    @Test
    public void testNotPlali(){
        String s ="abc";
        assertFalse(InClass_Palidrome_9_13.isPalinRecur(s));
    }
    @Test
    public void testOne(){
        String s ="a";
        assertTrue(InClass_Palidrome_9_13.isPalinRecur(s));
    }
}
