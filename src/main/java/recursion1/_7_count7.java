package recursion1;

public class _7_count7 {
    public int count7(int n) {
        return n == 0 ? n : (n%10 == 7 ? 1 : 0) + count7(n/10);
    }
}
