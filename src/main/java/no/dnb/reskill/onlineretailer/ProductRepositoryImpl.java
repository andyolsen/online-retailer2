package no.dnb.reskill.onlineretailer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    ArrayList<Product> listOfProducts = new ArrayList<>();


    @Override
    public void addProduct(Product product) {
        listOfProducts.add(product);
        System.out.printf("Product, %s, %d, %f, added to the stock\n", product.getName(), product.getId(), product.getPrice());

    }

    @Override
    public boolean deleteProduct(int productId) {
        for (Product p: listOfProducts) {
            if (p.getId() == productId) {
                listOfProducts.remove(p);
                return true;
            }
        }
        return false;
    }

    @Override
    public Collection<Product> findAllProducts() {
        return listOfProducts;
    }
}
