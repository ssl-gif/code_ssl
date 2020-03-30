
/*

三元运算符：需要三个数据才可以进行操作的运算符，由三元运算符连接的表达式称为三元表达式，返回值是一个变量或常量。格式如下：
                    数据类型 变量名称 = 判断条件 ? 表达式A : 表达式B;
如果判断条件成立，则执行表达式A，否则执行表达式B

 */

package Operator;

public class TernaryOperator {
    public static void main(String[] args) {

        // 使用三元运算符求两个数的最大值：

        // 法一：
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println("最大值是：" + max);

        // 法二：
        System.out.println("最大值是：" + (10 > 20 ? 10 : 20));

    }
}
