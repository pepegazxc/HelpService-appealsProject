package help.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Help {

    @GetMapping("/info")
    public String info() {
        return "You are in the help service!";
    }
}
