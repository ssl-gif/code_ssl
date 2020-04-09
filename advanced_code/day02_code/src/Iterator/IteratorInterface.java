
/*

(1).获取Iterator接口的实现类对象：见代码

(2).Iterator的两个常用的方法：
public E next()：取出集合中的下一个元素
public boolean hasNext()：判断集合中还有没有下一个元素，有就返回true，没有就返回false

 */

package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorInterface {
    public static void main(String[] args) {

        // 使用多态的方式创建一个集合对象
        Collection<String> coll = new ArrayList<>();

        /*
            coll以多态的方式调用iterator方法(ArrayList类实现了iterator方法，调用的是子类的方法)
        返回一个Iterator接口的实现类对象，然后使用Iterator接口接收，形成多态。至此就得到了集合coll
        上的一个迭代器 it。
            IteratorInterface<E>接口也是有泛型的，集合是什么泛型，迭代器就是什么泛型
         */
        Iterator<String> it = coll.iterator();

        //往集合中添加元素
        coll.add("姚明");
        coll.add("科比");
        coll.add("麦迪");

        // 循环迭代集合中的元素
        while (it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }

    }
}
