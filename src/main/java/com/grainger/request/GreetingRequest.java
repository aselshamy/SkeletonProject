package com.grainger.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Request model to be submitted to the greeting api method")
public class GreetingRequest {

    @ApiModelProperty(example = "The name to be said hello to", position = 2, required = true)
    private String name;

    @ApiModelProperty(example = "123", position = 1, required = true)
    private long id;

    public GreetingRequest() {}

    public GreetingRequest(long id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
