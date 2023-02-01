import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String[] strings = str.split(" ");
        String longest = strings[0];

        for (String string : strings) {
            if (longest.length() < string.length()) {
                longest = string;
            }
        }
        System.out.println(longest);
    }
}

