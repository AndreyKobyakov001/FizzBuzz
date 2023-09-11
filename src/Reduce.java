public class Reduce {
    public static void main(String[] args) {
        int start = 100;
        int count = reduceNumber(start);
        System.out.println("Steps taken: " + count);
    }

    public static int reduceNumber(int n) {
        if (n <= 0) {
            return 0;
        } else if (n % 2 == 0) {
            return 1 + reduceNumber(n / 2);
        } else {
            return 1 + reduceNumber(n - 1);
        }
    }
}