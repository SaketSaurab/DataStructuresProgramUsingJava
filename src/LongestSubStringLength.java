import java.util.Scanner;

public class LongestSubStringLength {
    static  int longestSubString(String str){
        int a=str.length();
        int maxLength=1;
        int starting=0;
        for (int i=0;i<str.length();i++){
            for (int j=i;j<str.length();j++){
                int flag=1;
                for (int k=0;k<(j-i+1)/2;k++)
                    if (str.charAt(i+k)!=str.charAt(j-k))flag=0;


                    if (flag!=0&&(j-i+1)>maxLength){
                        starting=i;
                        maxLength=j-i+1;
                }
            }
        }
        return  maxLength;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(longestSubString(str));
    }
}
