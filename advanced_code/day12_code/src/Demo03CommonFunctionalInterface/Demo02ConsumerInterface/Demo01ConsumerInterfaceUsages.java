
/*

(1).Consumer接口的用法：

    java.util.function.Consumer<T>接口则正好与Supplier接口相反，它不是生产一个数据，而是消费一个指定泛型类型的数据。

                                        @FunctionalInterface
                                        public interface Consumer<T> {
                                            void accept(T var1);

                                            default Consumer<T> andThen(Consumer<? super T> after) {
                                                Objects.requireNonNull(after);
                                                return (t) -> {
                                                    this.accept(t);
                                                    after.accept(t);
                                                };
                                            }
                                        }

Consumer接口中包含抽象方法void accept(T t)，意为消费一个指定泛型的数据。

   Consumer接口是一个消费型接口,泛型执行什么类型,就可以使用accept方法消费什么类型的数据
   至于具体怎么消费(使用),需要自定义(输出,计算....)

 */
package Demo03CommonFunctionalInterface.Demo02ConsumerInterface;

public class Demo01ConsumerInterfaceUsages {
    public static void main(String[] args) {
        ConsumerImpl01 cImpl = new ConsumerImpl01();
        cImpl.accept("Stay brave and optimistic!");

        cImpl.andThen(cImpl).accept("Stay brave and optimistic!");




    }
}

