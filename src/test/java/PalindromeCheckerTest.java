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
    public void test() {
        assertTrue(palindromeChecker.check(null));
    }
}
