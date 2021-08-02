import java.util.Scanner;

public class MasaiAirlline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            {
                for (int j = 0; j < n; j++) {
                    arr2[j] = sc.nextInt();
                    {
                            if (arr[i] <= 15 && arr2[j] <= 7) {
                                System.out.println("Boarding");
                            }
                                    else System.out.println("Stop");
                                }
                            }

                    }

        }
    }
}