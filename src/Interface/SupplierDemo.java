package Interface;

import java.util.function.Supplier;

public interface SupplierDemo {
    public static void main(String[] args) {
        Supplier supplier1=new SupplierImpl();
        Supplier supplier=new Supplier() {
            @Override
            public Object get() {
                return null;
            }


        };
        supplier1.get();
        supplier.get();
    }
} class SupplierImpl implements Supplier{

    @Override
    public Object get() {
        return null;
    }
}
