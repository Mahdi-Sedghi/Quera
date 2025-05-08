package Quera;
import java.util.Scanner;

public class BiMimAbolfazl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.indexOf("m") != -1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        scanner.close();
    }
    
}
