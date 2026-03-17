package bw.bocra.ironclad_backend.publication;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "publications")
public class Publication {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      @Column(nullable = false)
      private String title;

      @Column(columnDefinition = "TEXT")
      private String description;

      @Enumerated(EnumType.STRING)
      @Column(nullable = false)
      private PublicationCategory category;

      @Column(nullable = false)
      private String fileUrl;

      @Column(nullable = false)
      private String fileType;

      @Column(nullable = false)
      private LocalDate publishedDate;

      @Column(nullable = false)
      private Boolean active;

      @Column(name = "created_At")
      private LocalDateTime createdAt;

      @Column(name = "updated_at")
      private LocalDateTime updatedAt;

      @PrePersist
      public void prePersist() {
            createdAt = LocalDateTime.now();
            updatedAt = LocalDateTime.now();
            active = true;
      }

      @PreUpdate
      public void preUpdate() {
            updatedAt = LocalDateTime.now();
      }

}
