import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class PalindromeCheckerTest {

    PalindromeChecker palindromeChecker;

    @Before
    public void beforeEachTest() throws Exception {
        palindromeChecker = new PalindromeChecker();
    }

    @Test
    public void checkNullInput() {
        assertFalse(palindromeChecker.isPalindrome(null));
    }

    @Test
    public void checkSingleLetter(){
        assertTrue(palindromeChecker.isPalindrome("a"));
    }

    @Test
    public void checkTwoDifferentLetters(){
        assertFalse(palindromeChecker.isPalindrome("ab"));
    }

    @Test
    public void checkTwoSameLetters(){
        assertTrue(palindromeChecker.isPalindrome("aa"));
    }

    @Test
    public void checkAThreeLetterValidPalindrome() throws Exception {
        assertTrue(palindromeChecker.isPalindrome("aba"));
    }

    @Test
    public void checkAThreeLetterInvalidPalindrome() throws Exception {
        assertFalse(palindromeChecker.isPalindrome("abb"));
    }

    @Test
    public void checkAFourLetterInvalidPalindrome() throws Exception {
        assertFalse(palindromeChecker.isPalindrome("abca"));
    }

    @Test
    public void checkAFourLetterValidPalindrome(){
        assertTrue(palindromeChecker.isPalindrome("boob"));
    }

    @Test
    public void checkAFiveLetterValidPalindrome(){
        assertTrue(palindromeChecker.isPalindrome("level"));
    }

    @Test
     public void checkAPhraseIsAValidPalindromicPhrase(){
        assertTrue(palindromeChecker.isPalindrome("race car"));
    }

    @Test
    public void checkAValidPalindromicSentence(){
        assertTrue(palindromeChecker.isPalindrome("Are we not drawn onward, we few, drawn onward to new era?"));
    }
}
