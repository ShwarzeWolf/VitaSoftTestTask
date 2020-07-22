package sharaeva.restservices.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

@RestController
public class TextController {

    @PostMapping("/text")
    public Collection<String> proceedText() {
        ArrayList<String> text = new ArrayList<>();

        text.add("First String");
        text.add("second String");
        text.add("Third String");
        text.add("FirstString1");

        return text.stream()
                .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
                .map(string -> "(".concat(String.valueOf(string.length())).concat("): ").concat(string))
                .collect(Collectors.toList());
    }

}
