import java.util.List;

public class Order {
   private User user;
   private List<Product> productList;
   private Order() {

   }

   public User getUser() {
       return user;
   }

   public void setUser(User user) {
       this.user = user;
   }

   public List<Product> getProductList() {
       return productList;
   }

   public void setProductList(List<Product> productList) {
       this.productList = productList;
   }

   public static Order createOrder(User user, List<Product> productList) {
       Order order = new Order();
       order.setUser(user);
       order.setProductList(productList);
       return order;
   }

   @Override
   public String toString() {
       return "Order{" +
               "user=" + user +
               ", productList=" + productList +
               '}';
   }
}
