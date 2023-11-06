package seminars.first.Shop;

import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        // Допишите реализацию метода самостоятельно
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getCost() - o2.getCost();
            }
        });
        return products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Integer getMostExpensiveProduct() {
        // Допишите реализацию метода самостоятельно
        Integer max = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getCost() > 0) {
                max = products.get(i).getCost();
            }
        }
        return max;
    }

}