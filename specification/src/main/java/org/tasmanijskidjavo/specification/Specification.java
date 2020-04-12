package org.tasmanijskidjavo.specification;

import org.tasmanijskidjavo.specification.util.Specifications;

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

    static <T> Specifications<T> where(Specification<T> specification) {
       return new Specifications<>(specification);
    }



}

