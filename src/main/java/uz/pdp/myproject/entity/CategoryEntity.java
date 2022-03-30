package uz.pdp.myproject.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import uz.pdp.myproject.entity.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class CategoryEntity extends BaseEntity {

    @ManyToOne
    CategoryEntity parentCategoryEntity;

}
