import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][]arr=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int i,k=0,l=0;
        int lastRow=m-1;
        int lastCol=n-1;
        while (k<=lastRow&&l<=lastCol) {
            for (i = l; i < lastCol; i++) {
                System.out.println(arr[k][i]);
                k++;
            }
            for (i = k; i < lastRow; i++) {
                System.out.println(arr[i][lastCol]);
                lastCol--;
            }


            if (k <= lastRow) {
                for (i = lastCol; i >= l; i--) {
                    System.out.println(arr[lastRow][i]);
                    lastRow--;
                }
            }
            if (l <= lastCol) {
                for (i = lastRow; i >= k; i--) {
                    System.out.println(arr[i][l]);
                }
            }


        }
    }


//    not working 
}
