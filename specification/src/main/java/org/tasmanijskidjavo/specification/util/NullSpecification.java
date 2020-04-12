package org.tasmanijskidjavo.specification.util;

import org.tasmanijskidjavo.specification.Specification;

public class NullSpecification<T> implements Specification<T> {

    @Override
    public boolean isSatisfiedBy(T object) {
        return true;
    }
}
