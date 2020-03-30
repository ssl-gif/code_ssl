
/*

在任何版本的JDK中，接口当中都能定义抽象方法。格式如下：

                        public abstract 返回值类型 方法名称(参数列表);

接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract。这两个修饰符，可以选择性地省略。(IDEA显示为灰色即可省略)

 */

package Interface.AbstractMethod;

public interface InterfaceAbstract {

    // 这是一个抽象方法
    public abstract void methodAbs1();

    // 这也是抽象方法
    abstract void methodAbs2();

    // 这也是抽象方法
    public void methodAbs3();

    // 这也是抽象方法
    void methodAbs4();

}
