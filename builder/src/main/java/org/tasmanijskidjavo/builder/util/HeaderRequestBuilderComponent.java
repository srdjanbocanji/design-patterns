package org.tasmanijskidjavo.builder.util;

import org.tasmanijskidjavo.builder.HeadersBuilder;
import org.tasmanijskidjavo.builder.RequestBuilder;

public class HeaderRequestBuilderComponent extends HeadersBuilder<HeaderRequestBuilderComponent> implements RequestBuilderComponent {

    private RequestBuilder requestBuilder;

    public HeaderRequestBuilderComponent(RequestBuilder requestBuilder) {
        this.requestBuilder = requestBuilder;
    }

    @Override
    public RequestBuilder and() {
        return requestBuilder.headers(this);
    }
}
