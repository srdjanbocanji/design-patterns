package org.tasmanijskidjavo.builder;

public class RequestBuilder<T> {

    private HttpMethod method;

    private T body;

    private HttpHeaders headers;

    public HeadersBuilder headers() {
        return new HeadersBuilder(this);
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