
/*

    java.util.Arrays 类是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作。

public static String toString(数组)：将参数数组变成字符串："[元素1, 元素2, 元素3]"
public static void sort(数组)：对参数数组元素进行升序排序

 */

package Demo03_ArraysClass;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {

        // 将int[]数组变成字符串
        int[] array1 = {10, 20, 30};
        String str = Arrays.toString(array1);
        System.out.println(str); // [10, 20, 30]

        // 对int[]数组升序排序
        int[] array2 = {2, 1, 3, 10, 6};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2)); // [1, 2, 3, 6, 10]


    }
}
