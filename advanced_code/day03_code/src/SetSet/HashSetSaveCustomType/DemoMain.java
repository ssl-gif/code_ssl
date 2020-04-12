
/*

    一般系统提供的重写好的hashCode、equals方法，建立的比较规则是：
当两个对象所有的属性都相同时，才认为这两个对象相同。

 */
package SetSet.HashSetSaveCustomType;

import java.util.HashSet;

public class DemoMain {
    public static void main(String[] args) {

        HashSet<Person> hashSet = new HashSet<>();
        Person p1 = new Person("张三", 18);
        Person p2 = new Person("张三", 18);
        Person p3 = new Person("张三", 30);
        Person p4 = new Person("李四", 30);

        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(p4);

        System.out.println(hashSet); // Person{name='张三', age=18}, Person{name='张三', age=30}, Person{name='李四', age=30}]

    }
}
