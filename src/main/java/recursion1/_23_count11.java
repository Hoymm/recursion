package recursion1;

public class _23_count11 {
    public int count11(String str) {
        if (str.length() < 2){
            return 0;
        }

        boolean isEleven = str.substring(0,2).equals("11");

        if (isEleven){
            return 1 + count11(str.substring(2));
        }
        else{
            return 0 + count11(str.substring(1));
        }
    }
}
