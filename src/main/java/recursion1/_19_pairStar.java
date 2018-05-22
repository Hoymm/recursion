package recursion1;

public class _19_pairStar {
    public String pairStar(String str) {
    if (str.length() <= 1){
        return str;
    }

    boolean doubled = str.substring(0,1).equals(str.substring(1,2));
    String prefix = doubled ? str.substring(0,1) + "*" : str.substring(0,1);
    return prefix + pairStar(str.substring(1));
}
}
