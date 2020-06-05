package Demo03CommonFunctionalInterface.Demo01SupplierInterface;

import java.util.function.Supplier;

public class SupplierImpl implements Supplier<String> {
    @Override
    public String get() {
        return "Don't be afraid to fail!";
    }
}
