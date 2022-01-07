package testgroup.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testgroup.web.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
