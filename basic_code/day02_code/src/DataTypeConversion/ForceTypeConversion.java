
/*

强制类型转换(显式类型转换)：数据类型由取值范围大的向取值范围小的转换。不能自动完成类型转换，代码需要进行特殊处理。格式如下：
                       范围小的类型 范围小的变量名 = (范围小的类型)原本范围大的数据;

#.注意事项：

①.强制类型转换一般不推荐使用，因为有可能发生数据溢出、精度损失的问题。
a.强制类型转换时，数据值超出转换的目标范围，会产生数据溢出
b.数据由浮点型强制转换为整数型时，会产生精度损失

②.字符型数据的类型转换
a.自动类型转换：字符型 --> 整数型、浮点数型，为取值范围从小到大的转换。按照编码表，找到字符对应的数字即可。
b.强制类型转换：整数型、浮点数型 --> 字符型，为取值范围从大到小的转换。按照编码表，找到数字对应的字符即可。

③.布尔类型数据不能发生数据类型转换。

 */

package DataTypeConversion;

public class ForceTypeConversion {
    public static void main(String[] args) {

        // ①整数型之间：long --> int
        long num1 = 100L;
        int num2 = (int) num1;  // 左边是int类型变量，右边是long类型变量。即把long类型变量赋值给int类型变量，这一行代码需要进行强制类型转换。
        System.out.println(num2); // 100

        // ②浮点型之间：double --> float
        double num3 = 500.23;
        float num4 = (float)num3;  // 左边是float类型变量，右边是double类型变量。即把double类型变量赋值给float类型变量，这一行代码需要进行强制类型转换。
        System.out.println(num4);  // 500.23

        // ③浮点型--->整数型：float --> long
        float num5 = 30.0F;
        long num6 = (long)num5;    // 左边是long类型变量，右边是float类型变量。即把float类型变量赋值给long类型变量，这一行代码需要进行强制类型转换。
        System.out.println(num6);  // 注意由浮点数型--->整数型，结果变为30

    }
}
