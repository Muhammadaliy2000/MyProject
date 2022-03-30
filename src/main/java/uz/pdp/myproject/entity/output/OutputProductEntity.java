package uz.pdp.myproject.entity.output;

import lombok.*;
import lombok.experimental.FieldDefaults;
import uz.pdp.myproject.entity.input.InputEntity;
import uz.pdp.myproject.entity.ProductEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OutputProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    ProductEntity productEntity;
    @Column(nullable = false)
    Double amount;

    LocalDateTime expiryDate;
    @ManyToOne
    OutputEntity outputEntity;


}
