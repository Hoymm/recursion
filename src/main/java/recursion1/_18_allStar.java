package recursion1;

public class _18_allStar {
    public String allStar(String str) {

        if (str.length() <= 1){
            return str;
        }

        return str.substring(0,1) + "*" + allStar(str.substring(1));
    }
}
