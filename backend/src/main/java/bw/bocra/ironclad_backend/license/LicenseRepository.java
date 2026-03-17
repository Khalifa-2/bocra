package bw.bocra.ironclad_backend.license;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LicenseRepository extends JpaRepository<License, Long> {

      Optional<License> findByLicenseNumber(String licenseNumber);

      List<License> findByHolderEmail(String holderEmail);

      List<License> findByStatus(LicenseStatus status);

      List<License> findByLicenseType(String licenceType);

      Boolean existsByLicenseNumber(String licenseNumber);

      Long countByStatus(LicenseStatus status);
}
