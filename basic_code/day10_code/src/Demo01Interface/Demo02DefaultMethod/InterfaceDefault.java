
/*

从Java 8开始，接口里允许定义默认方法。格式如下：

                      public default 返回值类型 方法名称(参数列表) {
                                  方法体;
                      }

(1).接口当中的默认方法，是为了解决接口升级的问题。当我们想更新接口，在接口中添加新的抽象方法时，
所有的实现类就要对新添加的抽象方法进行覆盖重写，比较麻烦。所以此时引进了默认方法来对接口进行更新，
接口中定义的默认方法是可以被实现类继承下去的。

(2).接口中的默认方法必须使用 public default 作为修饰符，其中 public 可省略

 */

package Demo01Interface.Demo02DefaultMethod;

public interface InterfaceDefault {

    // 原有的抽象方法
    public abstract void methodAbs();

    // public abstract void methodAbs2();   新添加了一个抽象方法，所有的实现类都必须覆盖重写这个方法，比较麻烦。

    // 使用默认方法来更新接口
    public default void methodDefault() {
        System.out.println("这是新添加的默认方法");
    }

}
