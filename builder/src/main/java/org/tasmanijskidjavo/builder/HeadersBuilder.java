package org.tasmanijskidjavo.builder;

public class HeadersBuilder {

    private HttpHeaders headers = new HttpHeaders();

    private RequestBuilder requestBuilder;

    public HeadersBuilder() {

    }

    public HeadersBuilder(RequestBuilder requestBuilder) {
        this.requestBuilder = requestBuilder;
    }

    public HeadersBuilder contentType(String contentType) {
        headers.addHeader("Content-Type", contentType);
        return this;
    }

    public HeadersBuilder accept(String accept) {
        headers.addHeader("Accept", accept);
        return this;
    }

    public HeadersBuilder cookie(String cookies) {
        this.headers.addHeader("Cookie", cookies);
        return this;
    }

    public HeadersBuilder userAgent(String userAgent) {
        this.headers.addHeader("User-Agent", userAgent);
        return this;
    }

    public HeadersBuilder header(String key, String value) {
        this.headers.addHeader(key, value);
        return this;
    }

    public HttpHeaders build() {
        return headers;
    }

    public RequestBuilder and() {
        if(requestBuilder == null) {
            throw new IllegalArgumentException();
        }
        return requestBuilder.headers(this);
    }

}
