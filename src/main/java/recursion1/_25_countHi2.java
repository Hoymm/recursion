package recursion1;

public class _25_countHi2 {
    public int countHi2(String str) {
        if (str.length() <= 1){
            return 0;
        }

        if (str.length() >= 3){
            boolean isXHI = str.substring(0,3).equals("xhi");
            if (isXHI){
                return countHi2(str.substring(3));
            }
        }

        boolean isHi = str.substring(0,2).equals("hi");
        if (isHi){
            return 1 + countHi2(str.substring(2));
        }
        else{
            return countHi2(str.substring(1));
        }
    }
}
