import java.util.*;

public class boj_25192{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;

        HashSet<String> arr = new HashSet<>();

        for (int i = 0; i < n; i++){
            String b = scanner.next();
            int count = 0;

            if (b.equals("ENTER")){
                arr.clear();
                count += 1;
            }

            else if(arr.contains(b)) {
                count += 1;
            }
            
            if (count == 0){
                a += 1;
                arr.add(b);
            }
        }
        System.out.println(a);
    }
}