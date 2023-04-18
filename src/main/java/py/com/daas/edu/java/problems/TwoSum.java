package py.com.daas.edu.java.problems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println("two sum " + Arrays.toString(getTwoSum(new int[]{1, 2, 4, 4}, 2)));
        System.out.println("two sum " + Arrays.toString(getTwoSum(new int[]{1, 2, 4, 4}, 8)));
    }

    /**
     * O(n)
     * S(n)
     *
     * @param array array
     * @param sum   sum
     * @return int[]
     */
    private static int[] getTwoSum(int[] array, int sum) {
        HashMap<Integer, Integer> hashSet = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            hashSet.put(array[i], i);
        }
        for (int i = 0; i < array.length; i++) {
            int rest = sum - array[i];
            if (hashSet.containsKey(rest) && hashSet.get(rest) != i) {
                return new int[]{i, hashSet.get(rest)};
            }
        }

        return new int[0];
    }
}
