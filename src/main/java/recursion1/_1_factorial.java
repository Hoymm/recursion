package recursion1;

public class _1_factorial {
    public int factorial(int n) {
        return n > 1 ? factorial(n-1)*n : 1;
    }
}
