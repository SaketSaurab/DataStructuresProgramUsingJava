/*
Given an array of integers of length n and a positive integer K, the task is to
find the count of the longest possible subarrays with the sum of its elements
not divisible by K.
 */

import java.util.Scanner;
public class SubArrayAndSum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int count=0;
        int k=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        for(int i=0;i<n;i++){
            while(sum>0){
                sum=sum-arr[i];
                if	(sum%k==0){
                    count++;
                }
            }  }
        System.out.println(count);

    }




}

  
  
  