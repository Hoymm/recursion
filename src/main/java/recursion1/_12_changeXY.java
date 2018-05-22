package recursion1;

public class _12_changeXY {
    public String changeXY(String str) {
        if (str.length() == 0){
            return "";
        }

        String prefix = str.charAt(0) == 'x' ? "y" : str.substring(0, 1);
        return prefix +  changeXY(str.substring(1));
    }
}
