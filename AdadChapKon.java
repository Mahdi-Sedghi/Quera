import java.util.Scanner;

public class AdadChapKon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        for (int i = 0; i < num.length(); i++) {
            chap(num.charAt(i));
            System.out.println();
        }
    }

    public static void chap(char num) {
        int number = num - '0';
        System.out.print(number + ": ");
        for (int i = 0; i < number; i++) {
            System.out.print(number);
        }
    }
}