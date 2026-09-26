import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int x : a) {
            set.add(x);
        }

        HashSet<Integer> result = new HashSet<>();

        for (int x : b) {
            if (set.contains(x)) {
                result.add(x);
            }
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
