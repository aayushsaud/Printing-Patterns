import java.util.Scanner;

public class Pattern_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*n-(2*i-1); j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
          }
        scanner.close();
    }
}