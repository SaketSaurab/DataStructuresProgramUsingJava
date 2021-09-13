import java.util.Scanner;

public class SinchanLoveOfCities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int d, z;
            int a = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[a];
            for (int j = 0; j < a; j++) {
                arr[j] = sc.nextInt();
            }
             {
                 if (a>1) {
                     for (int k = 0; k < a-1; k++) {

                         d = arr[k] - arr[k + 1];

                         z = d * q;
                         System.out.println(z);
                     }

                 }
                 else System.out.println("0");
             }

            }
        }
    }

