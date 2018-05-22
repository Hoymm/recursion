public class Main {
    public static void main(String[] args) {
        count8(8818);
    }

    public static int count8(int n) {
        System.out.println(n);
        return n == 0 ? 0 : (n % 10 == 8) ? (n / 100 % 10 == 8 ? 2 : 1) : 0 + count8(n / 10);
    }

    public static int count88(int n) {

        if (n == 0) {
            return 0;
        }

        if (n % 10 == 8) {
            if (n / 10 /% 10 == 8){
                return 2 + count8(n / 10);
            }
    else{
                return 1 + count8(n / 10);
            }
        } else {
            return count8(n / 10);
        }
    }

}