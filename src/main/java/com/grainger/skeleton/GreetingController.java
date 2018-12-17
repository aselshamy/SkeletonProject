package com.grainger.skeleton;

import com.grainger.request.GreetingRequest;
import com.grainger.response.GreetingResponse;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping(value = "/greeting", produces = "application/json")
    public GreetingResponse greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
        return new GreetingResponse(counter.incrementAndGet(), name);
    }

    @PostMapping(value = "/greetingWithRequest", produces = "application/json")
    public GreetingResponse greetingWithRequest(@RequestBody GreetingRequest request) {
        GreetingRequest.class.getCanonicalName();
        return new GreetingResponse(counter.incrementAndGet(), request.getName());
    }

}