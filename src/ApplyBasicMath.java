import java.util.Scanner;

public class ApplyBasicMath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            sum=sum+arr[i];

        }
        System.out.println(sum);
        for (int i=0;i<n;i++) {
            while (sum % 7 != 0) {
                sum = sum - arr[i];


            }
            System.out.println(arr[i]);

        }
       }
}
