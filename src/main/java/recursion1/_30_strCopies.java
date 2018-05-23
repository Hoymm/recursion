package recursion1;

public class _30_strCopies {
    public boolean strCopies(String str, String sub, int n) {
    if (str.length() < sub.length()){
        return n == 0;
    }

    boolean subOccurs = str.substring(0, sub.length()).equals(sub);

    return strCopies(str.substring(1), sub, subOccurs ? n-1 : n);
}

}
