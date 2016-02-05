
public class PalindromeChecker {

    public boolean isPalindrome(String word) {
        if (word == null){
            return false;
        }

        String sanitized = word.toLowerCase().replaceAll("\\W", "");

        int midPoint = sanitized.length() / 2 -1;
        int x = sanitized.length()-1;
        for(int i=0; i<=midPoint; i++){
            if(sanitized.charAt(i) != sanitized.charAt(x)){
                return false;
            }
            x -= 1;
        }

        return true;
    }
}
