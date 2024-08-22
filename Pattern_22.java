import java.util.Scanner;

public class Pattern_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= 2*n-1; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
              int top = i-1;
              int left = j-1;
              int bottom = (2*n)-1-i;
              int right = (2*n)-1-j;
          
              int number = n - (Math.min(Math.min(top, bottom), Math.min(left, right)));
              System.out.print(number + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}