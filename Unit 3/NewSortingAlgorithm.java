/*
Hassan has discovered his own sorting algorithm. The algorithm has following conditions:

1. Given an integer k,  sort the values in the array according to their modulo with k. That is, if there are two integers a and b, and a%k < b%k, then a would come before b in the sorted array.

2. If a%k = b%k, then the integer which comes first in the given array remains first in the sorted array.

*/

import java.util.Scanner;

public class NewSortingAlgorithm {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int temp;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for(int i=0;i<n;i++){
                for(int j=0;j<n-i-1;j++){
                    if(arr[j]%k>arr[j+1]%k){
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            for(int i=0;i<n;i++) {
                System.out.print(arr[i] + " ");

            }


        }
    }