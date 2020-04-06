
/*

使用多态的好处：

1.正如前面所说，使用多态的方式创建对象。我们只需使用父类引用来调用父类方法，即可访问到
各个子类覆盖重写后的方法，此时不用关心子类方法是如何实现的，只需要关注父类的方法即可。
(多态是"向后兼容"：之前都是从子类的角度向上找父类，多态是从父类的角度向下看子类)

2.实际开发的过程中，父类类型作为方法形式参数，传递子类对象给方法，进行方法的调用，更能
体现出多态的扩展性与便利。
如下例：只使用showAnimalEat方法即可代替上述两个方法。在扩展性方面，无论之后再多的子类
出现，我们都不需要编写showXxxEat方法了，直接使用showAnimalEat都可以完成。

 */

package Polymorphic.BenefitsOfPolymorphic;

public class DemoMain {
    public static void main(String[] args) {

        // 创建普通子类对象
        Cat c = new Cat();
        Dog d = new Dog();

        showCatEat(c);
        showDogEat(d);

        showAnimalEat(c);
        showAnimalEat(d);

    }

    public static void showCatEat(Cat c) {
        c.eat();
    }

    public static void showDogEat(Dog d) {
        d.eat();
    }

    // 将子类对象传递给方法，即 Animal a = c ，就是将父类引用指向子类对象，即多态
    public static void showAnimalEat(Animal a) {
        a.eat();
    }

}

