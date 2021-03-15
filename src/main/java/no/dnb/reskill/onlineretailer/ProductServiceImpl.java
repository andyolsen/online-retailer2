package no.dnb.reskill.onlineretailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service ("productService")
public class ProductServiceImpl implements ProductService{


    private ProductRepository repository;

    @Autowired
    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;

    }

    @Override
    public void addToStock(Product product) {
        repository.addProduct(product);

    }

    @Override
    public void deleteFromStock(int id) {
      repository.deleteProduct(id);

    }

    @Override
    public Product findInStock(int productId) {
        for(Product p: repository.findAllProducts()){
            if (p.getId() == productId){
                return p;
            }
        }
        return null;
    }

    @Override
    public Product findInStock(String productName) {
        for(Product p: repository.findAllProducts()){
            if (p.getName().equals(productName)){
                return p;
            }
        }
        return null;
    }
}
