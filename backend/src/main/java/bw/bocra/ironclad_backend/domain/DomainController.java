package bw.bocra.ironclad_backend.domain;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/domains")
@RequiredArgsConstructor
public class DomainController {

      private final DomainService domainService;

      @PostMapping("/register")
      public ResponseEntity<DomainResponse> registerDomain(
                  @Valid @RequestBody DomainRequest request) {
            return ResponseEntity.ok(domainService.registerDomain(request));
      }

      @GetMapping("/lookup/{domainName}")
      public ResponseEntity<DomainResponse> lookupDomain(
                  @PathVariable String domainName) {
            return ResponseEntity.ok(domainService.lookupDomain(domainName));
      }

      @GetMapping("/all")
      public ResponseEntity<List<DomainResponse>> getAllDomains() {
            return ResponseEntity.ok(domainService.getAllDomains());
      }

      @GetMapping("/by-status")
      public ResponseEntity<List<DomainResponse>> getByStatus(
                  @RequestParam DomainStatus status) {
            return ResponseEntity.ok(domainService.getDomainsByStatus(status));
      }

      @PutMapping("/{domainName}/status")
      public ResponseEntity<DomainResponse> updateStatus(
                  @PathVariable String domainName,
                  @RequestParam DomainStatus status) {
            return ResponseEntity.ok(domainService.updateDomainStatus(domainName, status));
      }
}