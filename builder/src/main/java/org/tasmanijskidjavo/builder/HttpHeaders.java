package org.tasmanijskidjavo.builder;

import java.util.HashSet;
import java.util.Set;

public class HttpHeaders {

    private final Set<Header> headers = new HashSet<>();

    public HttpHeaders() {

    }

    public HttpHeaders(Set<Header> headers) {
        this.headers.addAll(headers);
    }

    public void addHeader(String key, String value) {
        if(key == null || value == null) {
            throw new IllegalArgumentException("org.tasmanijskidjavo.builder.Header key or value must not be null!");
        }
        this.headers.add(new Header(key, value));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        headers.forEach(header -> {
            sb.append(header.toString());
            sb.append("\n");
        });
        return sb.toString();
    }
}
