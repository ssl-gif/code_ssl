package Generic.GenericUsages.GenericInterface;

public class GenericInterfaceImpl02<E> implements GenericInterface<E> {

    @Override
    public void method(E e) {
        System.out.println(e);
    }

}
