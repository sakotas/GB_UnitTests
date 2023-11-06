package seminars.first.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ShopTest {
    /*
1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
*/

    public static void main(String[] args) {
        Shop newShop = new Shop();
        List<Product> productList = new ArrayList<Product>();

        Product product1 = new Product();
        product1.setTitle("Bread");
        product1.setCost(10);

        Product product2 = new Product();
        product2.setTitle("Water");
        product2.setCost(5);

        Product product3 = new Product();
        product3.setTitle("Tomato");
        product3.setCost(15);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        newShop.setProducts(productList);

        assertThat(newShop.getMostExpensiveProduct()).isEqualTo(15);
        assertThat(newShop.sortProductsByPrice().get(0).getCost()).isEqualTo(5);
        assertThat(newShop.sortProductsByPrice().get(1).getCost()).isEqualTo(10);
        assertThat(newShop.sortProductsByPrice().get(2).getCost()).isEqualTo(15);
    }
}