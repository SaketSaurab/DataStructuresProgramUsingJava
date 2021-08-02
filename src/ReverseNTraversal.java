import java.util.Scanner;
/*

 */
public class ReverseNTraversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }
            for (int j = 0; j < n - 1; j++) {
                System.out.print(arr[j][0] + " ");
            }
        for (int j=0;j<n;j++){
            System.out.print(arr[n-1-j][j]+" ");
        }
            for (int j=1;j<n;j++){
                System.out.print(arr[j][n-1]+" ");
            }
            System.out.println();
        }
    }
}
