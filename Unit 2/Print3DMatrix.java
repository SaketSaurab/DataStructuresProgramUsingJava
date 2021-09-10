import java.util.Scanner;

public class Print3DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][][]arr3d  = new int[n][n][n];
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                for (int l = 0; l < n; l++) {
                    arr3d[j][k][l] = sc.nextInt();

                }
            }
        }

    }
}
