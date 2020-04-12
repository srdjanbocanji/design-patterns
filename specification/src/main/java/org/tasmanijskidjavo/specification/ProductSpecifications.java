package org.tasmanijskidjavo.specification;

import org.tasmanijskidjavo.specification.model.Product;

/**
 * Product specifications.
 *
 * Groups collection of specifications related to product entity.
 *
 * @author sbocanji
 */
public class ProductSpecifications {

    public static Specification<Product> priceGreaterThanOrEqual(Long price) {
        return (product) -> product.getPrice() >= price;
    }

    public static Specification<Product> priceLessThanOrEqual(Long price) {
        return (product) -> product.getPrice() <= price;
    }

    public static Specification<Product> quantityGreaterThan(Long quantity) {
        return (product) -> product.getQuantity() > quantity;
    }
}
