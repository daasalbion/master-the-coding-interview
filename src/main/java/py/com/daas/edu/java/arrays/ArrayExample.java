package py.com.daas.edu.java.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayExample {

    public static void main(String[] args) {
        // fixed array
        String[] array = new String[]{"a", "b", "c"};
        System.out.println(Arrays.toString(array));
        int[] intArray = new int[]{1, 2, 3, 4};
        // dynamic array
        List<Integer> list = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        list.add(5);
        System.out.println(list);

        String obj1 = "Hola obj1";
        String obj2 = obj1;
        String obj3 = "Hola obj1";
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println("String Pool");
        System.out.println(obj3.hashCode());
        System.out.println(obj2 == obj1);
        System.out.println(obj3 == obj2);
        String obj4 = new String("Hola obj1");
        System.out.println(obj4 == obj1);
    }
}
