
/*

    数组元素的反转，其实就是对称位置的元素交换。具体实现思路如下：

交换最小索引元素与最大索引元素
交换次小索引元素与次大索引元素
......

#.注意事项：

(1).借助第三个变量来交换两个变量的值：
int a = 10;     int b = 20;
int temp = a;   a = b;  b = temp;

(2).当for循环中有多个循环变量时：初始化语句可以同时初始化多个循环变量，步进表达式也可以同时对多个循环变量进行改变。

 */

package ArrayCommonOperation;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] array = {10, 30, 89, 55, 60};

        // 遍历打印输出反转前的数组
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // 利用循环实现数组元素反转：min、max分别保存数组的最小、最大索引
        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        // 遍历打印输出反转后的数组
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
