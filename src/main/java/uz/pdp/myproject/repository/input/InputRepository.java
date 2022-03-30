package uz.pdp.myproject.repository.input;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.myproject.entity.CategoryEntity;
import uz.pdp.myproject.entity.input.InputEntity;

public interface InputRepository extends JpaRepository<InputEntity, Long> {
}
