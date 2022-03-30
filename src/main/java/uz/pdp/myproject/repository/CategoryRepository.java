package uz.pdp.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.myproject.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
