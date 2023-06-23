import java.time.LocalDate;

public class ProductFactory {
   public static Product createRealProduct(String name, double price, int size, int weight) {
       Real realProduct = new Real();
       realProduct.setName(name);
       realProduct.setPrice(price);
       realProduct.setSize(size);
       realProduct.setWeight(weight);
       return realProduct;
   }

   public static Product createVirtualProduct(String name, double price, String code, LocalDate expirationDate) {
       Virtual virtualProduct = new Virtual();
       virtualProduct.setName(name);
       virtualProduct.setPrice(price);
       virtualProduct.setCode(code);
       virtualProduct.setExpirationDate(expirationDate);
       return virtualProduct;
   }
}
