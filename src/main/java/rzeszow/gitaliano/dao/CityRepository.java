package rzeszow.gitaliano.dao;


import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import rzeszow.gitaliano.entity.City;

/**
 * Created by kobeb on 23.10.2016.
 */
public interface CityRepository extends JpaRepository<City,Long> {

    @Query("select c from City c where c = :name ")
    City findByName(@Param("name") String Name);


}
