import java.util.Scanner;

public class FaultyDirection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        for (int i=0;i<a.length();i++){
            for (int j=0;j<b.length();j++){
                if (i!=j){
                    System.out.println(i);
                }
            }
        }
    }
}
