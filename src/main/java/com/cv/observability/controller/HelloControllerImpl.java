package com.cv.observability.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerImpl implements HelloController{

    Counter hitCounter;

    public HelloControllerImpl(MeterRegistry meterRegistry) {
        hitCounter = Counter.builder("hit_counter")
                .description("Number of hits")
                .register(meterRegistry);
    }

    @Override
    public ResponseEntity<String> sayHello(String name) {
        hitCounter.increment();
        String msg="hello "+name;
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
