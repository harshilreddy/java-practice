import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int color = sc.nextInt();

            if (map.containsKey(color)) {
                map.put(color, map.get(color) + 1);
            } else {
                map.put(color, 1);
            }
        }

        int pairs = 0;

        for (int count : map.values()) {
            pairs = pairs + count / 2;
        }

        System.out.println(pairs);
    }
}
