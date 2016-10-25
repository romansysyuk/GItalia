package rzeszow.gitaliano.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import rzeszow.gitaliano.entity.Country;

/**
 * Created by kobeb on 23.10.2016.
 */
public interface CountryRepository extends JpaRepository<Country, Long>{
    @Query("select c from Country c where c =:name")
    Country findByName(@Param("name")String name);
}
