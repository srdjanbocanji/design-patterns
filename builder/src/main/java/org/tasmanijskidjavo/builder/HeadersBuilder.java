package org.tasmanijskidjavo.builder;

@SuppressWarnings("unchecked")
public class HeadersBuilder<SELF extends HeadersBuilder<SELF>> {

    private HttpHeaders headers = new HttpHeaders();

    public SELF contentType(String contentType) {
        headers.addHeader("Content-Type", contentType);
        return (SELF) this;
    }

    public SELF accept(String accept) {
        headers.addHeader("Accept", accept);
        return (SELF) this;

    }

    public SELF cookie(String cookies) {
        this.headers.addHeader("Cookie", cookies);
        return (SELF) this;

    }

    public SELF userAgent(String userAgent) {
        this.headers.addHeader("User-Agent", userAgent);
        return (SELF) this;
    }

    public SELF header(String key, String value) {
        this.headers.addHeader(key, value);
        return (SELF) this;
    }

    public HttpHeaders build() {
        return headers;
    }

}
