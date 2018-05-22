package recursion1;

public class _20_endX {
    public String endX(String str) {
        if (str.length() <= 1){
            return str;
        }

        boolean isX = str.charAt(0) == 'x';
        return isX ? endX(str.substring(1)) + "x" : str.substring(0,1) + endX(str.substring(1));
    }
}
