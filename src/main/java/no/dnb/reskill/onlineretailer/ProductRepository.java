package no.dnb.reskill.onlineretailer;

import java.util.Collection;

public interface ProductRepository {
    
    // FROM ANDY: Should return the product id, or maybe a whole Product object with id.
    void addProduct(Product product);
    
    // FROM ANDY: Could also have an updateProduct method.
    
    boolean deleteProduct(int productId);
    Collection<Product> findAllProducts();
}
