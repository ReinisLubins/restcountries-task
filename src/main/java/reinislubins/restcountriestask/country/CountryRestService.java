package reinislubins.restcountriestask.country;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CountryRestService {
    private final RestTemplate restTemplate;
    Logger logger = LoggerFactory.getLogger(CountryRestService.class);

    public CountryRestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Country[] getCountries() {
        String url = "https://restcountries.com/v2/regionalbloc/eu";
        Country[] countries = new Country[0];
        try {
            ResponseEntity<Country[]> response = restTemplate.getForEntity(url, Country[].class);
            if (response.getBody() != null) {
                countries = response.getBody();
            }
        } catch (Exception e) {
            logger.error("Could not retrieve countries", e);
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE);
        }
        return countries;
    }
}
