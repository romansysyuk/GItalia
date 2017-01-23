package rzeszow.gitaliano.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rzeszow.gitaliano.dao.CityRepository;
import rzeszow.gitaliano.entity.City;
import rzeszow.gitaliano.service.CityService;

import java.util.List;

/**
 * Created by roma-pc on 24.10.16.
 */
@Service
public class CityServiceImplementation implements CityService{

    @Autowired
    CityRepository cityRepository;

    public City addCity(City city) {
        return cityRepository.saveAndFlush(city);
    }

    public void delete(long id) {
        cityRepository.delete(id);

    }

    public City updateCity(City city) {
        return cityRepository.saveAndFlush(city);
    }

    public City findByName(String name) {
        return cityRepository.findByName(name);
    }

    public List<City> getAll() {
        return cityRepository.findAll();
    }
}
