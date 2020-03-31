
/*

    我们说多态是，同一行为在不同对象上有多种不同的表现形式。那么该如何在代码中体现这一特性呢？
首先由继承extends、接口实现implements产生的父子类关系是实现多态的前提。其实在代码中体现多态，
就是一句话：父类引用指向子类对象。

               父类名称 对象名 = new 子类名称();   接口名称 对象名 = new 实现类名称();



 */

package Polymorphic.PolymorphicUsages;

public class DemoMain {
    public static void main(String[] args) {

        Animal one = new Cat();
        one.eat();

        Animal two = new Dog();
        two.eat();

    }
}

