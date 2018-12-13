package com.grainger.skeleton;

import com.grainger.response.GreetingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping(value = "/greeting", produces = "application/json")
    public GreetingResponse greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
        return new GreetingResponse(counter.incrementAndGet(), name);
    }

}