import java.util.HashMap;

/**
 * Memoization
 */
public class Memoization {

    static HashMap<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        int result = fibWithCache(42);
        System.out.println(result);
    }

    private static int fib(int N) {
        int result;
        if (N < 2) {
            result = N;
        } else {
            result = fib(N-1) + fib(N-2);
        }
        return result;
    }
    private static int fibWithCache(int N) {
        if (cache.containsKey(N)) {
            return cache.get(N);
        }

        int result;
        if (N < 2) {
            result = N;
        } else {
            result = fib(N-1) + fib(N-2);
        }
        // keep result in cache
        cache.put(N, result);
        return result;
    }
}