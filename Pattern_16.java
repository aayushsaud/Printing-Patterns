import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int n = scanner.nextInt();
        
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print(ch + " ");
          }
          System.out.println();
          ch++;
        }
        scanner.close();
    }
}