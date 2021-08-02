import java.util.Scanner;
public class DiamondTraversal{
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


        }
    }
}