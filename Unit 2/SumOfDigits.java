import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int sum = 0;
            int rem = 0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                {
                    for (int k = 0; k < n; k++) {
                        while (arr[j] > 0) {
                            rem = arr[j] % 10;
                            sum = sum + rem;
                            arr[j] = arr[j] % 10;
                        }
                        System.out.println(sum);
                    }
                }
            }
        }
    }
}