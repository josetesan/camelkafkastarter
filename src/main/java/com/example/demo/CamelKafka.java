package com.example.demo;

import org.apache.camel.builder.endpoint.EndpointRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelKafka extends EndpointRouteBuilder {

    @Override
    public void configure() throws Exception {
        from(file("/tmp/hello.groovy")
            .advanced()
            .synchronous(false))
        .to(kafka("mytopic"));
    }
}
