package uz.pdp.myproject.repository.output;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.myproject.entity.input.InputEntity;
import uz.pdp.myproject.entity.output.OutputEntity;

public interface OutputRepository extends JpaRepository<OutputEntity, Long> {
}
