import java.util.Scanner;
/*
You are given a matrix of size nxn.
Find the N traversal of the matrix.

 */
public class NTraversalOfTheMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int [][]arr=new int[n][n];
            for (int j=0;j<n;j++){
                for (int k=0;k<n;k++){
                    arr[j][k]=sc.nextInt();
                }
            }
            for (int j=n-1;j>0;j--){
                System.out.print(arr[j][0]+" ");
            }
            for (int j=0;j<n;j++){
                System.out.print(arr[j][j]+" ");
            }
            for (int j=n-2;j>=0;j--){
                System.out.print(arr[j][n-1]+" ");
            }
            System.out.println();

        }

    }
}
