package org.tasmanijskidjavo.specification;

import org.tasmanijskidjavo.specification.dao.InMemoryProductDao;
import org.tasmanijskidjavo.specification.dao.ProductDao;
import org.tasmanijskidjavo.specification.model.Product;

import java.util.List;

/**
 * Main class of application.
 *
 * @author sbocanji
 */
public class Main {

    public static void main(String[] args) {
        ProductDao productDao = new InMemoryProductDao();
        Specification<Product> specification = Specification.where(ProductSpecifications.priceGreaterThanOrEqual(20L))
                .and(ProductSpecifications.quantityGreaterThan(4L));

        List<Product> products = productDao.findAll(specification);
        products.forEach(product -> System.out.println(product.getTitle()));
    }
}
