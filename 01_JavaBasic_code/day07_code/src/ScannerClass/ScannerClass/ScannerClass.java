
/*

    Scanner(扫描器)，是JDK当中提供的一个类，位于java.util包路径下，是一个可以解析基本类型数据和字符串数据的简单文本扫描器。现阶段
我们使用Scanner类来实现，从键盘输入数据到程序当中。

(1).构造方法：
Scanner sc = new Scanner(System.in);    构造方法的参数System.in代表从键盘进行输入

(2).成员方法：
public int nextInt()：获取键盘输入的int数字并返回
public String next()：获取键盘输入的字符串并返回

 */

package ScannerClass.ScannerClass;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("输入的整数是：" + num);

        String str = sc.next();
        System.out.println("输入的字符串是：" + str);

    }
}
