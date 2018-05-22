package recursion1;

public class _8_count8 {
    public int count8(int n) {
        int pointsToAdd = 0;

        if (n == 0){
            return 0;
        }

        if (n%10 == 8){
            pointsToAdd++;
        }

        if (n/10%10 == 8){
            pointsToAdd *= 2;
        }

        return count8(n/10) + pointsToAdd;
    }
}
