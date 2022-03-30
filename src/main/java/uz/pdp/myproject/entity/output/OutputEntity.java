package uz.pdp.myproject.entity.output;

import lombok.*;
import lombok.experimental.FieldDefaults;
import uz.pdp.myproject.entity.CurrencyEntity;
import uz.pdp.myproject.entity.WarehouseEntity;
import uz.pdp.myproject.entity.deliverer.ClientEntity;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OutputEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    //    LocalDateTime createdAt = LocalDateTime.now();
    Timestamp date;
    @ManyToOne
    WarehouseEntity wareHouseEntity;
    @ManyToOne
    ClientEntity clientEntity;
    @ManyToOne
    CurrencyEntity currencyEntity;

    int factureNumber;
    @Column(unique = true, nullable = false)
    String uniqueCode;

}
