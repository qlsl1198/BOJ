import java.util.*;

public class boj_2108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> arr2 = new HashMap<>();

        int avg = 0;

        int n = scanner.nextInt();
        int arr[] = new int[n];


        for (int i = 0; i < n; i++){
            int a = scanner.nextInt();
            arr[i] = a;
            arr2.put(a, arr2.getOrDefault(a, 0) + 1);
            avg += a;
        }

        

        Arrays.sort(arr);
        HashSet<Integer> ar = new HashSet<>();
        int max = 0;
        int max_k = 0;
        for (int i : arr){
            
            int z = arr2.get(i);

            if (max < z){
                max = z;
                max_k = i;
                ar.clear();
                ar.add(max_k);
            }
            else if (max == z){
                ar.add(i);
            }
        }
        List<Integer> ar2 = new ArrayList<>(ar);
        Collections.sort(ar2);
        int many = 0;
        if (ar.size() == 1){
            many = ar2.get(0);
        }
        else {
            many = ar2.get(1);
        }

        int x = arr[n-1] - arr[0];

        System.out.println(Math.round((double)avg/n));
        System.out.println(arr[n/2]);
        System.out.println(many);
        System.out.println(x);


    }
}
