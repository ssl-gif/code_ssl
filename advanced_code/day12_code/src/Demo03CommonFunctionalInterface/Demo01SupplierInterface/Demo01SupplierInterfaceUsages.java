
/*

(1).Supplier接口的使用：

    java.util.function.Supplier<T>接口仅包含一个无参的抽象方法：T get()，用来获取一个泛型参数指定类型的对象数据。源码如下：

                                @FunctionalInterface
                                public interface Supplier<T> {
                                    T get();
                                }

Supplier<T>接口被称为生产型接口，即指定接口的泛型是什么类型，那么接口中的get方法就要返回什么类型的数据(生产什么类型的数据)

 */
package Demo03CommonFunctionalInterface.Demo01SupplierInterface;

import java.util.function.Supplier;

public class Demo01SupplierInterfaceUsages {
    public static void main(String[] args) {

        // (1).调用getString方法，方法的参数是一个接口，所以可以传递接口的实现类对象
        String str1 = getString(new SupplierImpl());
        System.out.println(str1);

        // (2).调用getString方法，方法的参数是一个接口，所以可以传递接口的匿名内部类
        String str2 = new Supplier<String>() {
            @Override
            public String get() {
                return "Don't be afraid to fail!";
            }
        }.get();
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
