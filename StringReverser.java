import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String reversedStr = new StringBuilder(str).reverse().toString();

        System.out.println("The reversed string is: " + reversedStr);
    }
}
