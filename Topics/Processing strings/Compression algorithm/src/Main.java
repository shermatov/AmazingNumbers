import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        char char1 = string.charAt(0);
        int counter = 0;
        char charStore;

        for(int i = 0; i < string.length(); i++) {
            if(char1 == string.charAt(i)) {
                counter++;

            } else {
                System.out.print(char1 + "" + counter);
                 char1 = string.charAt(i);
                 counter = 1;
            }
        }
        System.out.print(char1 + "" + counter);
    }
}