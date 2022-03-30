package uz.pdp.myproject.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import uz.pdp.myproject.entity.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserEntity extends BaseEntity {


    @Column(nullable = false)
    String lastname;
    @Column(unique = true, nullable = false)
    String phoneNumber;
    @Column(nullable = false)
    String uniqueCode;
    @Column(nullable = false)
    String password;
    @ManyToMany
    Set<WarehouseEntity> wareHouseEntities;

}
