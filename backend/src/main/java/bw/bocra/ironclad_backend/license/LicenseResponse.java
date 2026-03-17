package bw.bocra.ironclad_backend.license;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LicenseResponse {

      private Long id;
      private String licenseNumber;
      private String holderName;
      private String holderEmail;
      private String holderPhone;
      private String licenseType;
      private String status;
      private LocalDate issueDate;
      private LocalDate expiryDate;
      private LocalDateTime createdAt;
      private LocalDateTime updatedAt;
}