package com.srjons.notes.app;

import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(value = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello(@PathVariable("name") String name) {
        if (StringUtils.isEmpty(name)) {
            return "Name not set";
        } else {
            return "Hello, " + name + "!";
        }
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String timeNow() {
        return "Hello, Now time is " + (LocalDateTime.now());
    }
}
