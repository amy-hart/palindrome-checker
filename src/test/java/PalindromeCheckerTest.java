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
    public void testWithEmptyString() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        assertFalse(palindromeChecker.check(""));
    }

    @Test
    public void testWithSingleCharacter() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        assertTrue(palindromeChecker.check("A"));
    }

    @Test
    public void testWordEvenAmountOfLetters() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        assertTrue(palindromeChecker.check("haah"));
    }

    @Test
    public void testWordEvenLettersCaseMixture () {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        assertTrue(palindromeChecker.check("HaHa"));
    }

    @Test
    public void testWordOddLetters() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        assertTrue(palindromeChecker.check("radar"));
    }

    @Test
    public void testPhrase() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        assertTrue(palindromeChecker.check("race car"));
    }

    @Test
    public void testPhraseWithCommas() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        assertTrue(palindromeChecker.check("Are we not drawn onward, we few, drawn onward to new era?"));
    }

}
