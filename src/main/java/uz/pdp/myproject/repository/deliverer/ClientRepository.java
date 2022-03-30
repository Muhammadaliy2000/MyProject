package uz.pdp.myproject.repository.deliverer;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.myproject.entity.deliverer.ClientEntity;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
}
