
/*

    该集合类的全称是 java.util.ArrayList<E>，其中<E>表示一种指定的数据类型，叫做泛型。也就是装在集合中的所有元素，全都是统一
的什么类型。泛型只能是引用数据类型，不能是基本数据类型。

                    // 创建一个ArrayList<E>集合类的对象，名为list，list对象是一个用来存储字符串数据的集合
                    ArrayList<String> list = new ArrayList<String>();

ArrayList<E>集合类中的常用方法：
①.public boolean add(E e)：向集合中添加元素，参数的类型和泛型一致，返回值代表是否添加成功
②.public E get(int index)：从集合中获取指定索引处的元素，返回值就是对应索引位置的元素（ArrayList<E>集合的索引编号从0开始）
③.public E remove(int index)：从集合中删除指定索引处的元素，返回值就是被删除的元素
④.public int size()：获取集合的长度，返回值是集合中的元素个数。
⑤.ArrayList<E>集合的遍历操作：调用size、get方法

 */

package ArrayListClass.ArrayListClassUsage;

import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(); // 从JDK1.7+开始，右侧尖括号内的泛型可以省略不写

        // 直接打印ArrayList<E>集合类的对象名：输出的不是list对象的地址值，而是对list集合里面的内容打印输出
        System.out.println(list); // [] 内容为空

        // ①.向集合中添加元素：add方法
        boolean b = list.add("柳岩");
        System.out.println(list); // [柳岩]
        System.out.println("是否添加成功：" + b);

        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        System.out.println(list); // [柳岩, 高圆圆, 赵又廷, 李小璐]

        // ②.从集合中获取元素：get方法
        String name = list.get(2);
        System.out.println("第2号索引位置：" + name);

        // ③.从集合中删除元素：remove方法
        String whoRemoved = list.remove(3);
        System.out.println("被删除的人是：" + whoRemoved);
        System.out.println(list); // [柳岩, 高圆圆, 赵又廷]

        // ④.获取集合的长度，即其中元素的个数：size方法
        int size = list.size();
        System.out.println("集合的长度是：" + size);

        // ⑤.ArrayList<E>集合的遍历操作：
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
