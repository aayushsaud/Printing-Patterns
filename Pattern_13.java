import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int n = scanner.nextInt();
        
        int start = 1;
        for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print(start + " ");
              start += 1;
          }
          System.out.println();
        }
        scanner.close();
    }
}