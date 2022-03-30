package uz.pdp.myproject.entity.attachment;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@MappedSuperclass
public class AttachmentContentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    byte[] bytes;

    boolean isActive;

    @OneToOne
    AttachmentEntity attachmentEntity;

}
