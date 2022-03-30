package uz.pdp.myproject.entity;

import uz.pdp.myproject.entity.attachment.AttachmentEntity;
import uz.pdp.myproject.entity.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity

public class ProductEntity extends BaseEntity {

    @ManyToOne
    CategoryEntity categoryEntity;
    @OneToMany
    List<AttachmentEntity> attachmentEntity;
    @ManyToOne
    MeasurmentEntity measurmentEntity;
}
