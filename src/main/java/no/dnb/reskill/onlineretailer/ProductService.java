package no.dnb.reskill.onlineretailer;

public interface ProductService {
    void addToStock(Product product);
    void deleteFromStock(int id);
    Product findInStock(int productId);
    
    // FROM ANDY: The productName might not be unique, so maybe this method should return a collection?
    Product findInStock(String productName);
}
