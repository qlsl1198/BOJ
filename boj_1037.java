import java.util.*;

public class boj_1037{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        scanner.nextLine();

        String line = scanner.nextLine();

        String num[] = line.split(" ");
        
        for (int i = 0; i < n; i++){
            arr.add(Integer.parseInt(num[i]));
        }

        Collections.sort(arr);

        int min = arr.get(0);
        int max = arr.get(n-1);

        System.out.println(min * max);



    }
}