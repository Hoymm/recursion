package recursion1;

public class _22_countAbc {
    public int countAbc(String str) {
        if (str.length() < 3){
            return 0;
        }

        boolean foundOccurence = str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba");
        return (foundOccurence ? 1 : 0) + countAbc(str.substring(1));
    }
}
