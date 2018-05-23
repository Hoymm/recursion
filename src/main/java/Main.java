public class Main {
    public static void main(String[] args) {
        strDist("hiHellohihihi", "ll");
    }

    public static int strDist(String str, String sub) {
        int strLen = str.length();
        int subLen = sub.length();

        System.out.println(str);
        if (strLen <= subLen){
            return str.equals(sub) ? strLen : 0;
        }

        if (str.substring(0, subLen).equals(sub) && str.substring(strLen-subLen).equals(sub)){
            return str.length();
        }

        if (str.substring(0, subLen).equals(sub)){
            return strDist(str.substring(strLen-1), sub);
        }

        if (str.substring(strLen-subLen).equals(sub)){
            return strDist(str.substring(1), sub);
        }

        return strDist(str.substring(1, strLen-1), sub);
    }


}