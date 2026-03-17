package bw.bocra.ironclad_backend.domain;

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
@Table(name = "domain_records")
public class DomainRecord {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      @Column(unique = true, nullable = false)
      private String domainName;

      @Column(nullable = false)
      private String registrantName;

      @Column(nullable = false)
      private String registrantEmail;

      @Column(nullable = false)
      private String registrantPhone;

      @Column(nullable = false)
      private String registrar;

      @Enumerated(EnumType.STRING)
      @Column(nullable = false)
      private DomainStatus status;

      @Column(nullable = false)
      private LocalDate registrationDate;

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
            status = DomainStatus.ACTIVE;
      }

      @PreUpdate
      public void preUpdate() {
            updatedAt = LocalDateTime.now();
      }
}