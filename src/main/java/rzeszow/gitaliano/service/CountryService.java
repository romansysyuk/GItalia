package rzeszow.gitaliano.service;

import rzeszow.gitaliano.entity.Country;

import java.util.List;

/**
 * Created by kobeb on 23.10.2016.
 */
public interface CountryService {
    Country addCountry(Country country);
    void delete(long id);
    Country updateCountry(Country country);
    Country findByName(String name);
    List<Country> getAll();
}
