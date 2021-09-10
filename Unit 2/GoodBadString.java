import java.util.Scanner;
public class GoodBadString{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String str= sc.next();
            int a=str.length();


/*            for (int j=0;j<a-1;j++){
                if(charAt(int j))==(char charAt(int j+1)){
                {
                    continue;
                }
        else
                System.out.print(charAt[j]);
            }
                */

            System.out.print(str);
        }

    }
}