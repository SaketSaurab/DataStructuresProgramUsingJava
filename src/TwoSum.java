/*
Given a sorted array of integers, return indices of two numbers such that they add up to a target value.

Print -1 -1 if not found.
 */


import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int a=sc.nextInt();
            int s=sc.nextInt();
            int l=0;
            int r=a-1;
            int []arr=new int[a];
            for (int j=0;j<a;j++){
                arr[j]=sc.nextInt();

            }
            Arrays.sort(arr);

            while (l < r) {

                if (arr[l]+arr[r]==s)
                {
                   System.out.println(l+" "+r);
                   break;
                }
                else if (arr[l]+arr[r]<s)
                    l++;
                else  r--;

            }

            if (arr[l]+arr[r]!=s){
                System.out.println("-1 -1");

            }

        }
    }
}
