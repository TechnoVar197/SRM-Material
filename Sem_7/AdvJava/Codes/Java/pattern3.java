import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j+" ");
            }
            for (int j=2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
