package For_question;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("please enter the number of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = n, b = n, c = i*2;
            while ((a - i) >= 1) {
                System.out.print(" ");
                --a;
            }
            while ((c-1) > 1) {
                System.out.print("*");
                --c;
            }
            System.out.println("*");
            while ((b - i) >= 1) {
                System.out.print(" ");
                --b;
            }
            System.out.println("");
        }
    }
}
