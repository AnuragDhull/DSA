public class sum_of_series {
    public static void main(String[] args) {

        // find the sum of series 1-2+3-4+5 - ....... n
        int n = 100;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ans -= i;

            } else {
                ans += i;

            }
        }
        System.out.println("Sum of a series :-- " + ans);
    }
}
