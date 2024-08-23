import java.util.Scanner;

public class Pattern_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern string: ");
        String str = scanner.nextLine();
        
        int n = str.length();
        int q = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(".");
            }
            System.out.print(str.substring(0, q));
            if(q < n) q++;
            System.out.println();
        }
        scanner.close();
    }
}