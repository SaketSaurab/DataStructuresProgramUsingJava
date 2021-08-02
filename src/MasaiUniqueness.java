import java.util.Scanner;
public class MasaiUniqueness{
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){

                char a=str.charAt(i);
                char b=str.charAt(j);
                if	(b==a)
                    count++;
                System.out.print(b+","+a);
            }
            System.out.println();

        }
        if(count==1){
            System.out.println("Unique");}
        else
            System.out.println("No");
    }
}

//This program is not working properly
//There is some error in the logic ///
    
      