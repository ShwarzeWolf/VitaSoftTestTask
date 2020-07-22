package sharaeva.restservices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sharaeva.restservices.Services.Implementations.MonthsServiceImplementation;
import sharaeva.restservices.Services.MonthsService;

@RestController
public class MonthController {

    private final MonthsService monthsService = new MonthsServiceImplementation();

    @GetMapping("/monthInfo")
    public String getMonthNameByNumber(@RequestParam(value = "monthNumber") int monthNumber) {
        return monthsService.getMonthNameByNumber(monthNumber);
    }

}
