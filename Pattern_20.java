import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int n = scanner.nextInt();
        
        int spaces = 2*n-2;
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
          if(spaces>0) spaces -= 2;
        }
        
        
        for (int i = 1; i <= n-1; i++) {
            spaces +=2;
          for (int j = 1; j <= n-i; j++) {
              System.out.print("*");
          }
          for (int j = 1; j <= spaces; j++) {
              System.out.print(" ");
          }
          for (int j = 1; j <= n-i; j++) {
              System.out.print("*");
          }
          System.out.println();
        }
        scanner.close();
    }
}