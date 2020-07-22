package sharaeva.restservices.controllers;

import org.springframework.web.bind.annotation.*;
import sharaeva.restservices.Services.TextServiceImplementation;

import java.util.ArrayList;
import java.util.Collection;

@RestController
public class TextController {

    private final TextServiceImplementation textService = new TextServiceImplementation();

    @PostMapping("/text")
    public Collection<String> postText() {
        ArrayList<String> text = new ArrayList<>();

        text.add("First String");
        text.add("second String");
        text.add("Third String");
        text.add("FirstString1");

        return textService.proceedText(text);
    }

}
