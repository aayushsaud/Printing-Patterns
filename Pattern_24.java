import java.util.Scanner;

public class Pattern_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
              for (int k = 1; k <= n-i+1; k++) {
                  System.out.print(j + " ");
              }
            }
            System.out.print("$");
          }
        scanner.close();
    }
}
