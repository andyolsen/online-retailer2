package no.dnb.reskill.onlineretailer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    ArrayList<Product> listPfProducts = new ArrayList<>();


    @Override
    public void addProduct(Product product) {
        listPfProducts.add(product);
        System.out.printf("Product, %s, %d, %f, added to the stock\n", product.getName(), product.getId(), product.getPrice());

    }

    @Override
    public boolean deleteProduct(int productId) {
        for (Product p: listPfProducts){
            if(p.getId()==productId){
                listPfProducts.remove(p);
                System.out.printf("Product, %s, %d, %f, removed from the stock\n", p.getName(), p.getId(), p.getPrice());
                return true;
            }
        }
        return false;
    }

    @Override
    public Collection<Product> findAllProducts() {
        return listPfProducts;
    }
}
