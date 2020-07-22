package sharaeva.restservices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonthController {

    @GetMapping("/monthInfo")
    public String getMonthNameByNumber(@RequestParam(value = "monthNumber") int monthNumber) {
        return "\"Я-Н-В-А-Р-Ь\"";
    }

}
