package rzeszow.gitaliano.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import rzeszow.gitaliano.dao.CountryRepository;
import rzeszow.gitaliano.entity.Country;
import rzeszow.gitaliano.service.CountryService;

import java.util.List;

/**
 * Created by roma-pc on 25.10.16.
 */
public class CountryServiceImplementation implements CountryService {
    @Autowired
    CountryRepository countryRepository;

    public Country addCountry(Country country) {
       return countryRepository.saveAndFlush(country);
    }

    public void delete(long id) {
        countryRepository.delete(id);
    }

    public Country updateCountry(Country country) {
        return countryRepository.saveAndFlush(country);
    }

    public Country findByName(String name) {
        return countryRepository.findByName(name);
    }

    public List<Country> getAll() {
        return countryRepository.findAll();
    }
}
