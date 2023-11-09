package com.masha;

import io.micronaut.http.annotation.*;

@Controller("/micronaut-test")
public class MicronautTestController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}