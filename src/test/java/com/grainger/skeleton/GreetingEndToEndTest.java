package com.grainger.skeleton;

import org.hamcrest.core.IsEqual;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.when;

@Ignore
public class GreetingEndToEndTest {

    @Test
    @Disabled
    public void shouldReturnJsonWithGreeting() {
        when().
                get("/greeting?name=SomeName").
                then().
                statusCode(200).
                body("hello", IsEqual.equalTo("Hello, SomeName!"));
    }
}
