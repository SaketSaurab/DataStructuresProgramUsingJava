import java.util.Scanner;

/*Given a n by n matrix.
You have to rotate the elements of each ring
of the matrix in the clockwise
direction one place.
*/
public class RotateElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int [][]arr=new int[a][a];
        for ( int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                arr[i][j]=sc.nextInt();
            }
        }

    }
}
