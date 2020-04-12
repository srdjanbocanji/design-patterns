package org.tasmanijskidjavo.strategy;

public class SnakeCaseStrategyImpl implements PropertySerializationStrategy {

    private static final char SEPARATOR = '_';

    @Override
    public String parseProperty(String property) {
        StringBuilder sb = new StringBuilder();
        for(char character : property.toCharArray()) {
            if(Character.isUpperCase(character)) {
                sb.append(SEPARATOR).append(Character.toLowerCase(character));
            } else {
                sb.append(character);
            }
        }
        return sb.toString();
    }
}
