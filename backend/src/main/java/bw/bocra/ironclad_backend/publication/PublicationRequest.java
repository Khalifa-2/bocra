package bw.bocra.ironclad_backend.publication;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PublicationRequest {

      @NotBlank(message = "Title is required")
      private String title;

      private String description;

      @NotNull(message = "Category is required")
      private PublicationCategory category;

      @NotBlank(message = "File URL is required")
      private String fileUrl;

      @NotBlank(message = "File type is required")
      private String fileType;

      @NotNull(message = "Published date is required")
      private LocalDate publishedDate;

}
