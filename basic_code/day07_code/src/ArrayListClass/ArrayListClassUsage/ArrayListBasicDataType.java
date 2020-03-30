
/*

    由于泛型不能是基本数据类型，只能是引用数据类型。所以ArrayList<E>集合不能存储基本类型数据，只能存储引用类型的数据。要想使用
ArrayList<E>集合存储基本类型数据，必须要使用基本数据类型对应的包装类。为了满足Java语言面向对象的这一特性，每一个基本类型在java.lang
包中都有一个对应的包装类，即将每个基本类型都包装成了一个类。使用ArrayList<包装类>集合来存储基本数据类型的方法如下：

(1).基本类型对应的包装类：

                基本类型(关键字)             包装类
                    byte                    Byte
                    short                   Short
                    int                     Integer
                    long                    Long
                    float                   Float
                    double                  Double
                    char                    Character
                    boolean                 Boolean

(2).从JDK1.5+开始，"基本类型"与"包装类型"之间可以发生自动类型转换，称为自动装箱、自动拆箱。

自动装箱：基本类型--->包装类型
    10是默认的int类型，add(E e)方法中的形参是包装类型。所以调用add方法传递参数时有：E e = 10; 此时发生了自动类型转换，100由int
类型自动转换为了"Integer类"类型，称为自动装箱。

自动拆箱：包装类型--->基本类型
    get方法的返回值是包装类型，相当于是 int num = e; 则此行代码发生了自动类型转换，e由"Integer类"类型自动转换为了int类型，称为自动拆箱。

 */

package ArrayListClass.ArrayListClassUsage;

import ArrayListClass.ArrayListClass.ArrayListClass;

import java.util.ArrayList;

public class ArrayListBasicDataType {
    public static void main(String[] args) {

        // 使用包装类Integer，创建一个ArrayList<E>集合类的对象list，用来存储int类型数据
        ArrayList<Integer> list = new ArrayList<>();

        // 自动装箱
        list.add(10);
        list.add(20);

        // 自动拆箱
        int num = list.get(1);

        System.out.println(list); // [10, 20]

    }
}
