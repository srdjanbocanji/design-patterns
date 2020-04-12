package org.tasmanijskidjavo.specification.util;

import org.tasmanijskidjavo.specification.Specification;

/**
 * Or specification.
 *
 * Specification is satisfied if either left or right specification is satisfied.
 *
 * @param <T> type
 * @author sbocanji
 */
public class OrSpecification<T> implements Specification<T> {

    private Specification<T> left;

    private Specification<T> right;

    public OrSpecification(Specification<T> left, Specification<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(T object) {
        return left.isSatisfiedBy(object) || right.isSatisfiedBy(object);
    }
}
