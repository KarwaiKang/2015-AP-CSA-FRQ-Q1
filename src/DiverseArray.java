public class DiverseArray {
    /**
     * @param arr the one-dimensional array.
     * @return the sum of the entries in the one-dimensional array {@code arr}.
     */
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;
        return sum;
    }

    /**
     * @param arr2D the two-dimensional array.
     * @return a one-dimensional array in which the entry at index {@code k} is the sum of
     * the entries of row {@code k} of the two-dimensional array {@code arr2D}.
     */
    public static int[] rowSums(int[][] arr2D) {
        int[] sums = new int[arr2D.length];
        for (int k = 0; k < arr2D.length; k++)
            sums[k] = arraySum(arr2D[k]);
        return sums;
    }

    /**
     * @param arr2D the two-dimensional array.
     * @return {@code true}if all rows in {@code arr2D} have different row sums;
     * {@code false} otherwise.
     */
    public static boolean isDiverse(int[][] arr2D) {
        int[] sums = rowSums(arr2D);
        for (int i = 0; i < sums.length; i++) {
            for (int j = i + 1; j < sums.length; j++) {
                if (sums[i] == sums[j])
                    return false;
            }
        }
        return true;
    }
}
