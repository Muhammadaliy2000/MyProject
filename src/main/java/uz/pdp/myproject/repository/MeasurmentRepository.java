package uz.pdp.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.myproject.entity.MeasurmentEntity;

public interface MeasurmentRepository extends JpaRepository<MeasurmentEntity, Long> {
    boolean existsByName(String name);
}
