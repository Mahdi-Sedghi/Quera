import java.util.Scanner;

public class JamFootballi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            int pH = scanner.nextInt();
            int e = scanner.nextInt();
            int p = scanner.nextInt();
            int eH = scanner.nextInt();

            if (pH + p > e + eH) {
                System.out.println("perspolis");
            } else if (pH + p < e + eH) {
                System.out.println("esteghlal");
            } else {
                if (p > e) {System.out.println("perspolis");} else if (e > p) {System.out.println("esteghlal");} else {System.out.println("penalty");}
            }
        }
    }
}
