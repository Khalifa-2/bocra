package bw.bocra.ironclad_backend.admin;

import bw.bocra.ironclad_backend.complaint.ComplaintRepository;
import bw.bocra.ironclad_backend.complaint.ComplaintStatus;
import bw.bocra.ironclad_backend.domain.DomainRepository;
import bw.bocra.ironclad_backend.domain.DomainStatus;
import bw.bocra.ironclad_backend.license.LicenseRepository;
import bw.bocra.ironclad_backend.license.LicenseStatus;
import bw.bocra.ironclad_backend.publication.PublicationRepository;
import bw.bocra.ironclad_backend.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {

      private final ComplaintRepository complaintRepository;
      private final LicenseRepository licenseRepository;
      private final PublicationRepository publicationRepository;
      private final DomainRepository domainRepository;
      private final UserRepository userRepository;

      public AdminStatsResponse getStats() {
            return AdminStatsResponse.builder()
                        // Complaints
                        .totalComplaints(complaintRepository.count())
                        .complaintsSubmitted(complaintRepository.countByStatus(ComplaintStatus.SUBMITTED))
                        .complaintsUnderReview(complaintRepository.countByStatus(ComplaintStatus.UNDER_REVIEW))
                        .complaintsInProgress(complaintRepository.countByStatus(ComplaintStatus.IN_PROGRESS))
                        .complaintsResolved(complaintRepository.countByStatus(ComplaintStatus.RESOLVED))
                        .complaintsClosed(complaintRepository.countByStatus(ComplaintStatus.CLOSED))
                        // Licenses
                        .totalLicenses(licenseRepository.count())
                        .licensesPending(licenseRepository.countByStatus(LicenseStatus.PENDING))
                        .licensesActive(licenseRepository.countByStatus(LicenseStatus.ACTIVE))
                        .licensesSuspended(licenseRepository.countByStatus(LicenseStatus.SUSPENDED))
                        .licensesExpired(licenseRepository.countByStatus(LicenseStatus.EXPIRED))
                        .licensesRevoked(licenseRepository.countByStatus(LicenseStatus.REVOKED))
                        // Publications
                        .totalPublications(publicationRepository.count())
                        // Domains
                        .totalDomains(domainRepository.count())
                        .domainsActive(domainRepository.countByStatus(DomainStatus.ACTIVE))
                        .domainsExpired(domainRepository.countByStatus(DomainStatus.EXPIRED))
                        .domainsSuspended(domainRepository.countByStatus(DomainStatus.SUSPENDED))
                        // Users
                        .totalUsers(userRepository.count())
                        .build();
      }
}