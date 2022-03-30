package uz.pdp.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.myproject.entity.CategoryEntity;
import uz.pdp.myproject.entity.CurrencyEntity;

public interface CurrencyRepository extends JpaRepository<CurrencyEntity, Long> {
}
