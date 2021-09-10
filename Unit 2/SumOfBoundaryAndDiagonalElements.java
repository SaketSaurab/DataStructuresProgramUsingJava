import java.util.Scanner;
public class SumOfBoundaryAndDiagonalElements{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int sum=0;
        int [][]arr=new int[a][a];
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<a-1;i++){
            sum=sum+arr[0][i];
        }
        for(int i=1;i<a-1;i++){
            sum=sum+arr[a-1][i];

        }
        for(int i=1;i<a-1;i++){
            sum=sum+arr[i][0];

        }
        for(int i=1;i<a-1;i++){
            sum=sum+arr[i][a-1];

        }

        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if((i==j)||(i+j==a-1)){
                    sum=sum+arr[i][j];
                }
            }

        }



        System.out.print(sum);

    }
}
    
    