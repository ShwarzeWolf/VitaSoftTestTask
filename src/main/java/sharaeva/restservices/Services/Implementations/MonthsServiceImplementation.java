package sharaeva.restservices.Services.Implementations;

import sharaeva.restservices.Month;
import sharaeva.restservices.Services.MonthsService;

public class MonthsServiceImplementation implements MonthsService {

    @Override
    public String getMonthName(int monthNumber) {
        String ERROR_STRING = "\"INCORRECT INPUT DATA\"";

        if (monthNumber > 12 || monthNumber < 1)
            return ERROR_STRING;
        else {
            assert getMonthNameByNumber(monthNumber) != null;
            return formatString(getMonthNameByNumber(monthNumber).getRussianName());
        }
    }

    private String formatString(String stringToFormat){
        stringToFormat = stringToFormat.replaceAll("(.)", "$1-");
        stringToFormat = stringToFormat.substring(0, stringToFormat.length() - 1);
        return "\"".concat(stringToFormat).concat("\"");
    }

    private Month getMonthNameByNumber(int monthNumber) {
        switch(monthNumber){
            case 1: return Month.JANUARY;
            case 2: return Month.FEBRUARY;
            case 3: return Month.MARCH;
            case 4: return Month.APRIL;
            case 5: return Month.MAY;
            case 6: return Month.JUNE;
            case 7: return Month.JULI;
            case 8: return Month.AUGUST;
            case 9: return Month.SEPTEMBER;
            case 10: return Month.OCTOBER;
            case 11: return Month.NOVEMBER;
            case 12: return Month.DECEMBER;
            default: return null;
        }
    }
}
