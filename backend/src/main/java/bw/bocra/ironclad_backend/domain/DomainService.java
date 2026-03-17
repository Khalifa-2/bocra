package bw.bocra.ironclad_backend.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DomainService {

      private final DomainRepository domainRepository;

      public DomainResponse registerDomain(DomainRequest request) {
            if (domainRepository.existsByDomainName(request.getDomainName())) {
                  throw new RuntimeException(
                              "Domain already registered: " + request.getDomainName());
            }

            DomainRecord domain = DomainRecord.builder()
                        .domainName(request.getDomainName())
                        .registrantName(request.getRegistrantName())
                        .registrantEmail(request.getRegistrantEmail())
                        .registrantPhone(request.getRegistrantPhone())
                        .registrar(request.getRegistrar())
                        .registrationDate(request.getRegistrationDate())
                        .expiryDate(request.getExpiryDate())
                        .build();

            DomainRecord saved = domainRepository.save(domain);
            return mapToResponse(saved);
      }

      public DomainResponse lookupDomain(String domainName) {
            return domainRepository.findByDomainName(domainName)
                        .map(this::mapToResponse)
                        .orElse(DomainResponse.builder()
                                    .domainName(domainName)
                                    .status(DomainStatus.AVAILABLE.name())
                                    .build());
      }

      public List<DomainResponse> getAllDomains() {
            return domainRepository.findAll()
                        .stream()
                        .map(this::mapToResponse)
                        .collect(Collectors.toList());
      }

      public List<DomainResponse> getDomainsByStatus(DomainStatus status) {
            return domainRepository.findByStatus(status)
                        .stream()
                        .map(this::mapToResponse)
                        .collect(Collectors.toList());
      }

      public DomainResponse updateDomainStatus(String domainName, DomainStatus newStatus) {
            DomainRecord domain = domainRepository
                        .findByDomainName(domainName)
                        .orElseThrow(() -> new RuntimeException(
                                    "No domain found: " + domainName));
            domain.setStatus(newStatus);
            DomainRecord updated = domainRepository.save(domain);
            return mapToResponse(updated);
      }

      private DomainResponse mapToResponse(DomainRecord domain) {
            return DomainResponse.builder()
                        .id(domain.getId())
                        .domainName(domain.getDomainName())
                        .registrantName(domain.getRegistrantName())
                        .registrantEmail(domain.getRegistrantEmail())
                        .registrantPhone(domain.getRegistrantPhone())
                        .registrar(domain.getRegistrar())
                        .status(domain.getStatus().name())
                        .registrationDate(domain.getRegistrationDate())
                        .expiryDate(domain.getExpiryDate())
                        .createdAt(domain.getCreatedAt())
                        .updatedAt(domain.getUpdatedAt())
                        .build();
      }
}