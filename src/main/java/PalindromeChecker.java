
public class PalindromeChecker {

    public boolean check(String word) {

        if(word.length() == 1) {
            return true;
        }

        word = word.toLowerCase().replaceAll(" ", "").replaceAll("\\?", "");
        char [] wordArray = word.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();

        for (char character : wordArray) {
            stringBuilder.append(character);
        }

        String reversedWord = stringBuilder.reverse().toString();

        return word.equals(reversedWord);
    }
}
