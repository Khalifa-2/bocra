package bw.bocra.ironclad_backend.complaint;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ComplaintRequest {

      @NotBlank(message = "Subject is required")
      private String subject;

      @NotBlank(message = "Description is required")
      private String description;

      @NotBlank(message = "Category is required")
      private String category;

      @NotBlank(message = "Name is required")
      private String complainantName;

      @NotBlank(message = "Email is required")
      @Email(message = "Invalid email format")
      private String complainantEmail;

      @NotBlank(message = "Phone number is required")
      private String complainantPhone;
}
