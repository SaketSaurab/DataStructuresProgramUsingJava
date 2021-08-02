import java.util.Scanner;
public class RotateBy90ClockWise{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int[][]arr=new int[a][a];
            for(int j=0;j<a;j++){
                for(int k=0;k<a;k++){
                    arr[j][k]=sc.nextInt();
                }
            }
            for(int j=a-1;j>=0;j--){
                for(int k=0;k<a;k++){
                    System.out.print(arr[j][k]+" ");
                }
                System.out.println();

            }
        }
    }

}
