import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String temp;

        if(string.length() % 2 == 0) {
            System.out.println(string.substring(0, string.length()/2 - 1) +
                    string.substring((string.length()-1)/ 2 + 2));
        } else {
            System.out.println(string.substring(0, string.length()/2) +
                    string.substring((string.length()-1)/ 2 + 1));
        }
    }
}