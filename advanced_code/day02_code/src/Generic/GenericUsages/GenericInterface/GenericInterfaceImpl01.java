package Generic.GenericUsages.GenericInterface;

public class GenericInterfaceImpl01 implements GenericInterface<String> {

    @Override
    public void method(String s) {
        System.out.println(s);
    }

}
