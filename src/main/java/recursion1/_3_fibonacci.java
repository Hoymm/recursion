package recursion1;

public class _3_fibonacci {
    public int fibonacci(int n) {
        if (n > 0)
            return n == 1 ? 1 : fibonacci(n-1)+fibonacci(n-2);
        return 0;
    }
}
