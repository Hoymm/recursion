package recursion1;

public class _26_parentBit {
    public String parenBit(String str) {
        if (str.length() == 1){
            return str;
        }

        boolean isLeftParenthesis = str.charAt(0) == '(';
        boolean isRightParanthesis = str.charAt(0) == ')';

        if (isLeftParenthesis){
            return "(" + parenBit(str.substring(1));
        }
        else if (isRightParanthesis){
            return ")";
        }
        else{
            return str.contains("(") ? parenBit(str.substring(1)) : str.substring(0,1) + parenBit(str.substring(1));
        }
    }
}
