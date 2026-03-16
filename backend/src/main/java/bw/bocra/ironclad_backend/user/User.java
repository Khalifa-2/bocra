package bw.bocra.ironclad_backend.user;

import java.time.LocalDateTime;

import javax.management.relation.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
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
@Table(name = "users")
public class User {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private long id;

      @Column(unique = true, nullable = false)
      private String email;

      @Column(nullable = false)
      private String password;

      @Column(nullable = false)
      private String name;

      @Enumerated(EnumType.STRING)
      @Column(nullable = false)
      private UserRole role;

      @Column(name = "created_at")
      private LocalDateTime createdAt;

      @PrePersist
      public void prePersist() {
            createdAt = LocalDateTime.now();
      }
}
