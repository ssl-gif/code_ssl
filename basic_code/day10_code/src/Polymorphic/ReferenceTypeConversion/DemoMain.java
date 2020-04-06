
/*

    类作为一种引用数据类型，也是可以进行数据类型转换的，但是仅限于父子类之间进行类型转换，
称为引用类型转换。分为以下两种：

1.向上转型：子类类型向上转换为父类类型的过程，叫做向上转型。这个过程是默认的，当父类
引用指向一个子类对象时，即多态，便是向上转型。使用格式如下：

                父类名称 对象名 = new 子类名称();      Animal a = new Cat();

2.向下转型：一个已经向上转型的子类对象，将转型后的父类引用强制转换为子类引用，叫做向下
转型。使用格式如下：

                子类类型 变量名 = (子类类型) 父类变量名;    Cat c = (Cat) a;

#.注意事项：

(1).我们为什么要使用转型？当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，
则编译错误。也就是说，不能调用子类拥有、而父类没有的方法。编译都错误，更别说运行了。这也
是多态给我们带来的一点"小麻烦"。所以，想要调用子类特有的方法，父类引用必须做向下转型。

(2).转型的过程中，一不小心就会遇到转型异常的问题。如下：

                            Animal a = new Cat();
                            Dog d = (Dog) a;
                            d.watchHouse();

这段代码可以通过编译，但是运行时，却报出了 ClassCastException ，类型转换异常！这是因为，
明明创建了Cat类型对象，运行时，当然不能转换成Dog对象。这两个类型并没有任何继承关系，不符
合类型转换的定义。为了避免 ClassCastException 的发生，Java提供了 instanceof 关键字，
给引用变量做类型的校验，格式如下：
                            引用变量名  instanceof  类名
如果引用变量指向该类的对象，返回true；如果引用变量不指向该类的对象，返回false。
所以在进行向下转型时，最好先做一个类型判断，代码如下：

                            Animal a = new Cat();

                            if(a instanceof Cat){
                                Cat c = (Cat) a;
                                c.catchMouse();
                            }

                            if(a instanceof Dog){
                                Dog d = (Dog) a;
                                d.watchHome();
                            }

 */

package Polymorphic.ReferenceTypeConversion;

public class DemoMain {
    public static void main(String[] args) {

        // 向上转型           
        Animal a = new Cat();
        a.eat();         // 调用的是Cat的eat()方法 

        // 向下转型
        Cat c = (Cat) a;
        c.catchMouse();  // 调用的是Cat的catchMouse()方法 

    }
}
