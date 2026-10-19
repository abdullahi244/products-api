package uk.ac.westminster.products_api;
import java.util.List;
import java.util.ArrayList;

public class ProductService {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public List<Product> getAllProducts(){
        return products;
    }

    public Product addProducts(Product product){
        product.setId(nextId++);
        products.add(product);
        return product;
    }
}
