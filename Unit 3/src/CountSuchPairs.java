/*
You are given an array A of N integers along with a target integer. Your task
is to find out the number of pairs of integers present in the array whose sum
is equal to the target value
 */

import java.util.Scanner;

public class CountSuchPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        int[]arr=new int[a];
        for (int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<a-1;i++){
            for (int j=i+1;j<a;j++){
                if (arr[i]+arr[j]==b){
                    count++;
                }
            }

        }
        System.out.println(count);
    }

}
