package bw.bocra.ironclad_backend.license;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LicenseService {

      private final LicenseRepository licenseRepository;

      public LicenseResponse applyForLicense(LicenseRequest request) {
            String licenseNumber = generateLicenseNumber(request.getLicenseType());

            License license = License.builder()
                        .licenseNumber(licenseNumber)
                        .holderName(request.getHolderName())
                        .holderEmail(request.getHolderEmail())
                        .holderPhone(request.getHolderPhone())
                        .licenseType(request.getLicenseType())
                        .issueDate(request.getIssueDate())
                        .expiryDate(request.getExpiryDate())
                        .build();

            License saved = licenseRepository.save(license);
            return mapToResponse(saved);
      }

      public LicenseResponse getLicenseByNumber(String licenseNumber) {
            License license = licenseRepository
                        .findByLicenseNumber(licenseNumber)
                        .orElseThrow(() -> new RuntimeException(
                                    "No license found with number: " + licenseNumber));
            return mapToResponse(license);
      }

      public List<LicenseResponse> getAllLicenses() {
            return licenseRepository.findAll()
                        .stream()
                        .map(this::mapToResponse)
                        .collect(Collectors.toList());
      }

      public List<LicenseResponse> getLicensesByStatus(LicenseStatus status) {
            return licenseRepository.findByStatus(status)
                        .stream()
                        .map(this::mapToResponse)
                        .collect(Collectors.toList());
      }

      public List<LicenseResponse> getLicensesByType(String licenseType) {
            return licenseRepository.findByLicenseType(licenseType)
                        .stream()
                        .map(this::mapToResponse)
                        .collect(Collectors.toList());
      }

      public LicenseResponse updateLicenseStatus(String licenseNumber, LicenseStatus newStatus) {
            License license = licenseRepository
                        .findByLicenseNumber(licenseNumber)
                        .orElseThrow(() -> new RuntimeException(
                                    "No license found with number: " + licenseNumber));
            license.setStatus(newStatus);
            License updated = licenseRepository.save(license);
            return mapToResponse(updated);
      }

      private String generateLicenseNumber(String licenseType) {
            String prefix = licenseType.substring(0, Math.min(3, licenseType.length())).toUpperCase();
            String datePart = LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("yyyyMMdd"));
            String randomPart = String.format("%04d", new Random().nextInt(9999));
            return "BOCRA-" + prefix + "-" + datePart + "-" + randomPart;
      }

      private LicenseResponse mapToResponse(License license) {
            return LicenseResponse.builder()
                        .id(license.getId())
                        .licenseNumber(license.getLicenseNumber())
                        .holderName(license.getHolderName())
                        .holderEmail(license.getHolderEmail())
                        .holderPhone(license.getHolderPhone())
                        .licenseType(license.getLicenseType())
                        .status(license.getStatus().name())
                        .issueDate(license.getIssueDate())
                        .expiryDate(license.getExpiryDate())
                        .createdAt(license.getCreatedAt())
                        .updatedAt(license.getUpdatedAt())
                        .build();
      }
}