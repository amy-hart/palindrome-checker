
public class PalindromeChecker {

    public boolean isPalindrome(String word) {
        if(word==null){
            return false;
        }
        String sanitizedWord = word.toLowerCase().replaceAll("\\W","");
        return new StringBuffer(sanitizedWord).reverse().toString().equals(sanitizedWord);
    }
}
