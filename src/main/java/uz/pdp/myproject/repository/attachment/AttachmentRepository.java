package uz.pdp.myproject.repository.attachment;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.myproject.entity.CategoryEntity;
import uz.pdp.myproject.entity.attachment.AttachmentEntity;

public interface AttachmentRepository extends JpaRepository<AttachmentEntity, Long> {
}
