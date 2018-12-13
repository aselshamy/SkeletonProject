package com.grainger.skeleton;

import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.when;

public class GreetingEndToEndTest {


    public void shouldReturnJsonWithGreeting() {
        when().
                get("/greeting?name=SomeName").
                then().
                statusCode(200).
                body("hello", IsEqual.equalTo("Hello, SomeName!"));
    }
}
