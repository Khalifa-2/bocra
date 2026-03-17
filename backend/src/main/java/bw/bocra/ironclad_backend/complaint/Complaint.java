package bw.bocra.ironclad_backend.complaint;

import java.time.LocalDateTime;

import bw.bocra.ironclad_backend.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "complaints")
public class Complaint {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      @Column(unique = true, nullable = false)
      private String referenceNumber;

      @Column(nullable = false)
      private String subject;

      @Column(nullable = false, columnDefinition = "TEXT")
      private String description;

      @Column(nullable = false)
      private String category;

      @Enumerated(EnumType.STRING)
      @Column(nullable = false)
      private ComplaintStatus status;

      @Column(nullable = false)
      private String complainantName;

      @Column(nullable = false)
      private String complainantEmail;

      @Column(nullable = false)
      private String complainantPhone;

      @ManyToOne(fetch = FetchType.LAZY)
      @JoinColumn(name = "user_id")
      private User user;

      @Column(name = "created_at")
      private LocalDateTime createdAt;

      @Column(name = "updated_at")
      private LocalDateTime updatedAt;

      @PrePersist
      public void prePersist() {
            createdAt = LocalDateTime.now();
            updatedAt = LocalDateTime.now();
            status = ComplaintStatus.SUBMITTED;
      }

      @PreUpdate
      public void preUpdate() {
            updatedAt = LocalDateTime.now();
      }
}
