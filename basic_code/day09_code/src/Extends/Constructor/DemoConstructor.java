
/*

继承关系中，父子类构造方法的访问特点：

    在子类的所有构造方法中，都有一个默认隐含的"super()"调用，这就是在调用父类的无参构造方法。所以当我们用构造方法new一个子类对象时，
一定是先调用了父类的构造方法，后执行的子类构造方法。(调用父类构造方法的目的，是为了初始化从父类继承过来的成员属性)

(1).当我们把"super()"调用语句显式补写出来时，原有隐含的"super()"调用就会失效。
(2).可以使用super关键字来调用父类重载的构造方法，此时默认隐含的"super()"调用就会失效。
(3).调用父类构造方法的"super()"语句，必须是子类构造方法的第一个语句，并且只能有唯一一个"super()"调用语句。

 */

package Extends.Constructor;

public class DemoConstructor {
    public static void main(String[] args) {

        Zi zi = new Zi();

    }
}


