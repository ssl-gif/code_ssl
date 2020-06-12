package Extends.Constructor;

public class Zi extends Fu {

    int numZi;

    public Zi() {
        // super();  默认隐含调用父类无参构造方法
    }

    /*
    在继承关系中，子类全参构造方法的常用写法：
    (1).在子类有参构造中调用父类全参构造，初始化从父类继承过来的成员变量
    (2).然后子类再去初始化自己独有的成员变量
     */
    public Zi(int num, int numZi) {
        super(num);
        this.numZi = numZi;
    }

}
