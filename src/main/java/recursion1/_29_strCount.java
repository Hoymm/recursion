package recursion1;

public class _29_strCount {
    public int strCount(String str, String sub) {
        if (str.length() < sub.length()){
            return 0;
        }

        boolean subOccurs = str.substring(0, sub.length()).equals(sub);
        if (subOccurs){
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        else{
            return strCount(str.substring(1), sub);
        }
    }
}
