package py.com.daas.edu.java.arrays;

public class ReverseAString {

    public static void main(String[] args) {
        System.out.println(reverseString("Hi, my name is Derlis Arguello"));
        System.out.println(reverseString2("Hi, my name is Derlis Arguello"));
        System.out.println(reverseString("Hi"));
        System.out.println(reverseString2("Hi"));
        System.out.println(reverseString("H"));
        System.out.println(reverseString2("H"));
        System.out.println(reverseString(null));
        System.out.println(reverseString2(null));
    }


    /**
     * O(n)
     * S(1)
     * @param str string
     * @return reversed string
     */
    private static String reverseString(String str) {
        if (str == null) return null;
        if (str.length() == 1) return str;

        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    private static String reverseString2(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }
}
