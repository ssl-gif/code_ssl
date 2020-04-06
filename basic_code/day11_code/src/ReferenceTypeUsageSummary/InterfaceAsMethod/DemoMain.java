
/*

    接口作为方法的参数、返回值的数据类型时，传递与返回的都是该接口的子类对象。
此时子类对象的传递与返回，都是使用接口类型来接收，形成多态。

 */

package ReferenceTypeUsageSummary.InterfaceAsMethod;

import java.util.ArrayList;
import java.util.List;

public class DemoMain {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        List<String> result = addNames(list); // 传递ArrayList<E>对象给方法

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    // ArrayList<E> 是 java.util.List<E> 接口的实现类，使用接口引用接收
    public static List<String> addNames(List<String> list) {
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        return list;
    }

}
