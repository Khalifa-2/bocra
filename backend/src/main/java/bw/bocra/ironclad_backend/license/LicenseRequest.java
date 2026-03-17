package bw.bocra.ironclad_backend.license;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LicenseRequest {

      @NotBlank(message = "HolderName is required")
      private String holderName;

      @NotBlank(message = "Email is required")
      @Email(message = "Invalid email format")
      private String holderEmail;

      @NotBlank(message = "Phone number is required")
      private String holderPhone;

      @NotBlank(message = "License Type is required")
      private String licenseType;

      @NotNull(message = "Issue date is required")
      private LocalDate issueDate;

      @NotNull(message = "Expiry date is required")
      private LocalDate expiryDate;

}
