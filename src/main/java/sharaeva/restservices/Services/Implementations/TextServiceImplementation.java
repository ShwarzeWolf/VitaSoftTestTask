package sharaeva.restservices.Services.Implementations;

import org.springframework.stereotype.Service;
import sharaeva.restservices.Services.TextService;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

@Service
public class TextServiceImplementation implements TextService {

    @Override
    public Collection<String> proceedText(Collection<String> text) {
        return text.stream()
                .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
                .map(string -> "(".concat(String.valueOf(string.length())).concat("): ").concat(string))
                .collect(Collectors.toList());
    }

}
