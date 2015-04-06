package ru.atc.pgu.proccenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("/hello-world")
public class CounterController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

/*    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody
    Participant sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Participant(counter.incrementAndGet(), String.format(template, name));
    }*/

}
