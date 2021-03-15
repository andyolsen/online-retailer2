package no.dnb.reskill.onlineretailer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        ProductService productService = ctx.getBean(ProductService.class);

        productService.addToStock(new Product(1,"bread", 25.5));
        productService.addToStock(new Product(2,"butter", 35.5));
        productService.addToStock(new Product(3,"milk", 15.8));

        System.out.println("Found the product: " + productService.findInStock("bread"));
        System.out.println("Found the product: " + productService.findInStock(2));

        productService.deleteFromStock(3);

    }

}
