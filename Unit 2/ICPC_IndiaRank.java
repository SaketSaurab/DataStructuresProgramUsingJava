import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
            public class ICPC_IndiaRank {
                public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    String arr[]=new String[n];

                    for (int i=0;i<n;i++){
                        arr[i]=sc.next();
                    }
                    HashMap<String ,Integer>hashMap=new HashMap<>();
                    for (int j=0;j<n;j++){
                        hashMap.put(arr[j],j+1);
                    }

                    for (Map.Entry<String,Integer>map:hashMap.entrySet()){
                        if (map.getKey().equals("India")) {
                            System.out.println(map.getValue());
                            break;
                        }
                    }
    }
}
