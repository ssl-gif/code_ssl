
/*

方法的定义格式如下：

        修饰符 返回值类型 方法名(参数列表){
                方法体的代码;
                ......
                return 返回值;
        }

①.修饰符：目前固定写法 public static
②.返回值类型：目前固定写法 void ，表示此方法无返回值。
③.方法名：要符合标识符的命名规则和命名规范，方法和变量的命名规范均是小驼峰式。
④.方法体的代码：该方法要实现的功能代码，可以包含任意条语句。
⑤.参数列表：目前我们使用的方法均无参数， 带有参数的方法在后面的课程讲解。
⑥.return语句：方法结束的标志，并将返回值返回给方法的调用者。当返回值类型是void时，方法无返回值，return可以不写。

#.注意事项：
①.方法的定义不能产生嵌套包含关系，即不可在一个方法内再去定义另一个方法。
②.方法定义的位置：类的里面、main方法的外面。所有方法定义的位置都是平级的，包括main方法。

 */

package MethodIntroduction;

public class MethodIntroduction {
    public static void main(String[] args) {
        operator();  //调用自定义的方法operator
    }

    //自定义方法，封装三元运算符的代码
    public static void operator() {
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println("最大值是：" + max);
    }

}