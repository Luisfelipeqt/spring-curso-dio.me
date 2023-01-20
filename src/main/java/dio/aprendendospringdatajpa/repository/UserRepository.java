package dio.aprendendospringdatajpa.repository;

import dio.aprendendospringdatajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
