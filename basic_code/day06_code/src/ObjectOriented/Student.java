
/*

类是对现实世界中一类 “事物” 的属性和行为的抽象，是一种抽象的引用数据类型。定义一个类的语法格式如下：

                            public class 类名 {

                                // 成员变量：对应事物的属性

                                // 成员方法：对应事物的行为

                            }

 */

package ObjectOriented;

public class Student {

    // 定义一个类，用来描述“学生”这一事物

    // 成员变量
    String name;
    int age;

    // 成员方法
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void study() {
        System.out.println("学习");
    }

}
