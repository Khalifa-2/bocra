package bw.bocra.ironclad_backend.license;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/licenses")
@RequiredArgsConstructor
public class LicenseController {

      private final LicenseService licenseService;

      @PostMapping("/apply")
      public ResponseEntity<LicenseResponse> applyForLicense(
                  @Valid @RequestBody LicenseRequest request) {
            return ResponseEntity.ok(licenseService.applyForLicense(request));
      }

      @GetMapping("/{licenseNumber}")
      public ResponseEntity<LicenseResponse> getLicense(
                  @PathVariable String licenseNumber) {
            return ResponseEntity.ok(licenseService.getLicenseByNumber(licenseNumber));
      }

      @GetMapping("/all")
      public ResponseEntity<List<LicenseResponse>> getAllLicenses() {
            return ResponseEntity.ok(licenseService.getAllLicenses());
      }

      @GetMapping("/by-status")
      public ResponseEntity<List<LicenseResponse>> getByStatus(
                  @RequestParam LicenseStatus status) {
            return ResponseEntity.ok(licenseService.getLicensesByStatus(status));
      }

      @GetMapping("/by-type")
      public ResponseEntity<List<LicenseResponse>> getByType(
                  @RequestParam String licenseType) {
            return ResponseEntity.ok(licenseService.getLicensesByType(licenseType));
      }

      @PutMapping("/{licenseNumber}/status")
      public ResponseEntity<LicenseResponse> updateStatus(
                  @PathVariable String licenseNumber,
                  @RequestParam LicenseStatus status) {
            return ResponseEntity.ok(licenseService.updateLicenseStatus(licenseNumber, status));
      }
}