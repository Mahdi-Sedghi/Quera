import java.util.Scanner;

public class RoberoDarMetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
//        scanner.nextLine();
        String line2 = scanner.nextLine();
        int ans = 0;
        for (int i = 0; i < line1.length(); i += 2) {
            if (line1.charAt(i) == line2.charAt(i) && line1.charAt(i) == '1') {
                ans++;
            }
        }
        System.out.println(ans);
    }
}