import java.util.Scanner;

public class StockItUp {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[]arr=new int[7];
        for (int i=0;i<7;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<7;i++){
            if (i==0){
                sum=sum+arr[0]*550;

            }
            if (i==1){
                sum=sum+arr[1]*240;
            }
            if (i==2){
                sum=sum+arr[2]*84;

            }
            if (i==3){
                sum=sum+arr[3]*159;
            }
            if (i==4){
                sum=sum+arr[4]*80;
            }
            if (i==5){
                sum=sum+arr[5]*160;

            }
            if (i==6){
                sum=sum+arr[6]*252;
            }
        }
        sum=sum*n;
        System.out.println(sum);

    }
}
