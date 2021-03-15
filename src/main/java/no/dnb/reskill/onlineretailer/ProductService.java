package no.dnb.reskill.onlineretailer;

public interface ProductService {
    void addToStock(Product product);
    void deleteFromStock(int id);
    Product findInStock(int productId);
    Product findInStock(String productName);
}
