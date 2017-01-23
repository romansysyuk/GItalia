package rzeszow.gitaliano.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rzeszow.gitaliano.entity.City;
import rzeszow.gitaliano.entity.User;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.util.List;

/**
 * Created by kobeb on 23.10.2016.
 */

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select n from User n where n.firstName = : name")
    List<User> findByName(@Param("name") String name);

    @Query("select c from User c where c.city = :city")
    List<User> findByCity(@Param("city") City city);






}
