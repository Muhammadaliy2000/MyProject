package uz.pdp.myproject.repository.deliverer;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.myproject.entity.deliverer.SupplierEntity;

public interface SupplierRepository extends JpaRepository<SupplierEntity, Long> {
}
