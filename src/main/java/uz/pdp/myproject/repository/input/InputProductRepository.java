package uz.pdp.myproject.repository.input;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.myproject.entity.input.InputEntity;
import uz.pdp.myproject.entity.input.InputProductEntity;

public interface InputProductRepository extends JpaRepository<InputProductEntity, Long> {
}
