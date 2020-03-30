
/*

    之前我们说，在父、子类成员没有重名的情况下。子类从父类继承过来的成员变量、成员方法，使用起来和子类本身的成员变量、成员方法无异，
完全符合"成员变量、成员方法的使用规则"。当父、子类成员有重名的时候怎么办呢？重名的成员变量、成员方法的使用规则如下：

(1).重名的普通成员变量、方法

(2).重名的静态成员变量、方法

 */

package Extends.DuplicateMember;

public class DemoDuplicateMember {
    public static void main(String[] args) {

        // 重名的普通成员变量、方法在其他类中的使用：子类对象优先使用重名的子类成员，不会使用继承过来的重名的父类成员
        Zi zi = new Zi();
        System.out.println(zi.normalNum);
        zi.normalMethod();

        // 重名的静态成员变量、方法在其他类中的使用：子类类名优先使用重名的子类成员，不会使用继承过来的重名的父类成员
        System.out.println(Zi.staticNum);
        Zi.staticMethod();

    }
}
