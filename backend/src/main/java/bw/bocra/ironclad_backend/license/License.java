package bw.bocra.ironclad_backend.license;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "licenses")
public class License {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      @Column(unique = true, nullable = false)
      private String licenseNumber;

      @Column(nullable = false)
      private String holderName;

      @Column(nullable = false)
      private String holderEmail;

      @Column(nullable = false)
      private String holderPhone;

      @Column(nullable = false)
      private String licenseType;

      @Enumerated(EnumType.STRING)
      @Column(nullable = false)
      private LicenseStatus status;

      @Column(nullable = false)
      private LocalDate issueDate;

      @Column(nullable = false)
      private LocalDate expiryDate;

      @Column(name = "created_at")
      private LocalDateTime createdAt;

      @Column(name = "updated_at")
      private LocalDateTime updatedAt;

      @PrePersist
      public void prePersist() {
            createdAt = LocalDateTime.now();
            updatedAt = LocalDateTime.now();
            status = LicenseStatus.PENDING;
      }

      @PreUpdate
      public void preUpdate() {
            updatedAt = LocalDateTime.now();
      }

}