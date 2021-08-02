import java.util.Scanner;
public class MatrixCompetetion{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum1=0;
        int sum2=0;
        int [][]arr1=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=sc.nextInt();
                sum1=sum1+arr1[i][j];
            }
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        int [][]arr2=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr2[i][j]=sc.nextInt();
                sum2=sum2+arr2[i][j];
            }
        }
        if(sum1>sum2){
            System.out.println(sum1);
        }
        else System.out.println(sum2);
    }
}