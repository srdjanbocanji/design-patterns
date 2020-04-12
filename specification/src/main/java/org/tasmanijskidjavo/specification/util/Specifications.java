package org.tasmanijskidjavo.specification.util;

import org.tasmanijskidjavo.specification.Specification;

/**
 * Groups collection of specification into single specification object.
 *
 * @param <T>
 */
public class Specifications<T> implements Specification<T> {

    private Specification<T> specification;

    public Specifications(Specification<T> specification) {
        this.specification = specification;
    }

    /**
     * Creates new AndSpecification.
     *
     * @param specification specification
     * @return specifications
     */
    public Specifications<T> and(Specification<T> specification) {
        return new Specifications<>(new AndSpecification<>(this.specification, specification));
    }

    /**
     * Creates new OrSpecification.
     *
     * @param specification specification
     * @return specifications
     */
    public Specifications<T> or(Specification<T> specification) {
        return new Specifications<>(new OrSpecification<>(this.specification, specification));
    }

    @Override
    public boolean isSatisfiedBy(T object) {
        return specification.isSatisfiedBy(object);
    }
}
