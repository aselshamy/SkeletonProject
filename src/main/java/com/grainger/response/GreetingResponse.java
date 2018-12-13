package com.grainger.response;

public class GreetingResponse {
    private final long id;
    private final String hello;

    public GreetingResponse(long id, String name) {
        this.id = id;
        this.hello = String.format("Hello, %s", name);
    }

    public long getId() {
        return id;
    }

    public String getHello() {
        return hello;
    }
}
