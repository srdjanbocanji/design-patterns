package org.tasmanijskidjavo.specification;

import org.tasmanijskidjavo.specification.util.AndSpecification;
import org.tasmanijskidjavo.specification.util.NullSpecification;
import org.tasmanijskidjavo.specification.util.OrSpecification;

/**
 * Specification interface.
 *
 * Used to determinate whether specification is is satisfied by given criteria or not.
 *
 * @param <T> type
 * @author sbocanji
 */
public interface Specification<T> {

    boolean isSatisfiedBy(T object);

    static <T> Specification<T> where(Specification<T> specification) {
       if(specification == null) {
           return new NullSpecification<>();
       } else {
           return specification;
       }
    }

    /**
     * Creates new AndSpecification.
     *
     * @param specification specification
     * @return specifications
     */
    default Specification<T> and(Specification<T> specification) {
        return new AndSpecification<>(this, specification);
    }

    /**
     * Creates new OrSpecification.
     *
     * @param specification specification
     * @return specifications
     */
    default Specification<T> or(Specification<T> specification) {
        return new OrSpecification<>(this, specification);
    }



}

