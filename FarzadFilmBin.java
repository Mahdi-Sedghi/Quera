import java.util.Scanner;

public class FarzadFilmBin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < num; i++) {
            String name = scanner.nextLine();
            String[] film = name.split(" ");
            fix(film);
            System.out.println();
        }
    }

    public static void fix(String[] film) {
        for (String word : film) {
            String ans = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            System.out.print(ans + " ");
        }
    }
}