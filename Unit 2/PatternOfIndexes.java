/*   You need to print pattern as given in Sample Input.

Sample Input 2

5
Sample Output 2

0 1 0 3 0
1 1 1 3 1
2 1 2 3 2
3 1 3 3 3
4 1 4 3 4

 */

import java.util.Scanner;

public class PatternOfIndexes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                if (i % 2 == 0) {
                    System.out.print(i+j);
                }
                System.out.println();
            }
        }
    }
}
