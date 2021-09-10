import java.util.Scanner;

public class PowerOf2 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=1;
            if (((~a) & 1) == 1) {

                System.out.println("True");
            }
            else System.out.println("False");

            }
        }
    }