package org.tasmanijskidjavo.specification.dao;

import org.tasmanijskidjavo.specification.Specification;
import org.tasmanijskidjavo.specification.model.Product;
import java.util.List;

/**
 * Product data access object.
 *
 * @author sbocanji
 */
public interface ProductDao {

    Product getById(Long id);

    List<Product> getAll();

    List<Product> findAll(Specification<Product> specification);

    Product save(Product product);

    void delete(Product product);


}
