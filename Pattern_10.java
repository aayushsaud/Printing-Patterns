import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= 2*n-1; i++) {
            int stars = i;
            if (i > n) {stars = 2*n-i;}
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
          }
        scanner.close();
    }
}