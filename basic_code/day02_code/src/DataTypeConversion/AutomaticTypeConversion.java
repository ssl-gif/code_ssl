
/*

自动类型转换(隐式类型转换)：数据类型由取值范围小的向取值范围大的转换。能自动完成类型转换，代码不需要进行特殊的处理。

 */

package DataTypeConversion;

public class AutomaticTypeConversion {
    public static void main(String[] args) {

        // ①整数型之间：int --> long
        int num1 = 100;
        long num2 = num1;  // 左边是long类型变量，右边是int类型变量。即把int类型变量赋值给long类型变量，这一行代码发生了自动类型转换。
        System.out.println(num2); //100

        // ②浮点型之间：float --> double
        float num3 = 2.5F;
        double num4 = num3;  // 左边是double类型变量，右边是float类型变量。即把float类型变量赋值给double类型变量，这一行代码发生了自动类型转换。
        System.out.println(num4); // 2.5

        // ③整数型--->浮点型：long --> float
        long num5 = 30L;
        float num6 = num5;   // 左边是float类型变量，右边是long类型变量。即把long类型变量赋值给float类型变量，这一行代码发生了自动类型转换。
        System.out.println(num6);  // 注意由整数型--->浮点数型，结果变为30.0

    }
}
