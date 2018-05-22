package recursion1;

public class _21_countPairs {
    public int countPairs(String str) {
        if (str.length() < 3){
            return 0;
        }

        boolean isAPair = str.charAt(0) == str.charAt(2);
        return (isAPair ? 1 : 0) + countPairs(str.substring(1));
    }
}
