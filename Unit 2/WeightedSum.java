import java.util.Scanner;
public class WeightedSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                sum = sum + (arr[j] * (j + 1));
            }
            System.out.println(sum);
        }
    }
}