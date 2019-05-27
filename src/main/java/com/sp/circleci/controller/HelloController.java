package com.sp.circleci.controller;

import com.sp.circleci.model.MessageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {
    @GetMapping(value = "/hello", produces = "application/json")
    public Mono<MessageResponse> getHello() {
        return Mono.just(new MessageResponse("Hello Message"));
    }
}
