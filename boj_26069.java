import java.util.*;

public class boj_26069{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> arr = new HashSet<>();

        arr.add("ChongChong");

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++){
            String a = scanner.nextLine();
            String b[] = a.split(" ");
            if (arr.contains(b[0]) || arr.contains(b[1])){
                arr.add(b[0]);
                arr.add(b[1]);
            }
        }

        System.out.println(arr.size());

    }
}