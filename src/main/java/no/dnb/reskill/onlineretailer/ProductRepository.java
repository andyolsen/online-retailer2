package no.dnb.reskill.onlineretailer;

import java.util.Collection;

public interface ProductRepository {
    void addProduct(Product product);
    boolean deleteProduct(int productId);
    Collection<Product> findAllProducts();
}
