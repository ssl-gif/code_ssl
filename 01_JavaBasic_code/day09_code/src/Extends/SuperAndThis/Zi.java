
/*

1.super关键字的用法有两种：
(1).在子类的成员方法中，访问父类重名的成员变量、成员方法。
(2).在子类的构造方法中，访问父类的构造方法。

2.super关键字用来访问父类内容，而this关键字用来访问本类内容。用法也有两种：
(1).在本类的成员方法中，访问本类的成员变量、成员方法。
(2).在本类的构造方法中，访问本类的另一个构造方法。

a.与"super()"调用不同，编译器不会默认赠送一个隐含的"this()"调用。"this()"调用必须是构造方法的第一个语句，而且是唯一一个。
b.在继承关系的子类中，一旦使用了"this()"调用，那么原本隐含的"super()"调用将会失效。并且super()、this()两种构造调用，不能同时使用。

 */

package Extends.SuperAndThis;

public class Zi extends Fu {

    public Zi() {
        // super();  隐含的super调用失效
        this(10);
    }

    public Zi(int n) {
    }

}
