//You are provided an array A which has N elements. Your task is to find the count of such occurrence where the element is larger than its neighbour.
import java.util.Scanner;

public class CompleteWithNeighbour{
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[]arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;

        for (int i=1;i<a-1;i++){
            if ((arr[i]>arr[i+1])&&(arr[i]>arr[i-1]))
            {
                count++;
            }

        }
        if (arr[0]>arr[1]){
            count++;
        }
        if (arr[a-1]>arr[a-2]){
            count++;
        }

        System.out.println(count);

    }
}