package uz.pdp.myproject.repository.output;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.myproject.entity.input.InputEntity;
import uz.pdp.myproject.entity.output.OutputProductEntity;

public interface OutputProductRepository extends JpaRepository<OutputProductEntity, Long> {
}
