import java.util.Scanner;
public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int vowelCount = countVowels(input);
        System.out.println("The number of vowels in the string is: " + vowelCount);
        scanner.close();
    }
    public static int countVowels(String str) {
        int count = 0;
        // Convert the string to lowercase to handle case-insensitivity
        str = str.toLowerCase();

        // Loop through each character in the string
        for (char ch : str.toCharArray()) {
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
