package rzeszow.gitaliano.service;

import rzeszow.gitaliano.entity.City;

import java.util.List;

/**
 * Created by kobeb on 23.10.2016.
 */
public interface CityService {
    City addCity(City city);
    void delete(long id);
    City updateCity(City city);
    City findByName(String name);
    List<City> getAll();
}
