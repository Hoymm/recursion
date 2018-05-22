package recursion1;

public class _4_bunnyEars2 {
    public int bunnyEars2(int bunnies) {
        if (bunnies == 0)
            return 0;
        return bunnyEars2(bunnies-1) + (bunnies%2 == 0 ? 3 : 2);
    }
}
