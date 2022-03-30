package uz.pdp.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.myproject.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
