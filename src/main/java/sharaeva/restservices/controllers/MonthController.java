package sharaeva.restservices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonthController {

    @GetMapping("/monthInfo")
    public String getMonthNameByNumber(@RequestParam(value = "monthNumber") int monthNumber) {
        switch(monthNumber){
            case 1: return "\"Я-Н-В-А-Р-Ь\"";
            case 2: return "\"Ф-Е-В-Р-А-Л-Ь\"";
            case 3: return "\"М-А-Р-Т\"";
            case 4: return "\"А-П-Р-Е-Л-Ь\"";
            case 5: return "\"М-А-Й\"";
            case 6: return "\"И-Ю-Н-Ь\"";
            case 7: return "\"И-Ю-Л-Ь\"";
            case 8: return "\"А-В-Г-У-С-Т\"";
            case 9: return "\"С-Е-Н-Т-Я-Б-Р-Ь\"";
            case 10: return "\"О-К-Т-Я-Б-Р-Ь\"";
            case 11: return "\"Н-О-Я-Б-Р-Ь\"";
            case 12: return "\"Д-Е-К-А-Б-Р-Ь\"";
            default: return "\"INCORRECT INPUT DATA\"";
        }
    }

}
