package bw.bocra.ironclad_backend.complaint;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Builder
public class ComplaintResponse {

      private Long id;
      private String referenceNumber;
      private String subject;
      private String description;
      private String category;
      private String status;
      private String complainantName;
      private String complainantEmail;
      private String complainantPhone;
      private LocalDateTime createdAt;
      private LocalDateTime updatedAt;
}