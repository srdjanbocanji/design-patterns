package org.tasmanijskidjavo.builder;

import org.tasmanijskidjavo.builder.util.HttpMethod;

public class Main {

    public static void main(String[] args) {
        RequestBuilder<String> requestBuilder = new RequestBuilder<>();
        Request request = requestBuilder.body("This is example body")
                .method(HttpMethod.POST)
                .headers()
                .userAgent("Mozilla/5.0")
                .contentType("application/json")
                .accept("application/json")
                .and()
                .build();
        System.out.println(request);
    }
}
