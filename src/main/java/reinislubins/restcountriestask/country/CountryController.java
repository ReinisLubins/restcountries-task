package reinislubins.restcountriestask.country;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/getBiggestPopulation")
    public List<Country> getBiggestPopulation() {
        return countryService.getBiggestPopulation();
    }

    @GetMapping("/getBiggestArea")
    public List<Country> getBiggestArea() {
        return countryService.getBiggestArea();
    }

    @GetMapping("/getBiggestDensity")
    public List<Country> getBiggestDensity() {
        return countryService.getBiggestDensity();
    }
}
