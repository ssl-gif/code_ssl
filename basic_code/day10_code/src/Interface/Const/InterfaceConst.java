
/*

    在任何版本的JDK中，接口当中可以定义“成员变量”，但是必须使用public static final三个关键字进行修饰。
从效果上看，这其实就是接口的"常量"。格式如下：

                    public static final 数据类型 常量名称 = 数据值;

1.接口当中的常量，必须进行初始化赋值。并且一旦使用final关键字进行修饰，说明不可改变。
2.接口当中的常量，可以省略 public static final 修饰符，不写也是默认这三个修饰符。
3.接口中的常量不会被实现类继承。在其他类中，使用接口名即可调用：接口名.常量名
4.接口中常量名称的命名规则：使用完全大写的字母，用下划线进行分隔单词。

 */

package Interface.Const;

public interface InterfaceConst {

    public static final int NUM_OF_MY_AGE = 23;

}
