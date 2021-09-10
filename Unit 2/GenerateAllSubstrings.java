import java.util.Scanner;

public class GenerateAllSubstrings {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int t=str.nextInt();
        for (int k=0;k<t;k++){
        int n=str.nextInt();
        String a=str.next();
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                System.out.println(a.substring(i,j));
            }
        }

    }}
}
