package testgroup.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import testgroup.web.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//    @Modifying
//    @Query("update User u set u.name = ?1, u.lastName = ?2, u.email = ?3 where u.id = ?4")
//    void setUserInfoById(String firstname, String lastname, Integer userId);
}
