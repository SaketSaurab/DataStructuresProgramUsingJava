import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int position = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    position = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[position];
            arr[position] = temp;
        }


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}