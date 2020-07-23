package sharaeva.restservices.controllers;

import org.springframework.web.bind.annotation.*;
import sharaeva.restservices.Services.Implementations.TextServiceImplementation;
import sharaeva.restservices.Services.TextService;

import java.util.Collection;

@RestController
public class TextController {

    private final TextService textService = new TextServiceImplementation();

    @PostMapping(value = "/text", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    Collection<String> postText(@RequestBody Collection<String> text) {
        return textService.proceedText(text);
    }

}
