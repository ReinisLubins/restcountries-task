package reinislubins.restcountriestask.country;

import java.util.Set;

public class Country {
    private String name;
    private String capital;
    private Set<Currencies> currencies;
    private long population;
    private long area;

    public Country() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Set<Currencies> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Set<Currencies> currencies) {
        this.currencies = currencies;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getArea() {
        return area;
    }

    public void setArea(long area) {
        this.area = area;
    }

    public long density() {
        if (population != 0 && area != 0) {
            return population / area;
        } else {
            return 0;
        }
    }
}
