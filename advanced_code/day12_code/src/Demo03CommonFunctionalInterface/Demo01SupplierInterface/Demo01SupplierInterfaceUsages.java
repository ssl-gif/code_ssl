
/*

(1).Supplier接口的用法：

    java.util.function.Supplier<T>接口仅包含一个无参的抽象方法：T get()，用来获取一个泛型参数指定类型的对象数据。源码如下：

                                        @FunctionalInterface
                                        public interface Supplier<T> {
                                            T get();
                                        }

    Supplier<T>接口被称为生产型接口，即在实现类中指定接口的泛型是什么类型，那么在实现类中重写get方法时，就可以随便return一个
指定泛型类型的数据，那么该get方法的作用就是可以返回一个指定泛型类型的数据，即生产一个指定泛型类型的数据。

(要体会"接口是用来制定规范的"这种思想：接口中的抽象方法通过返回值、参数来制定该方法的规则，即该方法是用来做什么的，那么其实现类
在重写抽象方法时也要遵守这种规则，即实现类重写后的抽象方法也是用来做这种事的。注意体会这种思想在Supplier接口中的应用)

 */
package Demo03CommonFunctionalInterface.Demo01SupplierInterface;

import java.util.function.Supplier;

public class Demo01SupplierInterfaceUsages {
    public static void main(String[] args) {

        // (1).调用getString方法，方法的参数是一个接口，所以可以传递接口的实现类对象，形成多态，即：Supplier<String> supplier = new SupplierImpl();
        SupplierImpl sImpl = new SupplierImpl();
        String str1 = getString(sImpl);
        System.out.println(str1);

        // (2).调用getString方法，方法的参数是一个接口，所以可以传递接口的匿名内部类，形成多态，即：Supplier<String> supplier = new Supplier<String>() {...};
        String str2 = getString(new Supplier<String>() {
            @Override
            public String get() {
                return "Don't be afraid to fail!";
            }
        });
        System.out.println(str2);

        // (3).调用getString方法，方法的参数Supplier是一个函数式接口，所以可以传递Lambda表达式
        String str3 = getString(() -> {
            return "Don't be afraid to fail!";
        });
        System.out.println(str3);

        // Lambda表达式的省略格式
        String str4 = getString(() -> "Don't be afraid to fail!");
        System.out.println(str4);

    }

    // 定义一个方法，参数是Supplier<T>接口，泛型是String类型，则该方法用来返回一个String类型的数据
    private static String getString(Supplier<String> supplier) {
        return supplier.get();
    }

}
