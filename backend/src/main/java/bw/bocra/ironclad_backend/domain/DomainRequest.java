package bw.bocra.ironclad_backend.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.time.LocalDate;

@Data
public class DomainRequest {

      @NotBlank(message = "Domain name is required")
      private String domainName;

      @NotBlank(message = "Registrant name is required")
      private String registrantName;

      @NotBlank(message = "Registrant email is required")
      @Email(message = "Invalid email format")
      private String registrantEmail;

      @NotBlank(message = "Registrant phone is required")
      private String registrantPhone;

      @NotBlank(message = "Registrar is required")
      private String registrar;

      @NotNull(message = "Registration date is required")
      private LocalDate registrationDate;

      @NotNull(message = "Expiry date is required")
      private LocalDate expiryDate;
}