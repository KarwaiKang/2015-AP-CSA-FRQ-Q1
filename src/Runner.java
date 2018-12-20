public class Runner {
    public static void main(String[] args) {
        int[][] mat1 = {
                {1, 3, 2, 7, 3},
                {10, 10, 4, 6, 2},
                {5, 3, 5, 9, 6},
                {7, 6, 4, 2, 1},
        };

        int[][] mat2 = {
                {1, 1, 5, 3, 4},
                {12, 7, 6, 1, 9},
                {8, 11, 10, 2, 5},
                {3, 2, 3, 0, 6},
        };

        int[] sums = DiverseArray.rowSums(mat1);
        StringBuilder sb = new StringBuilder("{");
        for (int i : sums)
            sb.append(i).append(", ");
        System.out.println(sb.substring(0, sb.length() - 2) + "}"); // → {16, 32, 28, 20}
        System.out.println(DiverseArray.isDiverse(mat1)); // → true
        System.out.println(DiverseArray.isDiverse(mat2)); // → false
    }
}
