
/*

    创建对象时，只有创建对象的语句，却没有把对象地址值赋值给某个引用类型变量，属于创建对象的简化写法。即匿名对象创建时，只是在堆内存
中new一个对象出来，并没有将其堆内存地址返回给某个引用类型变量存储。匿名对象的创建格式如下：
                                    new 类名称(参数列表);

(1).匿名对象的使用
    匿名对象的使用和普通对象没有什么差别，匿名对象也可以直接访问成员变量和成员方法。但要注意一点：每次使用匿名对象的时候，由于new关键字
的存在，都会创建一个新的对象，这就导致了匿名对象只能使用一次。

(2).匿名对象作为方法的参数和返回值

 */

package ScannerClass.AnonymousObject;

import java.util.Scanner;

public class AnonymousObject {
    public static void main(String[] args) {

        // (1).匿名对象的使用

        new Student().name = "赵丽颖"; // 创建了第一个匿名对象，由于没有名字，无法再对其进行操作。
        new Student().showName();     // 创建了第二个匿名对象，所以其name属性为null


        // (2).匿名对象作为方法的参数和返回值

        methodParam(new Scanner(System.in)); // 将new对象返回的地址值传递给形参引用类型变量sc，则sc就指向这个匿名对象
        Scanner sc1 = methodReturn();        // 将new对象的地址值返回赋值给引用类型变量sc1，则sc1就指向这个匿名对象


    }

    public static void methodParam(Scanner sc) {
        System.out.println("输入的是：" + sc.nextInt());
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }

}
