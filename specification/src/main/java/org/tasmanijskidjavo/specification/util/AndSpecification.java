package org.tasmanijskidjavo.specification.util;

import org.tasmanijskidjavo.specification.Specification;

/**
 * And specification.
 *
 * Specification is satisfied if both left and right side of specifications are satisfied.
 *
 * @param <T> type
 * @author sbocanji
 */
public class AndSpecification<T> implements Specification<T> {

    private Specification<T> left;

    private Specification<T> right;

    public AndSpecification(Specification<T> left, Specification<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(T object) {
        return left.isSatisfiedBy(object) && right.isSatisfiedBy(object);
    }
}
