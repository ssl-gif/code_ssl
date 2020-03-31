
/*

    我们说多态，是同一行为在不同子类的对象上有多种不同的表现形式。那么该如何在代码中体现这一
特性呢？首先由继承extends、接口实现implements产生的父子类关系是实现多态的前提。其实在代码中
体现多态，就是一句话：父类引用指向子类对象。

        父类名称 对象名 = new 子类名称();   接口名称 对象名 = new 实现类名称();

    当我们使用多态的方式调用成员方法时：首先检查父类中是否有该方法。如果没有，则编译错误；如果有，
那么再检查子类是否覆盖重写了该方法，如果子类覆盖重写了该方法，则执行的是子类重写后方法，否则就执行
父类方法。
    由此可以看出，我们只使用父类引用，不需要创建各个子类对象，就可以展现出同一行为在不同子类的各
种表现形式。而且此时也不用关心各个子类是如何覆盖重写父类方法的，只需要在父类中调用父类方法就行了。
由此就可实现"多态"这一特性。

    所以什么是多态呢？就是只使用父类引用调用父类方法，就可以访问到各个子类覆盖重写后的方法，使得
同一行为在各个子类中呈现出各种各样的状态，即是多态。

#.注意事项：

(1).成员变量的访问特点：由于成员变量没有覆盖重写的概念，所以使用多态的方式调用成员变量时，无论子类
是否有重名的成员变量，只会访问父类的成员变量，永远不会访问子类的成员变量。

(2).成员方法的访问特点：当子类中有重名但不是覆盖重写的方法时，只会访问父类的成员方法，不会访问子类
的成员方法。

 */

package Polymorphic.PolymorphicUsages;

public class DemoMain {
    public static void main(String[] args) {

        Animal one = new Cat();
        one.eat();    // 猫吃鱼
        one.method(); // 父类重名方法

        Animal two = new Dog();
        two.eat();   // 狗吃骨头
        two.method();// 父类重名方法

    }
}

