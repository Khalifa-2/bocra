package bw.bocra.ironclad_backend.complaint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, Long> {

      Optional<Complaint> findByReferenceNumber(String referenceNumber);

      List<Complaint> findByComplainantEmail(String email);

      List<Complaint> findByStatus(ComplaintStatus status);

      List<Complaint> findByCategory(String category);

      Long countByStatus(ComplaintStatus status);
}