import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        int result = 0;

        for (int i = 0; i < romanNumeral.length(); i++) {
            if (i < romanNumeral.length() - 1 && getValue(romanNumeral.charAt(i)) < getValue(romanNumeral.charAt(i + 1))) {
                result -= getValue(romanNumeral.charAt(i));
            } else {
                result += getValue(romanNumeral.charAt(i));
            }
        }

        System.out.println("Integer value: " + result);
    }

    public static int getValue(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}

