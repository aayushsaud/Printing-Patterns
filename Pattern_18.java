import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int ch = 'A'+n-1;
            for (int j = i; j >= 1 ; j--) {
                System.out.print((char)ch + " ");
                ch--;
            }
            System.out.println();
          }
        scanner.close();
    }
}