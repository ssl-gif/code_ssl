
/*

    java.util.Collection接口是所有单列集合的最顶层的接口，里边定义了所有单列集合共性的方法，
任意的单列集合都可以使用Collection接口中的方法。

public boolean add(E e)：把给定的对象添加到当前集合中
public boolean remove(E e)：把给定的对象在当前集合中删除
public boolean contains(E e)：判断当前集合中是否包含给定的对象
public boolean isEmpty()：判断当前集合是否为空，集合为空返回true，集合不为空返回false
public int size()：返回集合中元素的个数
public Object[] toArray()：把集合中的元素，存储到数组中
public void clear()：清空集合中所有的元素，但是不删除集合，集合还存在

*其实这些方法都是Collection接口中的抽象方法，被各个集合子类覆盖重写了

 */

package CollectionSet;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionSetMethod {
    public static void main(String[] args) {

        // 使用多态的方式创建集合对象
        Collection<String> coll = new ArrayList<>();

        // add方法
        boolean b1 = coll.add("张三");
        System.out.println(b1); // 返回值永远为true，无需接收
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll); // [张三, 李四, 赵六, 田七]

        // remove方法
        boolean b2 = coll.remove("赵六");
        System.out.println(b2); // true
        boolean b3 = coll.remove("迪丽热巴");
        System.out.println(b3); // false
        System.out.println(coll); // [张三, 李四, 田七]

        // contains方法
        boolean b4 = coll.contains("李四");
        System.out.println(b4); // true
        boolean b5 = coll.contains("迪丽热巴");
        System.out.println(b5); // false

        // isEmpty方法
        boolean b6 = coll.isEmpty();
        System.out.println(b6); // false

        // size方法
        int size = coll.size();
        System.out.println(size); // 3

        // toArray方法
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // clear方法
        coll.clear();
        System.out.println(coll); // []
        System.out.println(coll.isEmpty()); // true

    }
}
