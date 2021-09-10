import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a = str.nextLine();
        String b = str.nextLine();
        boolean IsAnagram = false;
        boolean Visited[] = new boolean[b.length()];
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                IsAnagram = false;
                for (int j = 0; j < b.length(); j++) {
                    if (b.charAt(j) == c && !Visited[j]) {
                        Visited[j] = true;
                        IsAnagram = true;
                        break;
                    }
                }
//                if (!IsAnagram) {
//                    break;
//                }
            }
        }
        if (IsAnagram){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}