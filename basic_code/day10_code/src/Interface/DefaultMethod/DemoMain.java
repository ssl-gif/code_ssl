
/*

    接口当中的默认方法会被实现类所继承，所以各个实现类都会拥有该默认方法。实现类可以对
继承下来的默认方法进行覆盖重写，也可以不对其进行覆盖重写。

    覆盖重写默认方法：去掉 default，补充方法体

 */

package Interface.DefaultMethod;

public class DemoMain {
    public static void main(String[] args) {

        // 实现类A并没有对默认方法进行覆盖重写，所以会使用继承下来的默认方法
        InterfaceDefaultImplA a = new InterfaceDefaultImplA();
        a.methodAbs();
        a.methodDefault();

        // 实现类B覆盖重写了接口的默认方法，所以会使用本类中的默认方法，不会使用从接口继承下来的默认方法。
        InterfaceDefaultImplB b = new InterfaceDefaultImplB();
        b.methodAbs();
        b.methodDefault();

    }
}
