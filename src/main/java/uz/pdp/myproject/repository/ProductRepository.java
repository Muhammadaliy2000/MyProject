package uz.pdp.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.myproject.entity.CategoryEntity;
import uz.pdp.myproject.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
