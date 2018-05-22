package recursion1;

public class _13_changePi {
    public String changePi(String str) {
        if (str.length() < 2){
            return str;
        }

        boolean piFound = str.substring(0, 2).equals("pi");
        String prefix = piFound ? "3.14" : str.substring(0,1);
        String postfix = changePi(str.substring(piFound ? 2 : 1));
        return prefix + postfix;
    }
}
