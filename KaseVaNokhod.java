import java.util.Scanner;

public class KaseVaNokhod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        int ans = 1;
        for (int i = 0; i < num; i++) {
            int c = scanner.nextInt();
            int t = scanner.nextInt();

            if (c == ans) {
                ans = t;
            } else if (t == ans) {
                ans = c;
            }
        }
        System.out.println(ans);
    }
}
/*
* never any person didnt read this but i want to notice about my issue to understand question
* i miss something and it is this --->>>
* "i forget if nokhod is in right cup and magician change them ,our nokhod go to left cup"
* */