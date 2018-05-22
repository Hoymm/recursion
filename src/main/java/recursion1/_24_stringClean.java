package recursion1;

public class _24_stringClean {
    public String stringClean(String str) {
        if (str.length() <= 1){
            return str;
        }

        boolean isRepeated = str.charAt(0) == str.charAt(1);

        if (isRepeated){
            return stringClean(str.substring(1));
        }
        else{
            return str.substring(0,1) + stringClean(str.substring(1));
        }
    }
}
