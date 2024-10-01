import java.util.HashSet;
import java.util.Scanner;

public class Tcs2 {

    // Method to find missing letters
    public static String findMissingLetters(String str) {
        // Create a set to store the letters found in the string
        HashSet<Character> letters = new HashSet<>();

        // Convert the input string to lowercase and check each character
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            // Add only alphabetic characters to the set
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
        }

        // StringBuilder to store missing letters
        StringBuilder missingLetters = new StringBuilder();

        // Check for missing letters from 'a' to 'z'
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!letters.contains(ch)) {
                missingLetters.append(ch);
            }
        }

        // If no letters are missing, return "0", else return the missing letters
        return missingLetters.length() == 0 ? "0" : missingLetters.toString();
    }

    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a sentence
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Call the method to find missing letters and print the result
        String result = findMissingLetters(sentence);
        System.out.println(result);  // Output will be 0 if all letters are present

        // Close the scanner
        scanner.close();
    }
}