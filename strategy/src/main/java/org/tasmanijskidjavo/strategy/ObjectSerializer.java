package org.tasmanijskidjavo.strategy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectSerializer {

    private PropertySerializationStrategy propertySerializationStrategy;

    public String serialize(Object object) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Method method : object.getClass().getMethods()) {
            sb.append(propertySerializationStrategy.parseProperty(method.getName()));
            sb.append(":");

                Object o = runGetter(method, object.getClass());
                    if(o != null) {
                        if(objectIsPrimitive(o)) {
                            sb.append(o.toString());
                        }

                        else if(objectIsIterable(o)) {
                            sb.append("[");
                            for(Object element : (Iterable) o) {
                                if(objectIsPrimitive(element)) {
                                    sb.append(element.toString());
                                } else {
                                    sb.append(serialize(element));
                                }
                                sb.append(",");
                            }
                            sb.append("]");
                        }

                        else {
                            sb.append(serialize(o));
                        }

                        sb.append(",");
                    }
                }



        sb.append("}");
        return sb.toString();
    }

    public void setPropertySerializationStrategy(PropertySerializationStrategy propertySerializationStrategy) {
        this.propertySerializationStrategy = propertySerializationStrategy;
    }

    public Object runGetter(Method method, Class o) throws Exception {

            if ((method.getName().startsWith("get"))) {

                    return method.invoke(o);

            }

            return null;
    }

    public boolean objectIsPrimitive(Object o) {
        return o instanceof Long
                || o instanceof String
                || o instanceof Double
                || o instanceof Character
                || o instanceof Boolean
                || o instanceof Integer
                || o instanceof Short
                || o instanceof Float
                ;
    }

    public boolean objectIsIterable(Object o) {
        return o instanceof Iterable;
    }
}
