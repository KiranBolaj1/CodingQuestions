import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Equation {
    public static void main(String[] args) {
        // permutation("abc");
        int n = 1000;
        double result;
        List<Integer> list = new ArrayList<>();
        Map<Double, List<Integer>> map = new HashMap<>();
        for(int c = 1; c <= n; c++) {
            for(int d = 1; d <= n; d++) {
                if(c != d) {
                    result = (long) Math.pow(c, 3) + Math.pow(d, 3);
                    list = new ArrayList<>();
                    list.add(c);
                    list.add(d);
                    map.put(result, list);
                }
            }
        }
        for(int a = 1; a <= n; a++) {
            for(int b = 1; b <= n; b++) {
                if(a != b) {
                    result = (long) Math.pow(a, 3) + Math.pow(b, 3);
                    list = map.get(result);
                    if (list.size() > 0) {
                        if(!list.contains(a) || !list.contains(b)) {
                            System.out.println(a + " " + b + " " + list.get(0) + " " + list.get(1));
                        }
                    }
                }
            }
        }
    }

    static void permutation(String str) {
        permutation(str, "");
    }

    static void permutation(String str, String prefix) {
        if(str.length() == 0) {
            System.out.println(prefix);
            System.out.println();
        } else {
            for(int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i+1);
                System.out.println("Prefix : " + prefix);
                System.out.println("Rem : " + rem);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }
}
