package org.tasmanijskidjavo.builder;

import org.tasmanijskidjavo.builder.util.HttpMethod;

public class Request<T> {

    private final HttpMethod method;

    private final HttpHeaders headers;

    private final T body;

    public Request(HttpMethod method, HttpHeaders headers, T body) {
        this.method = method;
        this.headers = headers;
        this.body = body;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public HttpHeaders getHeaders() {
        return headers;
    }

    public T getBody() {
        return body;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Method: ").append(method.name()).append("\n");
        sb.append("Request Headers \n").append(headers.toString());
        if(body != null) {
            sb.append("Body \n").append(body.toString());
        }
        return sb.toString();
    }
}
