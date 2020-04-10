
/*

    含有泛型的接口有两种使用方式：

(1).定义实现类实现接口的同时指定接口的泛型

(2).接口使用什么泛型，实现类就使用什么泛型。相当于定义了一个含有泛型的类，创建对象的时候再指定泛型的类型

* Collection就是这种带泛型的接口，并且其实现类都是以第二种方式来使用泛型接口

 */

package Generic.GenericUsages.GenericInterface;

public class DemoMain {
    public static void main(String[] args) {

        // 创建实现类GenericInterfaceImpl01的对象
        GenericInterfaceImpl01 gc1 = new GenericInterfaceImpl01();
        gc1.method("qwert");

        // 创建实现类GenericInterfaceImpl02的对象
        GenericInterfaceImpl02<Integer> gc2 = new GenericInterfaceImpl02<>();
        gc2.method(10);

    }

}
