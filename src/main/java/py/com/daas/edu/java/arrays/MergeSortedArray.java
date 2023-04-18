package py.com.daas.edu.java.arrays;


import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{1, 3, 3, 5, 9}, new int[]{2, 4, 5, 7, 11, 12, 21})));
        System.out.println(Arrays.toString(mergeArrays(new int[]{}, new int[]{2, 4, 5, 7, 11, 12, 21})));
    }

    private static int[] mergeArrays(int[] a, int[] b) {
        // 1) obtengo los lengths
        int m = a.length;
        int n = b.length;
        if (m == 0) return b;
        if (n == 0) return a;

        int o = m + n;
        int [] p;
        int [] q;
        int[] result = new int[o];

        if (m > n) {
            p = a;
            q = b;
        } else {
            p = b;
            q = a;
        }

        int i = 0; // p
        int j = 0; // q
        int k = 0; // result

        while (k < o) {
            if (i < q.length && q[i] < p[j]) {
                result[k] = q[i];
                i++;
            } else {
                result[k] = p[j];
                j++;
            }
            k++;
        }

        return result;
    }
}
