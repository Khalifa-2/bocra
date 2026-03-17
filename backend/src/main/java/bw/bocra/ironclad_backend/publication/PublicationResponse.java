package bw.bocra.ironclad_backend.publication;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PublicationResponse {

      private Long id;
      private String title;
      private String description;
      private String category;
      private String fileUrl;
      private String fileType;
      private LocalDate publishedDate;
      private Boolean active;
      private LocalDateTime createdAt;
      private LocalDateTime updatedAt;
}
