/*
Bubble Sort Problem
You are given an array of N unsorted numbers.
Your task is to write BUBBLE SORT such that numbers present in the array gets sorted.
 */

import java.util.Scanner;
public class BubbleSort{
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp;
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

}