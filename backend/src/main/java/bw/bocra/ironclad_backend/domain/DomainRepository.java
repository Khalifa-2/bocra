package bw.bocra.ironclad_backend.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomainRepository extends JpaRepository<DomainRecord, Long> {

      Optional<DomainRecord> findByDomainName(String domainName);

      List<DomainRecord> findByRegistrantEmail(String registrantEmail);

      List<DomainRecord> findByStatus(DomainStatus status);

      Boolean existsByDomainName(String domainName);

      Long countByStatus(DomainStatus status);

}
