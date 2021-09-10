import java.util.Scanner;

public class HelpElevator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int []arr=new int[a];
        for (int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<a;i++){
            if (arr[i]<85){
                System.out.println("Enter");
            }
            else
                System.out.println("Beep");
        }
    }
}
