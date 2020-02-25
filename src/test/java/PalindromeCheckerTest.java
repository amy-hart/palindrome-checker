import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;


public class PalindromeCheckerTest {

    //visibility
    PalindromeChecker palindromeChecker;

    @Before
    public void beforeEachTest() throws Exception {
        palindromeChecker = new PalindromeChecker();
    }

    @Test
    public void palindromeCheckerReturnsTrueForSingleCharacterWords() {
        //inline
        String testCase = "a";

        boolean result = palindromeChecker.check(testCase);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void palindromeCheckerReturnsTrueForValidSingleWordsPalindromes() {

        String testCase = "civic";

        boolean result = palindromeChecker.check(testCase);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void palindromeCheckerReturnsFalseForInvalidSingleWordsPalindromes() {

        String testCase = "potato";

        boolean result = palindromeChecker.check(testCase);

        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void palindromeCheckerReturnsTrueForValidSingleWordsPalindromesAndIgnoresCasing() {

        String testCase = "Civic";

        boolean result = palindromeChecker.check(testCase);

        Assertions.assertThat(result).isTrue();
    }


    @Test
    public void palindromeCheckerReturnsTrueForValidMultiWordPalindromesA() {

        String testCase = "race car";

        boolean result = palindromeChecker.check(testCase);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void palindromeCheckerReturnsFalseForInvalidMultiWordPalindromesA() {

        String testCase = "hello world";

        boolean result = palindromeChecker.check(testCase);

        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void palindromeCheckerReturnsTrueForValidMultiWordPalindromesB() {

        String testCase = "Are we not drawn onward, we few, drawn onward to new era?";

        boolean result = palindromeChecker.check(testCase);

        Assertions.assertThat(result).isTrue();
    }
}
