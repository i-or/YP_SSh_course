public class Methods {

    private int getMinimumFromTwo(int x, int y) {
        int min = (x < y ? x : y);
        return min;
    }

    private int getMinimumFromThree(int x, int y, int z) {
        int minFromTwo = getMinimumFromTwo(x, y);
        int min = (minFromTwo < z ? minFromTwo : z);
        return min;
    }

    private int getMinimumFromFour(int x, int y, int z, int afterZed) {
        int minimumFromThree = getMinimumFromThree(x, y, z);
        int min = (minimumFromThree < afterZed ? minimumFromThree : afterZed);
        return min;
    }
}


