
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int firstHalf = number / 1000;
        int secondHalf = number % 1000;

        int sumOfFirst = 0;
        int sumOfSecond = 0;

        for (int i = 0; secondHalf > 0; i++) {
            sumOfSecond += secondHalf % 10;
            secondHalf /= 10;
        }

        for (int i = 0; firstHalf > 0; i++) {
            sumOfFirst += firstHalf % 10;
            firstHalf /= 10;
        }

        if(sumOfSecond == sumOfFirst) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }


    }
}

