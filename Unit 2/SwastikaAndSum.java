import java.util.Scanner;
public class SwastikaAndSum{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < b; j++) {
            sum2 = sum2 + arr[a / 2][j];
        }
        for (int i = 0; i < a / 2; i++) {
            sum2 = sum2 + arr[0][i];
        }
        for (int i = a - 1; i > a / 2; i--) {
            sum2 = sum2 + arr[i][b - 1];
        }

        for (int i = b - 1; i > b / 2; i--) {
            sum1 = sum1 + arr[0][i];
        }
        for (int i = 0; i < a; i++) {
            sum1 = sum1 + arr[i][b/2];
        }
        for (int i = 0; i < b / 2; i++) {
            sum1 = sum1 + arr[a - 1][i];
        }
        int abs=sum1-sum2;
        System.out.println(abs);
    }
}