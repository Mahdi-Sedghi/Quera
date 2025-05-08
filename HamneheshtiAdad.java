import java.util.Scanner;

public class HamneheshtiAdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num2 < num1) { int holder = num1; num1 = num2; num2 = holder; }
        for (int i = 2; i < num2; i++) {
            if ((num2 - num1)%i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}