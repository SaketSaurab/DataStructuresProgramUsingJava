import java.util.Scanner;
public class RunningSumOfAnArray{
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int a=sc.nextInt();
            int []arr=new int[a];
            int sum=0;
            for(int j=0;j<a;j++){

                arr[j]=sc.nextInt();

                    sum=sum+arr[j];


            System.out.print(sum+" ");

        }
        System.out.println();
    }
}}