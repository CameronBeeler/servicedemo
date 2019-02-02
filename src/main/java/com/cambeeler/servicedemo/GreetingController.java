package com.cambeeler.servicedemo;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public
class GreetingController
{
    private static final String template = "Hello, %s!";
    private static final String tubule = "Who is this tubular dude, %s?";

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name)
    {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    @RequestMapping("/testingBeeler")
    public WartHog testingBeeler(@RequestParam(value="tubular", defaultValue = "gumshoe") String tubular)
    {
        return new WartHog(counter.incrementAndGet(), String.format(tubule, tubular));
    }
}
