package Interface;

public class ProductServiceImpl implements ProductService {

    @Override
    public void addProduct() {
        System.out.println("add product");
    }

    public static void main(String[] args) {
        ProductService productService=new ProductServiceImpl();
        productService.addProduct();
        ProductService productService1=new ProductService(){

            @Override
            public void addProduct() {
                System.out.println("second product");
            }
        };
        productService1.addProduct();
    }
}
