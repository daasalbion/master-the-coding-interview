package py.com.daas.edu.java.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ContainsCommonItem {

    public static void main(String[] args) {
        boolean hasCommonItems = hasCommonItems(new String[]{"a", "b", "c", "x"}, new String[]{"z", "y", "i"});
        System.out.println("hasCommonItems1 " + hasCommonItems);

        hasCommonItems = hasCommonItems(new String[]{"a", "b", "c", "x"}, new String[]{"z", "y", "x"});
        System.out.println("hasCommonItems2 " + hasCommonItems);

        hasCommonItems = hasCommonItems(null, new String[]{"z", "y", "x"});
        System.out.println("hasCommonItems3 " + hasCommonItems);

        hasCommonItems = hasCommonItems2(new String[]{"a", "b", "c", "x"}, new String[]{"z", "y", "x"});
        System.out.println("hasCommonItems2 " + hasCommonItems);
    }

    /**
     * O(a + b)
     * S(a)
     * @param a array, no size limit
     * @param b array, no size limit
     * @return true | false
     */
    private static boolean hasCommonItems(String[] a, String[] b) {
        if (a == null || b == null) return false;
        // si existe un elemento en comun retornar true
        // O(a)
        HashSet<String> map = new HashSet<>(Arrays.asList(a));
        // O(b)
        for (String c : b) {
            if (map.contains(c)) {
                return true;
            }
        }

        return false;
    }

    /**
     * O(a + b)
     * S(1)
     * @param a array, no size limit
     * @param b array, no size limit
     * @return true | false
     */
    private static boolean hasCommonItems2(String[] a, String[] b) {
        if (a == null || b == null) return false;
        List<String> aList = Arrays.asList(a);
        List<String> bList = Arrays.asList(b);
        return aList.stream().anyMatch(bList::contains);
    }
}
