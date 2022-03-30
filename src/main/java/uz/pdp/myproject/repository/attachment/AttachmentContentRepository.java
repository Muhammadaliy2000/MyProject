package uz.pdp.myproject.repository.attachment;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.myproject.entity.attachment.AttachmentContentEntity;
import uz.pdp.myproject.entity.input.InputEntity;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContentEntity, Long> {
}
