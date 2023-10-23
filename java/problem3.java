import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        if (isPangram(sentence)) {
            System.out.println("The input is a Pangram.");
        } else {
            System.out.println("The input is not a Pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        Set<Character> charSet = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                charSet.add(c);
            }
        }
        return charSet.size() == 26; // There are 26 letters in the English alphabet.
    }
}
