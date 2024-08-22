import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int n = scanner.nextInt();
        
        int spaces = 0;
        for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= n-i+1; j++) {
              System.out.print("*");
          }
          for (int j = 1; j <= spaces; j++) {
              System.out.print(" ");
          }
          for (int j = 1; j <= n-i+1; j++) {
              System.out.print("*");
          }
          System.out.println();
          spaces += 2;
        }
        
        spaces = 2*n-2;
        for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }
          for (int j = 1; j <= spaces; j++) {
              System.out.print(" ");
          }
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }
          System.out.println();
          spaces -= 2;
        }
        scanner.close();
    }
}