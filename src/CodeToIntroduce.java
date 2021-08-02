import java.util.Scanner;

public class CodeToIntroduce {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String name=str.next();
        String  gen=str.next();

       switch (gen){
           case "M":
           System.out.println("Hello Mr. "+name);
           break;
           case "F":
               System.out.println("Hello Mrs. "+name);
       }
    }
    }

