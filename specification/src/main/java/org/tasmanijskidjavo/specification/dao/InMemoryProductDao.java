package org.tasmanijskidjavo.specification.dao;

import org.tasmanijskidjavo.specification.Specification;
import org.tasmanijskidjavo.specification.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 * In-memory implmenetation of Product DAO.
 *
 * @author sbocanji
 */
public class InMemoryProductDao implements ProductDao {

    private static final Map<Long, Product> products = new HashMap<>();

    private static long nextId = 1;

    static {
        initializeProducts();
    }

    @Override
    public Product getById(Long id) {
        return products.get(id);
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product save(Product product) {
        if(products.get(product.getId()) == null) {
            product.setId(nextId);
            products.put(nextId++, product);
        } else {
            products.replace(product.getId(), product);
        }
        return product;
    }

    @Override
    public void delete(Product product) {
        if(product.getId() != null) {
            products.remove(product.getId());
        }
    }

    @Override
    public List<Product> findAll(Specification<Product> specification) {
        return products.values().stream().filter(specification::isSatisfiedBy).collect(Collectors.toList());
    }

    private static void initializeProducts() {
        for(int i=1;i<=10;i++) {
            Product product = new Product();
            product.setId(nextId);
            product.setPrice(ThreadLocalRandom.current().nextLong(10, 101));
            product.setQuantity(ThreadLocalRandom.current().nextLong(1, 11));
            product.setSku("PRODUCT" + i + "_SKU");
            product.setTitle("Product " + i);
            products.put(nextId++, product);

        }
    }

}
