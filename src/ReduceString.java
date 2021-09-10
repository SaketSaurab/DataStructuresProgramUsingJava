import java.util.*;

public class ReduceString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a;
        a=sc.next();
        int b=a.length();
        for (int i=1;i<b-1;i++){
            if (a.charAt(i)!=a.charAt(i-1)){
                System.out.print(a.charAt(i));
            }
            else System.out.println("Empty");

        }
    }
}
