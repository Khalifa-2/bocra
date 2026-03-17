package bw.bocra.ironclad_backend.domain;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class DomainResponse {

      private Long id;
      private String domainName;
      private String registrantName;
      private String registrantEmail;
      private String registrantPhone;
      private String registrar;
      private String status;
      private LocalDate registrationDate;
      private LocalDate expiryDate;
      private LocalDateTime createdAt;
      private LocalDateTime updatedAt;
}