import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if(isPalindrome(str)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

    public static boolean isPalindrome(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            newStr = str.charAt(i) + newStr;
        }

        return newStr.equals(str);
    }
}
