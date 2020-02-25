
public class PalindromeChecker {

    public boolean check(String word) {

        //still needed?
        if(word.length() == 1) {
            return true;
        }

        //reassigning? - just question-marks?
        word = word.toLowerCase().replaceAll(" ", "").replaceAll("\\?", "");
        //charArray?
        char [] wordArray = word.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();

        for (char character : wordArray) {
            stringBuilder.append(character);
        }

        String reversedWord = stringBuilder.reverse().toString();

        return word.equals(reversedWord);
    }
}
