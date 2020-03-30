
/*
    实现类必须覆盖重写接口的所有抽象方法，除非该实现类本身就是抽象类。此时可以认为，实现类
会继承来自接口的抽象方法。所以当实现类不是抽象类的时候，必须覆盖重写接口当中的所有抽象方法。

    覆盖重写抽象方法：去掉abstract，补充方法体

 */

package Interface.AbstractMethod;

public class InterfaceAbstractImpl implements InterfaceAbstract{

    @Override
    public void methodAbs1() {
        System.out.println("这是第一个方法！");
    }

    @Override
    public void methodAbs2() {
        System.out.println("这是第二个方法！");
    }

    @Override
    public void methodAbs3() {
        System.out.println("这是第三个方法！");
    }

    @Override
    public void methodAbs4() {
        System.out.println("这是第四个方法！");
    }

}

