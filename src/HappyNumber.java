import java.util.Scanner;

public class HappyNumber {
    public static  int happyNum(int num){
        int sum=0;
        int remainder=0;
        while (num>0){
            remainder=num%10;
            sum=sum+(remainder*remainder);
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
        int a=sc.nextInt();
        int b=a;
        while (b!=1&&b!=4){
            b=happyNum(b);
        }
        if (b==1){
            System.out.println("True");
        }
        else if (b==4){
            System.out.println("False");
        }
    }
}}
