package org.tasmanijskidjavo.builder;

import org.tasmanijskidjavo.builder.util.HeaderRequestBuilderComponent;
import org.tasmanijskidjavo.builder.util.HttpMethod;

public class RequestBuilder<T> {

    private HttpMethod method;

    private T body;

    private HttpHeaders headers;

    public HeaderRequestBuilderComponent headers() {
        return new HeaderRequestBuilderComponent(this);
    }

    public RequestBuilder headers(HeadersBuilder headersBuilder) {
        this.headers = headersBuilder.build();
        return this;
    }

    public RequestBuilder method(HttpMethod method) {
        this.method = method;
        return this;
    }

    public RequestBuilder body(T body) {
        this.body = body;
        return this;
    }

    public Request<T> build() {
        return new Request<>(method, headers, body);
    }
}
