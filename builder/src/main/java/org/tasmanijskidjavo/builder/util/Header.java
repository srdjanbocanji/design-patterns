package org.tasmanijskidjavo.builder.util;

/**
 * Contains header key paired with its value.
 *
 * @author sbocanji
 */
public class Header {

    private final String key;

    private final String value;

    public Header(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key.concat(": ").concat(value);
    }
}
