
/*

创建一个数组的格式如下：

                        数据类型[] 数组名 = new 数据类型[数组长度];

其中的数据类型可以是基本数据类型int、float、double等，也可以是引用数据类型String、类等。当"Student类"作为数组的数据类型时，这个
"Student类型数组"可以用来存储"Student类"这一数据类型的数据，即由Student类实例化出来的对象。这种用来存储多个对象的数组，称为对象数组。

                        类名[] 数组名 = new 类名[数组长度];
                        Student[] array = new Student[3];


    到目前为止，我们想存储对象数据，选择的容器，只有对象数组。而数组的长度是固定的，无法适应数据个数变化的需求。为了解决这个问题，Java
提供了另一个存储数据的容器java.util.ArrayList<E>  集合类，让我们可以更便捷的存储和操作对象数据。

 */

package ArrayListClass.ObjectArray;

public class ObjectArray {
    public static void main(String[] args) {

        // 创建三个Student类的对象
        Student one = new Student("迪丽热巴", 18);
        Student two = new Student("古力娜扎", 28);
        Student three = new Student("玛尔扎哈", 38);

        // 创建一个长度为3的数组，用来保存上述Student类的三个对象，则此数组就称为对象数组
        Student[] array = new Student[3];

        // 数组存储对象：将对象的地址值保存到数组元素中，则这三个数组元素分别指向上述三个对象
        array[0] = one;
        array[1] = two;
        array[2] = three;

        // 此时数组元素array[i]保存的是对象的堆内存地址值，是上述三个对象的引用
        for (int i = 0; i < array.length; i++) {
            System.out.println("我叫：" + array[i].getName() + "，年龄：" + array[i].getAge());
        }

    }
}


