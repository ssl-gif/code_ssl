
/*

1.常量(const)：是指在Java程序中固定不变的数据。(即程序中一些具体、固定的数据值)

2.常量的分类：
(1).整数常量：所有的整数。例如：100、200、0
(2).浮点数常量：所有的小数。例如：2.5、-3.14、0.0
(3).字符常量：单引号引起来，有且仅有一个字符，必须有内容。例如：'A'、'b'、' '(内容为空格)
(4).字符串常量：双引号引起来，可以写多个字符，可以为空。例如："abc"、"Hello"、""(内容为空)
(5).布尔常量：只有两个值，true、false。
(6).空常量：只有一个值null，代表没有任何数据。

#.注意事项：
①.print和println的区别：
System.out.print();   // print将他的参数显示在命令窗口，并将光标定位在所显示的最后一个字符之后。
System.out.println(); // println将他的参数显示在命令窗口，并在结尾加上换行符，将光标定位在下一行的开始。
②.Java中常量的默认数据类型：整数常量默认为int 、浮点数常量默认为double。

 */

public class Const{
    public static void main(String[] args){

        // 输出整数常量
        System.out.println(456);
        System.out.println(-789);

        // 输出浮点数常量
        System.out.println(2.365);
        System.out.println(-13.56);

        // 输出字符常量
        System.out.println(' ');    // 正确，字符为一个空格字符
        System.out.println('好');   // 正确，Java中的字符常量支持单个中文字符
        // System.out.println('');   错误，不可没有字符
        // System.out.println('AB'); 错误，不可有两个字符

        // 输出字符串常量
        System.out.println("ABC");
        System.out.println("");    // 正确，字符串常量中的内容可以为空(打印出一个空白行)

        // 输出布尔常量
        System.out.println(true);
        System.out.println(false);  // 输出结果就是true或false

        // 输出空常量
        // System.out.println(null); 错误，空常量不能直接用来打印输出
    }
}