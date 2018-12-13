package com.grainger.skeleton;

import com.grainger.response.GreetingResponse;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class GreetingControllerTest {

    private static final String SOME_NAME = "Some name";

    @Test
    public void ShouldAddUserNameToTheGreeting() {
        GreetingController greetingController = new GreetingController();
        GreetingResponse greeting = greetingController.greeting(SOME_NAME);
        assertEquals(greeting.getHello(), "Hello, Some name!");
        assertThat(greeting.getId(), is(notNullValue()));
    }

    @Test
    public void ShouldGreetNull() {
        GreetingController greetingController = new GreetingController();
        GreetingResponse greeting = greetingController.greeting(null);
        assertEquals(greeting.getHello(), "Hello, null!");
        assertThat(greeting.getId(), is(notNullValue()));
    }
}
