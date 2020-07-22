package sharaeva.restservices.Services;

import org.springframework.web.bind.annotation.RequestParam;

public interface MonthsService {
    String getMonthNameByNumber(int monthNumber);
}
