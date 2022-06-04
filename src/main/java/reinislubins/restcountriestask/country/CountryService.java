package reinislubins.restcountriestask.country;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryService {
    private final CountryRestService countryRestService;

    public CountryService(CountryRestService countryRestService) {
        this.countryRestService = countryRestService;
    }

    public List<Country> getBiggestPopulation() {
        Country[] countries = countryRestService.getCountries();
        return Arrays.stream(countries)
                .sorted(Comparator.comparingLong(Country::getPopulation).reversed())
                .limit(10)
                .collect(Collectors.toList());
    }

    public List<Country> getBiggestArea() {
        Country[] countries = countryRestService.getCountries();
        return Arrays.stream(countries)
                .sorted(Comparator.comparingLong(Country::getArea).reversed())
                .limit(10)
                .collect(Collectors.toList());
    }

    public List<Country> getBiggestDensity() {
        Country[] countries = countryRestService.getCountries();
        return Arrays.stream(countries)
                .sorted(Comparator.comparingLong(Country::density).reversed())
                .limit(10)
                .collect(Collectors.toList());
    }
}
