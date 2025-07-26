import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class boj_20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> arr = new HashMap<>();


        StringTokenizer z = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(z.nextToken());
        int m = Integer.parseInt(z.nextToken());

        for (int i = 0; i < n; i++){
            String a = br.readLine();
            if (a.length() >= m){
                arr.put(a, arr.getOrDefault(a, 0)+1);
            }
        }

        List<String> arr2 = new ArrayList<>(arr.keySet());
        Collections.sort(arr2, new Comparator<String>() {
            @Override
            public int compare(String w1, String w2){
                int freq1 = arr.get(w1);
                int freq2 = arr.get(w2);
                
                if (freq1 != freq2){
                    return freq2 - freq1;
                }
                else if (w1.length() != w2.length()){
                    return w2.length() - w1.length();
                }
                else return w1.compareTo(w2);
            }
        });
        

        for (String p : arr2){
            bw.write(p);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();


    }
}
